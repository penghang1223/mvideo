package controller;

import entity.Advert;
import service.AdvertService;
import service.impl.AdvertServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/QueryAdvertServlet")
public class QueryAdvertServlet extends HttpServlet {
    AdvertService advertService = new AdvertServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String advertId = request.getParameter("advertId");
        Integer id = Integer.valueOf(advertId.trim());
        Advert  advert =  advertService.queryById(id);
        request.setAttribute("advert", advert);
        request.getRequestDispatcher("/bpages/upadvert.jsp").forward(request, response);



    }
}
