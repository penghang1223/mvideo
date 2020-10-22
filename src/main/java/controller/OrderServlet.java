package controller;

import com.google.gson.Gson;
import entity.Order;
import entity.Role;
import service.OrderService;
import service.RoleService;
import service.impl.OrderServiceImpl;
import service.impl.RoleServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OrderServlet extends BaseServlet {
    OrderService orderService = new OrderServiceImpl();



    /**
     * 遍历订单
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取登录对象
        Order order = (Order) request.getSession().getAttribute("order");
        //查询订单
        request.setAttribute("orders", orderService.queryAll());

        //转发
        request.getRequestDispatcher("/bpages/order.jsp").forward(request, response);
    }

    /**
     * 获取订单信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void getOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取管理员id
        Long id = WebUtils.parseLong(request.getParameter("id"), 0L);
        //查询管理员
        Order order = orderService.queryById(id);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(order);
        response.getWriter().write(jsonStr);

    }

}
