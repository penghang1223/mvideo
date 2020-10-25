package controller;

import com.google.gson.Gson;
import entity.Advert;
import entity.Manager;
import entity.Role;
import service.AdvertService;
import service.ManagerService;
import service.RoleService;
import service.impl.AdvertServiceImpl;
import service.impl.ManagerServiceImpl;
import service.impl.RoleServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RoleServlet extends BaseServlet {
    RoleService roleService = new RoleServiceImpl();



    /**
     * 遍历角色
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取登录对象
        Role role = (Role) request.getSession().getAttribute("role");
        //查询管理员
        request.setAttribute("roles", roleService.queryAll());

        //转发
        request.getRequestDispatcher("/bpages/role.jsp").forward(request, response);
    }

    /**
     * 获取角色信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void getRole(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取管理员id
        Integer id = WebUtils.parseInt(request.getParameter("id"), 0);
        //查询管理员
        Role role = roleService.queryRoleById(id);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(role);
        response.getWriter().write(jsonStr);

    }

    /**
     * 删除角色
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
        roleService.delete(id);
        if(roleService.delete(id) > -1) {
            out.print("ok");
        }
        out.flush();
        out.close();
    }

    /**
     * 添加角色
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
        Role role = WebUtils.copyParamToBean(request.getParameterMap(), new Role());
        roleService.insert(role);
            out.print("ok");

        out.flush();
        out.close();
    }

    /**
     * 修改角色信息
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
        Role role = WebUtils.copyParamToBean(request.getParameterMap(), new Role());
        roleService.updateRole(role);
            out.print("ok");

        out.flush();
        out.close();
    }


}
