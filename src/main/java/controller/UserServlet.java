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
import java.io.PrintWriter;
import java.math.BigDecimal;

public class UserServlet extends BaseServlet {
    UserService userService = new UserServiceImpl();

    /**
     * 处理登录
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
        User user = userService.login(new User(username, password));

        if (userService.existsUsername(username)) {
            out.print("none");
        } else if(user == null){
            out.print("error");
        }else {
            request.getSession().setAttribute("user", user);
            //返回登录成功消息
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
        String username = request.getParameter("username");
        if(userService.existsUsername(username)){
            out.print("ok");
        }else {
            out.print("repeat");
        }
        out.flush();
        out.close();
    }

    protected void signup(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //请求参数
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        // 获取Session 中的验证码
        String token = (String) request.getSession().getAttribute("KAPTCHA_SESSION_KEY");
        // 删除 Session 中的验证码
        request.getSession().removeAttribute("KAPTCHA_SESSION_KEY");
        String code = request.getParameter("code");
        System.out.println(token);
        System.out.println(code);
        if (token != null && token.equalsIgnoreCase(code)) {
            if(userService.registUser(new User(username,password,email,password,1,new BigDecimal(0),0))){
                out.print("ok");
            }else {
                out.print("error");
            }
        }else {
            out.print("code");
        }
        out.flush();
        out.close();
    }

}
