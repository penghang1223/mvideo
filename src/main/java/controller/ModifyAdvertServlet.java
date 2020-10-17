package controller;

import entity.Advert;
import service.AdvertService;
import service.impl.AdvertServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

public class ModifyAdvertServlet extends HttpServlet {
    AdvertService advertService = new AdvertServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String advertId = request.getParameter("advert_id1").trim();
        String name = request.getParameter("advert_name1").trim();
        String url= request.getParameter("advert_url1").trim();
        String coverPic = request.getParameter("advert_coverPic1").trim();
       Integer id=Integer.valueOf(advertId);

        Advert advert = new Advert(id, name,url,coverPic);
        int result = advertService.updateAdvert(advert);
        response.sendRedirect("AdvertServlet");

    }
}
