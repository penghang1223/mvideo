package controller;

import entity.Advert;
import service.AdvertService;
import service.impl.AdvertServiceImpl;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
@WebServlet("/AddAdvertServlet")
public class AddAdvertServlet extends HttpServlet {
    AdvertService advertService = new AdvertServiceImpl();
    Advert advert = null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("advert_id");
        Integer Aid=Integer.valueOf(id);
        String name = request.getParameter("advert_name");
        String url = request.getParameter("advert_url");
        String coverPic = request.getParameter("advert_coverPic");
        advert = new Advert(Aid,name,url,coverPic);
//        goodService.addGoods(good);
//        request.getRequestDispatcher("GoodServlet");
        int result = advertService.insert(advert);
        response.sendRedirect("AdvertServlet");

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
