package controller;

import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ManagerLoginServlet")
public class ManagerLoginServlet extends HttpServlet {
   UserService userService=new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//1.获取请求参数
        String nickname=request.getParameter("nickname");
        String password=request.getParameter("password");
        //调用userService.login 登入处理业务

        User loginUser=userService.login(new User(nickname,password));
        if(loginUser==null){
            //跳回登入页面
            request.getRequestDispatcher("/bpages/managerlogin.jsp").forward(request,response);
        }else{
            //登入成功
            request.getSession().setAttribute("nickname",nickname);
            request.getSession().setAttribute("password",password);
            request.getRequestDispatcher("/bpages/advert.jsp").forward(request,response);

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
