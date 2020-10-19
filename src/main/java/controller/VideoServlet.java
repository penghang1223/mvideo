package controller;

import entity.Video;
import service.VideoService;
import service.impl.VideoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: Schean
 * @Date: 2020/10/19 15:44
 */

public class VideoServlet extends BaseServlet {
    VideoService videoService = new VideoServiceImpl();

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void searchVideoByTitle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        PrintWriter out = response.getWriter();
        Video video = videoService.queryVideoByValue("title", title);
        System.out.println(video);
        if (video!=null){
            out.write("查询成功");
        }else{
            out.write("未查询到结果");
        }
        out.flush();
        out.close();
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void searchVideoByCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
