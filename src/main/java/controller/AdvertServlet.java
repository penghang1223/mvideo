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
@WebServlet("/AdvertServlet")
public class AdvertServlet extends HttpServlet {
    AdvertService advertService = new AdvertServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Advert> advertList = advertService.queryAll();
        request.setAttribute("advert", advertList);
        request.getRequestDispatcher("bpages/advert.jsp").forward(request, response);

    }
}
