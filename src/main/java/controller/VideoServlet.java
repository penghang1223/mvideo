package controller;

import com.google.gson.Gson;
import entity.Video;
import service.VideoService;
import service.impl.VideoServiceImpl;
import utils.Page;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/19 15:44
 */

public class VideoServlet extends BaseServlet {
    VideoService videoService = new VideoServiceImpl();

    /**
     * 根据标题查询视频 搜索合并
     *
     * @param request 请求
     * @param response 响应
     * @throws ServletException servlet异常
     * @throws IOException IO异常
     */
    protected void searchVideos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String title = request.getParameter("search");
        String type = request.getParameter("type");
        String num0=request.getParameter("num");
        String page0=request.getParameter("pageNo");
        int num = WebUtils.parseInt(num0, 8);
        int pageNo = WebUtils.parseInt(page0,1);
        System.out.println("Title:"+title+"pageNo:"+pageNo+"num:"+num);
        PrintWriter out = response.getWriter();
        //添加到json中 并回传到请求中
        List<Video> video = videoService.queryVideoByValue(type, title,num,pageNo);
        System.out.println(video);
        if (video!=null){
            Gson gson = new Gson();
            String videoJsons = gson.toJson(video);
            out.write(videoJsons);
            request.setAttribute("counts",videoService.getCounts());
          /*  if (!"".equals(title)){
                Cookie cookie = new Cookie(title,title);
                cookie.setMaxAge(60 * 60 * 24 * 3);
                response.addCookie(cookie);
            }*/
        }else{
            out.write("empty");
        }
        out.flush();
        out.close();

    }

    /**
     * 根据类型查询视频
     * @param request 请求
     * @param response 响应
     * @throws ServletException servlet异常
     * @throws IOException IO异常
     */
    protected void page(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String title = new String(request.getParameter("search").getBytes("ISO-8859-1"), "utf-8");;
        String type = request.getParameter("type");
        //1 获取请求的参数 pageNo 和 pageSize
        int pageSize = WebUtils.parseInt(request.getParameter("pagesize"), 8);
        int pageNo = WebUtils.parseInt(request.getParameter("pageno"),1);
        System.out.println(type);
        PrintWriter out = response.getWriter();
        //2 调用GoodsService.page(pageNo，pageSize)：Page 对象
        Page<Video> page = videoService.page(type,title,pageNo,pageSize);
        //3 保存Page 对象到Request 域中
        request.setAttribute("page",page);
        //4 请求转发到pages/manager/goods_manager.jsp 页面
        request.getRequestDispatcher("/pages/video/searchpage.jsp").forward(request,response);

    }

    protected void getVideoUrl(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String url = request.getParameter("video");
        System.out.println(url);
        int num = WebUtils.parseInt(request.getParameter("num"), 8);
        int page = WebUtils.parseInt(request.getParameter("page"),1);
        PrintWriter out = response.getWriter();
        //添加到json中 并回传到请求中
        List<Video> video = videoService.queryVideoByValue("title", url,num,page);
        System.out.println(video);
        if (video!=null&&video.size()==1){
            Gson gson = new Gson();
            String videoJsons = gson.toJson(video);
            out.write(videoJsons);
        }else{
            out.write("empty");
        }
        out.flush();
        out.close();
    }

    /**
     * 根据标题查询视频
     * @param request 请求
     * @param response 响应
     * @throws ServletException servlet异常
     * @throws IOException IO异常
     */
    protected void searchVideById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String videoid = request.getParameter("videoid");
        System.out.println(videoid);
        PrintWriter out = response.getWriter();
        //添加到json中 并回传到请求中
        Video video = videoService.queryVideoById(videoid);
        System.out.println(video);
        if (video!=null){
            Gson gson = new Gson();
            String videoJsons = gson.toJson(video);
            out.write(videoJsons);
        }else{
            out.write("empty");
        }
        out.flush();
        out.close();

    }
}
