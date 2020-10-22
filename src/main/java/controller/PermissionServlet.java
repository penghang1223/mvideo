package controller;

import com.google.gson.Gson;
import entity.Advert;
import entity.Permission;
import service.AdvertService;
import service.PermissionService;
import service.impl.AdvertServiceImpl;
import service.impl.PermissionServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PermissionServlet extends BaseServlet {
    PermissionService permissionService = new PermissionServiceImpl();



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
        Permission permission = (Permission) request.getSession().getAttribute("permission");
        //查询管理员
        request.setAttribute("permissions", permissionService.queryAll());

        //转发
        request.getRequestDispatcher("/bpages/permission.jsp").forward(request, response);
    }

    /**
     * 获取广告信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void getPermission(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取管理员id
        Integer id = WebUtils.parseInt(request.getParameter("id"), 0);
        //查询管理员
        Permission permission = permissionService.queryById(id);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(permission);
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
        Integer id = WebUtils.parseInt(request.getParameter("id"), 0);
        //删除管理员
        permissionService.delete(id);
        out.print("ok");
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
        Permission permission = WebUtils.copyParamToBean(request.getParameterMap(), new Permission());
        if(permissionService.insert(permission) > -1) {
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
        Permission permission = WebUtils.copyParamToBean(request.getParameterMap(), new Permission());
        if(permissionService.updatePermission(permission) > -1) {
            out.print("ok");
        }
        out.flush();
        out.close();
    }


}
