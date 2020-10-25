package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutServlet extends BaseServlet {

    protected void userLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //       销毁Session中用户登录的信息（或者销毁session）
        request.getSession().removeAttribute("user");
//        重定向到首页或者登录页面
        response.sendRedirect(request.getContextPath());
    }

    protected void managerLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //       销毁Session中用户登录的信息（或者销毁session）
        request.getSession().removeAttribute("manager");
//        重定向到首页或者登录页面
        response.sendRedirect("http://localhost:8080/mvideo/bpages/managerlogin.jsp");
    }
}
