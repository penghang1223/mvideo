package controller;

import com.google.gson.Gson;
import entity.Manager;
import entity.Role;
import entity.User;
import service.ManagerService;
import service.UserService;
import service.impl.ManagerServiceImpl;
import service.impl.RoleServiceImpl;
import service.impl.UserServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ManagerServlet extends BaseServlet {
    ManagerService managerService = new ManagerServiceImpl();

    /**
     * 登录功能
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Manager manager = managerService.login(username, password);

        if (managerService.existsManagername(username) == null) {
            out.print("none");
        } else if (manager == null) {
            out.print("error");
        } else {
            //1 创建Cookie 对象
            Cookie cookie = new Cookie("managerName", username);
            cookie.setMaxAge(60 * 60 * 48);
            //2 通知客户端保存Cookie
            response.addCookie(cookie);
            request.getSession().setAttribute("manager", manager);
            //返回登录成功消息
            out.print("ok");
        }
        out.flush();
        out.close();

    }

    /**
     * 遍历管理员
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取登录对象
        Manager manager = (Manager) request.getSession().getAttribute("manager");
        //查询管理员
        request.setAttribute("managers", managerService.queryManagerList(manager.getId()));
        //存放Role数据（下拉框用）
        request.setAttribute("roles", new RoleServiceImpl().queryAll());
        //转发
        request.getRequestDispatcher("/bpages/manager.jsp").forward(request, response);
    }

    /**
     * 获取管理员信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void getManager(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取管理员id
        Long id = WebUtils.parseLong(request.getParameter("id"), 0L);
        //查询管理员
        Manager manager = managerService.queryManagerById(id);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(manager);
        response.getWriter().write(jsonStr);

    }

    /**
     * 删除管理员
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
        managerService.delete(id);
        out.print("ok");
        out.flush();
        out.close();
    }

    /**
     * 添加管理员
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
        Manager manager = WebUtils.copyParamToBean(request.getParameterMap(), new Manager());
        if(managerService.registManager(manager)){
            out.print("ok");
        }
        out.flush();
        out.close();
    }

    /**
     * 修改管理员信息
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
        Manager manager = WebUtils.copyParamToBean(request.getParameterMap(), new Manager());
        if(managerService.update(manager) > -1){
            out.print("ok");
        }
        out.flush();
        out.close();
    }

    /**
     * 检查用户名是否可用
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void existsUsername(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //请求参数
        String id = request.getParameter("id");
        String nickName = request.getParameter("nickName");
        //查询是否有此用户
        Manager manager = managerService.existsManagername(nickName);
        System.out.println(nickName);
        if(manager == null){
            out.print("ok");
        }else if(!id.equals("")){
            if(manager.getNickName().equals(managerService.queryManagerById(Long.parseLong(id)).getNickName())){
                out.print("ok");
            }else {
                out.print("repeat");
            }
        }else {
            out.print("repeat");
        }
        out.flush();
        out.close();
    }

}
