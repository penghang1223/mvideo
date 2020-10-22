package controller;

import com.google.gson.Gson;
import entity.Advert;
import entity.VideoType;
import service.AdvertService;
import service.VideoTypeService;
import service.impl.AdvertServiceImpl;
import service.impl.VideoTypeServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class VideoTypeServlet extends BaseServlet {
    VideoTypeService videoTypeService = new VideoTypeServiceImpl();



    /**
     * 遍历广告
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取登录对象
        VideoType videoType = (VideoType) request.getSession().getAttribute("videoType");
        //查询管理员
        request.setAttribute("videoTypes", videoTypeService.queryAllVideoType());

        //转发
        request.getRequestDispatcher("/bpages/videotype.jsp").forward(request, response);
    }

    /**
     * 获取广告信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void getVideoType(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取管理员id
        Integer id = WebUtils.parseInt(request.getParameter("id"), 0);
        //查询管理员
        VideoType videoType = videoTypeService.queryVideoTypeById(id);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(videoType);
        response.getWriter().write(jsonStr);

    }

    /**
     * 删除广告
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //获取管理员id
        Integer id = WebUtils.parseInt(request.getParameter("id"), 0);
        //删除管理员
        videoTypeService.delete(id);
        if(videoTypeService.delete(id) > -1) {
            out.print("ok");
        }
        out.flush();
        out.close();
    }

    /**
     * 添加广告
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //获取请求参数封装成manager对象
        VideoType videoType = WebUtils.copyParamToBean(request.getParameterMap(), new VideoType());
        if(videoTypeService.insert(videoType) > -1) {
            out.print("ok");
        }
        out.flush();
        out.close();
    }

    /**
     * 修改广告信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //获取请求参数封装成manager对象
        VideoType videoType = WebUtils.copyParamToBean(request.getParameterMap(), new VideoType());
        if(videoTypeService.updateType(videoType) > -1){
            out.print("ok");
        }
        out.flush();
        out.close();
    }


}
