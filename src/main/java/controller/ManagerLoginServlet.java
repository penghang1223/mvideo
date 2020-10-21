package controller;

import entity.Manager;
import entity.User;
import service.ManagerService;
import service.UserService;
import service.impl.ManagerServiceImpl;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ManagerLoginServlet")
public class ManagerLoginServlet extends BaseServlet {
   ManagerService managerService = new ManagerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//1.获取请求参数
        String nickname=request.getParameter("nickname");
        String password=request.getParameter("password");
        //调用userService.login 登入处理业务

        Manager manager = managerService.login(nickname,password);
        if(manager==null){
            //跳回登入页面
            request.getRequestDispatcher("/bpages/managerlogin.jsp").forward(request,response);
        }else{
            //登入成功
            request.getSession().setAttribute("manager",manager);
            request.setAttribute("managers",managerService.queryManagerList(manager.getId()));
            request.getRequestDispatcher("/AdvertsServlet?action=page").forward(request,response);

        }
    }

    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nickname=request.getParameter("nickname");
        String password=request.getParameter("password");
        //调用userService.login 登入处理业务

        Manager manager = managerService.login(nickname,password);
        if(manager==null){
            //跳回登入页面
            request.getRequestDispatcher("/bpages/managerlogin.jsp").forward(request,response);
        }else{
            //登入成功
            request.getSession().setAttribute("manager",manager);
            request.setAttribute("managers",managerService.queryManagerList(manager.getId()));
            request.getRequestDispatcher("/AdvertsServlet?action=page").forward(request,response);

        }
    }
}
