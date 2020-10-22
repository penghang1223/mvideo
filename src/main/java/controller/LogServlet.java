package controller;

import com.google.gson.Gson;
import entity.Log;
import entity.Manager;
import service.LogService;
import service.ManagerService;
import service.impl.LogServiceImpl;
import service.impl.ManagerServiceImpl;
import service.impl.RoleServiceImpl;
import service.impl.UserServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LogServlet extends BaseServlet {
    LogService logService = new LogServiceImpl();
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
        Log log = (Log) request.getSession().getAttribute("log");
        //查询管理员
        request.setAttribute("logs", logService.queryLogList());
        //转发
        request.getRequestDispatcher("/bpages/log.jsp").forward(request, response);
    }

    /**
     * 获取管理员信息
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void getLog(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取管理员id
        Long id = WebUtils.parseLong(request.getParameter("id"), 0L);
        //查询管理员
        Log log = logService.queryLogById(id);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(log);
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
        logService.delete(id);
        if(logService.delete(id) > -1) {
            out.print("ok");
        }
        out.flush();
        out.close();
    }

    /**
     * 删除管理员
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void clear(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        logService.deleteAll();
        out.print("ok");
        out.flush();
        out.close();
    }


}
