package controller;

import entity.Advert;
import entity.Page;
import service.AdvertService;
import service.impl.AdvertServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ClientAdvertsServlet")
public class ClientAdvertsServlet extends  BaseServlet {
    private AdvertService advertService = new AdvertServiceImpl();
    /**
     * 处理分页功能
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 获取请求的参数 pageNo 和 pageSize
        int pageNo = WebUtils.parseInt(req.getParameter("pageNo"), 1);
        int pageSize = WebUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);
        //2 调用GoodsService.page(pageNo，pageSize)：Page对象
        Page<Advert> page = advertService.page(pageNo,pageSize);
        page.setUrl("ClientAdvertsServlet?action=page");
        //3 保存Page对象到Request域中
        req.setAttribute("page",page);
        //4 请求转发到pages/manager/book_manager.jsp页面
        req.getRequestDispatcher("/bpages/advert.jsp").forward(req,resp);
    }

}
