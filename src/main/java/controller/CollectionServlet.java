package controller;

import entity.Collection;
import entity.History;
import entity.User;
import entity.Video;
import service.CollectionService;
import service.impl.CollectionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: Schean
 * @Date: 2020/10/21 11:36
 */
public class CollectionServlet extends BaseServlet {
    CollectionService collectionService = new CollectionServiceImpl();
    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        User user = (User) request.getSession().getAttribute("user");

        Collection collection = new Collection();
        collection.setUserId(user.getId());
        if (collectionService.delete(collection) > 0) {
            writer.write("success");
        } else {
            writer.write("error");
        }
        writer.close();

    }

    protected void insertCollection(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        User user = (User) request.getSession().getAttribute("user");
        Long videoId = (Long) request.getAttribute("videoid");
        Collection collection = new Collection();
        collection.setUserId(user.getId());
        collection.setVideoId(videoId);
        if (collectionService.queryCollection(collection)==null){
            if (collectionService.insert(collection) > 0) {
                request.getRequestDispatcher(request.getRequestURL().toString()).forward(request,response);
            } else {
                writer.write("error");
            }
        }
        writer.close();

    }
}
