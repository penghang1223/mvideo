package controller;

import com.google.gson.Gson;
import entity.History;
import entity.HistoryDO;
import entity.User;
import service.HistoryService;
import service.impl.HistoryServiceImpl;
import utils.Page;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/21 11:35
 */
public class HistoryServlet extends BaseServlet {
    HistoryService historyService = new HistoryServiceImpl();

    /**
     * 添加历史记录
     *
     * @param request  请求
     * @param response 响应
     * @throws ServletException
     * @throws IOException
     */
    protected void insertHistoryRecord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        User user = (User) request.getSession().getAttribute("user");
        Long videoId = Long.parseLong(request.getParameter("videoid"));
        System.out.println("VideoID:" + videoId);
        History history = new History();
        System.out.println(user);
        if (user != null) {
            history.setUserId(user.getId());
            history.setVideoId(videoId);
            System.out.println(historyService.queryHistory(history)+"777");
            if (historyService.queryHistory(history) == null) {
                if (historyService.insert(history) > 0) {
                    writer.print("success");
                } else {
                    writer.print("wrong");
                }
            }
        } else {
            writer.write("nothing to do");
        }
        writer.close();

    }

    protected void searchAllHistoryByUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        User user = (User) request.getSession().getAttribute("user");
        int num = WebUtils.parseInt(request.getParameter("num"), 8);
        int page = WebUtils.parseInt(request.getParameter("page"), 1);
        History history = new History();
        history.setUserId(user.getId());
        List<HistoryDO> historyDOList = historyService.queryHistoriesByUserPages(history, page, num);
        if (historyDOList != null) {
            Gson gson = new Gson();
            String jsonList = gson.toJson(historyDOList);
            System.out.println(jsonList);
            writer.print(jsonList);
        } else {
            writer.print("error");
        }
        writer.close();

    }

    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        User user = (User) request.getSession().getAttribute("user");
        String videoid = request.getParameter("videoid");
        videoid = videoid.substring(4);
        History history = new History();
        history.setVideoId(Long.parseLong(videoid));
        history.setUserId(user.getId());
        System.out.println(history);
        if (historyService.delete(history) > 0) {
            writer.write("success");
        } else {
            writer.write("error");
        }
        writer.close();

    }

    /**
     * 根据类型查询视频
     *
     * @param request  请求
     * @param response 响应
     * @throws ServletException servlet异常
     * @throws IOException      IO异常
     */
    protected void pageHistory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String title = request.getParameter("search");
        String type = request.getParameter("type");
        //1 获取请求的参数 pageNo 和 pageSize
        int pageSize = WebUtils.parseInt(request.getParameter("pagesize"), 8);
        int pageNo = WebUtils.parseInt(request.getParameter("pageno"), 0);
        History history = new History();
        User user = (User) request.getSession().getAttribute("user");
        history.setUserId(user.getId());
        PrintWriter out = response.getWriter();
        //2 调用GoodsService.page(pageNo，pageSize)：Page 对象
        Page<HistoryDO> page = historyService.page(history, pageNo, pageSize);
        //3 保存Page 对象到Request 域中
        request.setAttribute("page", page);
        //4 请求转发到pages/manager/goods_manager.jsp 页面
        request.getRequestDispatcher("/pages/video/historypage.jsp").forward(request, response);

    }
}
