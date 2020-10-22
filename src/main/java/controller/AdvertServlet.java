package controller;

import com.google.gson.Gson;
import entity.Advert;
import entity.Manager;
import service.AdvertService;
import service.ManagerService;
import service.impl.AdvertServiceImpl;
import service.impl.ManagerServiceImpl;
import service.impl.RoleServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AdvertServlet extends BaseServlet {
    AdvertService advertService = new AdvertServiceImpl();



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
        Advert advert = (Advert) request.getSession().getAttribute("advert");
        //查询管理员
        request.setAttribute("adverts", advertService.queryAdvertList());

        //转发
        request.getRequestDispatcher("/bpages/advert.jsp").forward(request, response);
    }

    /**
     * 获取广告信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void getAdvert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取管理员id
        Long id = WebUtils.parseLong(request.getParameter("id"), 0L);
        //查询管理员
        Advert advert = advertService.queryAdvertById(id);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(advert);
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
        Long id = WebUtils.parseLong(request.getParameter("id"), 0L);
        //删除管理员
        advertService.delete(id);
        if(advertService.delete(id) > -1) {
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
        Advert advert = WebUtils.copyParamToBean(request.getParameterMap(), new Advert());
        if(advertService.insert(advert) > -1) {
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
        Advert advert = WebUtils.copyParamToBean(request.getParameterMap(), new Advert());
        if(advertService.updateAdvert(advert) > -1){
            out.print("ok");
        }
        out.flush();
        out.close();
    }


}
