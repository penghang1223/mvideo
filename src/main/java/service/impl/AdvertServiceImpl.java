package service.impl;

import dao.AdvertDao;
import dao.impl.AdvertDaoImpl;
import entity.Advert;
import entity.Page;
import service.AdvertService;

import java.util.List;

public class AdvertServiceImpl implements AdvertService {
    AdvertDao advertDao = new AdvertDaoImpl();

    @Override
    public int insert(Advert advert) {
        return advertDao.insert(advert);
    }

    @Override
    public int updateAdvert(Advert advert) {
        return advertDao.updateAdvert(advert);
    }

    @Override
    public int delete(Integer id) {
        return advertDao.delete(id);
    }

    @Override
    public Advert queryById(Integer id) {
        return advertDao.queryById(id);
    }

    @Override
    public List<Advert> queryAll() {
        return advertDao.queryAll();
    }

    @Override
    public Page<Advert> page(int pageNo, int pageSize) {
        Page<Advert> page = new Page<Advert>();
        // 设置每页显示的数量
        page.setPageSize(pageSize);
        // 求总记录数
        Integer pageTotalCount = advertDao.queryForPageTotalCount();
        // 设置总记录数
        page.setPageTotalCount(pageTotalCount);
        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal += 1;
        }
        // 设置总页码
        page.setPageTotal(pageTotal);
        // 设置当前页码
        page.setPageNo(pageNo);
        // 求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
        // 求当前页数据
        List<Advert> items = advertDao.queryForPageItems(begin, pageSize);
        // 设置当前页数据
        page.setItems(items);
        return page;
    }

    @Override
    public Page<Advert> pageByName(int pageNo, int pageSize, String name) {
        Page<Advert> page = new Page<Advert>();
        // 设置每页显示的数量
        page.setPageSize(pageSize);
        // 求总记录数
        Integer pageTotalCount = advertDao.queryForPageTotalCountByName(name);
        // 设置总记录数
        page.setPageTotalCount(pageTotalCount);
        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal += 1;
        }
        // 设置总页码
        page.setPageTotal(pageTotal);
        // 设置当前页码
        page.setPageNo(pageNo);
        // 求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
        // 求当前页数据
        List<Advert> items = advertDao.queryForPageItemsByName(begin, pageSize,name);
        // 设置当前页数据
        page.setItems(items);
        return page;
    }
}
