package controller;

import entity.History;
import entity.User;
import service.HistoryService;
import service.impl.HistoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: Schean
 * @Date: 2020/10/21 11:35
 */
public class HistoryServlet extends BaseServlet {
    HistoryService historyService = new HistoryServiceImpl();

    /**
     * 添加历史记录
     * @param request 请求
     * @param response 响应
     * @throws ServletException
     * @throws IOException
     */
    protected void insertHistoryRecord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        User user = (User) request.getSession().getAttribute("user");
        Long videoId= Long.parseLong(request.getParameter("videoid"));
        System.out.println("VideoID:"+videoId);
       if ( historyService.insert(new History(user.getId(),videoId))>0){
           writer.print("success");
       }else{
           writer.print("wrong");
       }
       writer.close();

    }
}
