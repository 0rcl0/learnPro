package prv.rcl.service.impl;

import prv.rcl.entity.OrderAppraise;
import prv.rcl.dao.OrderAppraiseDao;
import prv.rcl.service.OrderAppraiseService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import prv.rcl.service.OrderAppraiseService;

import javax.annotation.Resource;

/**
 * 订单评价表(OrderAppraise)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
@Service("orderAppraiseService")
public class OrderAppraiseServiceImpl implements OrderAppraiseService {
    @Resource
    private OrderAppraiseDao orderAppraiseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderAppraise queryById(Long id) {
        return this.orderAppraiseDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param orderAppraise 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OrderAppraise> queryByPage(OrderAppraise orderAppraise, PageRequest pageRequest) {
        long total = this.orderAppraiseDao.count(orderAppraise);
        return new PageImpl<>(this.orderAppraiseDao.queryAllByLimit(orderAppraise, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param orderAppraise 实例对象
     * @return 实例对象
     */
    @Override
    public OrderAppraise insert(OrderAppraise orderAppraise) {
        this.orderAppraiseDao.insert(orderAppraise);
        return orderAppraise;
    }

    /**
     * 修改数据
     *
     * @param orderAppraise 实例对象
     * @return 实例对象
     */
    @Override
    public OrderAppraise update(OrderAppraise orderAppraise) {
        this.orderAppraiseDao.update(orderAppraise);
        return this.queryById(orderAppraise.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderAppraiseDao.deleteById(id) > 0;
    }
}
