package controller;

import com.google.gson.Gson;
import entity.Advert;
import entity.User;
import entity.Video;
import service.UserService;
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
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class UserServlet extends BaseServlet {
    UserService userService = new UserServiceImpl();
    VideoServlet videoServlet = new VideoServlet();
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

        if (userService.existsUsername(username) == null) {
            out.print("none");
        } else if (user == null) {
            out.print("error");
        } else {
            //1 创建Cookie 对象
            Cookie cookie = new Cookie("userName", username);
            cookie.setMaxAge(60 * 60 * 48);
            //2 通知客户端保存Cookie
            response.addCookie(cookie);
            request.getSession().setAttribute("user", user);
            //返回登录成功消息
            out.print("ok");
        }
        out.flush();
        out.close();
    }

    /**
     * 获取广告信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        request.getSession().removeAttribute("user");
        //        重定向到首页或者登录页面
        response.sendRedirect("http://localhost:8080/mvideo/pages/user/login.jsp");
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
        User user = (User) request.getSession().getAttribute("user");
        //请求参数
        String username = request.getParameter("username");
        System.out.println(username);
        User user2 = userService.existsUsername(username);
        if (user2 == null) {
            out.print("ok");
        } else if (user != null) {
            System.out.println(user.getNickName());
            if (user.getNickName().equals(username)){
                out.print("ok");
            }else{
                out.print("repeat");
            }
        } else {
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
        if (token != null && token.equalsIgnoreCase(code)) {
            if (userService.registUser(new User(username, password, email, phone, new BigDecimal(0), 0))) {
                out.print("ok");
            } else {
                out.print("error");
            }
        } else {
            out.print("code");
        }
        out.flush();
        out.close();
    }

    /**
     * 遍历用户
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取登录对象
        User user = (User) request.getSession().getAttribute("user");
        //查询管理员
        request.setAttribute("users", userService.queryUserList());

        //转发
        request.getRequestDispatcher("/bpages/user.jsp").forward(request, response);
    }

    /**
     * 获取广告信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void getUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取管理员id
        Long id = WebUtils.parseLong(request.getParameter("id"), 0L);
        //查询管理员
        User user = userService.queryUserById(id);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(user);
        response.getWriter().write(jsonStr);

    }

    /**
     * 删除用户
     *
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
        userService.delete(id);
        if (userService.delete(id) > -1) {
            out.print("ok");
        }
        out.flush();
        out.close();
    }

    protected void deleteT(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //获取管理员id
        Long id = WebUtils.parseLong(request.getParameter("id"), 0L);
        //删除管理员
        userService.deleteT(id);
        out.print("ok");
        out.flush();
        out.close();
    }

    protected void userSetting(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取个人上传视频
        User user = (User) request.getSession().getAttribute("user");
        request.setAttribute("user",user);
        //转发
        request.getRequestDispatcher("/pages/user/usersettings.jsp").forward(request, response);

    }

    protected void payMoney(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // 获取用户信息、充值金额
        User user = (User) request.getSession().getAttribute("user");
                long temp = Long.parseLong(request.getParameter("money"));
        //拒绝负数金额
        Long money =temp>0?temp:0L;
        user.setWallet(user.getWallet().add(new BigDecimal(money)));
        //更新信息
       if ( userService.update(user)>0){
           request.setAttribute("user",user);
           out.print("ok");
       }else{
           out.write("error");
       }
        out.flush();
        out.close();
    }

    protected void payVip(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // 获取用户信息、购买月份
        User user = (User) request.getSession().getAttribute("user");
        int month = WebUtils.parseInt(request.getParameter("month"),1);
        BigDecimal balance=user.getWallet().subtract(new BigDecimal(month*20));
        //拒绝负数金额
        if (balance.compareTo(BigDecimal.ZERO)>=0){
            user.setWallet(balance);
            user.setStatus(1);
        }
        //更新信息
        if ( userService.update(user)>0){
            request.setAttribute("user",user);
            out.print("ok");
        }else{
            out.write("error");
        }
        out.flush();
        out.close();
    }

    /**
     * 修改个人治疗
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String flag = request.getParameter("flag");
        //获取登录用户信息
        User user = (User)request.getSession().getAttribute("user");
        //接收form表单值
        User tmep = WebUtils.copyParamToBean(request.getParameterMap(), new User());
        //判断修改事件
        if(flag == null){
            //修改个人资料
            user.setNickName(tmep.getNickName());
            user.setEmail(tmep.getEmail());
            user.setPhone(tmep.getPhone());
            user.setSign(tmep.getSign());
        }else {
            //修改密码
            user.setPassword(tmep.getPassword());
        }
        userService.update(user);
        response.getWriter().print("ok");
        response.getWriter().close();


    }

}
