package controller;

import com.google.gson.Gson;
import entity.Video;
import service.VideoService;
import service.impl.VideoServiceImpl;

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
     * 根据标题查询视频
     * @param request 请求
     * @param response 响应
     * @throws ServletException servlet异常
     * @throws IOException IO异常
     */
    protected void searchVideoByTitle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String title = request.getParameter("search");
        System.out.println(title);
        PrintWriter out = response.getWriter();
        //添加到json中 并回传到请求中
        List<Video> videos = videoService.queryVideoByValue("title", title);
        System.out.println(videos);
        if (videos!=null){
            Gson gson = new Gson();
            String videoJsons = gson.toJson(videos);
            out.write(videoJsons);
            Cookie cookie = new Cookie(title,title);
            cookie.setMaxAge(60 * 60 * 24 * 3);
            response.addCookie(cookie);
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
    protected void searchVideoByTitleAndType(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String type = request.getParameter("search");
        System.out.println(type);
        PrintWriter out = response.getWriter();
        //添加到json中 并回传到请求中
        List<Video> videos = videoService.queryVideoByValue("type", type);
        System.out.println(videos);
        if (videos!=null){
            out.write("success");
        }else{
            out.write("empty");
        }
        out.flush();
        out.close();
    }

    protected void getVideoUrl(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String url = request.getParameter("video");
        System.out.println(url);
        PrintWriter out = response.getWriter();
        //添加到json中 并回传到请求中
        List<Video> videos = videoService.queryVideoByValue("title", url);
        System.out.println(videos);
        if (videos!=null&&videos.size()==1){
            Gson gson = new Gson();
            String videoJsons = gson.toJson(videos);
            out.write(videoJsons);
        }else{
            out.write("empty");
        }
        out.flush();
        out.close();
    }

}
