package controller;

import service.AdvertService;
import service.impl.AdvertServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/DeleteAdvertServlet")
public class DeleteAdvertServlet extends HttpServlet {
    AdvertService advertService = new AdvertServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("adverId");
        Integer adverid = Integer.valueOf(id.trim());
        int result =  advertService.delete(adverid);
        response.sendRedirect("AdvertServlet");
    }
}
