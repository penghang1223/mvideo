package service.impl;

import dao.CollectionDao;
import dao.impl.CollectionDaoImpl;
import entity.Collection;
import entity.CollectionDO;
import entity.History;
import entity.HistoryDO;
import service.CollectionService;
import utils.Page;

import java.util.List;

/**
 * @Author: Schean
 * @Date: 2020/10/15 21:45
 */
public class CollectionServiceImpl implements CollectionService {
    CollectionDao collectionDao = new CollectionDaoImpl();
    @Override
    public int insert(Collection collection) {
        return collectionDao.insert(collection);
    }

    @Override
    public int update(Collection collection) {
        return collectionDao.updateCollection(collection);
    }

    @Override
    public int delete(Collection collection) {
        return collectionDao.delete(collection);
    }

    @Override
    public CollectionDO queryCollection(Collection collection) {
        return collectionDao.queryCollection(collection);
    }


    @Override
    public List<CollectionDO> queryCollections(int page, int num) {
        return collectionDao.queryCollections(page,num);
    }

    @Override
    public Page<CollectionDO> page(Collection collection, int pageNo, int pageSize) {
        Page<CollectionDO> page = new Page<CollectionDO>();
        // 设置每页显示的数量
        page.setPageSize(pageSize);
        // 求总记录数
        Integer pageTotalCount = collectionDao.getCounts().intValue();
        // 设置总记录数
        page.setPageTotalCount(pageTotalCount);
        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal+=1;
        }
        // 设置总页码
        page.setPageTotal(pageTotal);
        // 设置当前页码
        page.setPageNo(pageNo);
        // 求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
        System.out.println("begin:"+begin+" pageTotal:"+pageTotal+" totalcount:"+pageTotalCount);
        // 求当前页数据
        List<CollectionDO> items = collectionDao.queryCollectionsByPage(collection,begin,pageSize);
        // 设置当前页数据
        page.setItems(items);
        return page;
    }

}
