package controller;

import entity.User;
import entity.Video;
import entity.VideoType;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import service.VideoService;
import service.VideoTypeService;
import service.impl.VideoServiceImpl;
import service.impl.VideoTypeServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class UploadServlet extends BaseServlet {
    VideoTypeService videoTypeService = new VideoTypeServiceImpl();
    VideoService videoService = new VideoServiceImpl();

    /**
     * 页面入口
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询视频类型
        List<VideoType> list = videoTypeService.queryAllVideoType();
        request.setAttribute("videoTypes",list);
        //转发
        request.getRequestDispatcher("/pages/video/upload_edit.jsp").forward(request, response);

    }

    /**
     * 视频上传
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void upload(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //1 先判断上传的数据是否多段数据 （只有是多段的数据，才是文件上传的）
        if (ServletFileUpload.isMultipartContent(request)) {
            // 创建FileItemFactory 工厂实现类
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
            // 创建用于解析上传数据的工具类ServletFileUpload 类
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            servletFileUpload.setHeaderEncoding("UTF-8");
            //存放图片路径（存入数据库）
            String coverPic = null;
            String url = null;
            try {
                // 解析上传的数据，得到每一个表单项FileItem
                List<FileItem> list = servletFileUpload.parseRequest(request);
                // 循环判断，每一个表单项，是普通类型，还是上传的文件
                for (FileItem fileItem : list) {
                    if (fileItem.isFormField()) {
                        // 普通表单项
//                        System.out.println("表单项的name 属性值：" + fileItem.getFieldName());
//                        // 参数UTF-8.解决乱码问题
//                        System.out.println("表单项的value 属性值：" + fileItem.getString("UTF-8"));
                    } else {
                        // 上传的文件
//                        System.out.println("表单项的name 属性值：" + fileItem.getFieldName());
//                        System.out.println("上传的文件名：" + fileItem.getName());
                        //获取当前毫秒数，用来命名文件
                        long time = System.currentTimeMillis();
                        //上传封面图片
                        if(fileItem.getFieldName().equals("coverPic")){
                            if (!(new File("C:\\mvideo\\upload\\img").exists())) {//判断文件夹是否存在，不存在创建
                                new File("C:\\mvideo\\upload\\img").mkdirs();
                            }
                            fileItem.write(new File("C:\\mvideo\\upload\\img\\" + time + fileItem.getName()));
                            coverPic = "/img/" + time + fileItem.getName();
                        }else{//上传视频
                            if (!(new File("C:\\mvideo\\upload\\video").exists())) {//判断文件夹是否存在，不存在创建
                                new File("C:\\mvideo\\upload\\video").mkdirs();
                            }
                            fileItem.write(new File("C:\\mvideo\\upload\\video\\" + time + ".mp4"));
                            url = "/video/" + time + ".mp4";
                        }

                    }

                }
                //获取上传者id
                Long id = ((User)request.getSession().getAttribute("user")).getId();
                //添加视频
                Video video = new Video(list.get(2).getString("UTF-8"),id,Integer.parseInt(list.get(5).getString()),
                        new Date(),list.get(3).getString("UTF-8"),Integer.parseInt(list.get(4).getString()),coverPic,0,url,1);
                videoService.insert(video);
                //转发
                request.getRequestDispatcher("/").forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
