package prv.rcl.service;

import prv.rcl.entity.OrderAppraise;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 订单评价表(OrderAppraise)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
public interface OrderAppraiseService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderAppraise queryById(Long id);

    /**
     * 分页查询
     *
     * @param orderAppraise 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OrderAppraise> queryByPage(OrderAppraise orderAppraise, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param orderAppraise 实例对象
     * @return 实例对象
     */
    OrderAppraise insert(OrderAppraise orderAppraise);

    /**
     * 修改数据
     *
     * @param orderAppraise 实例对象
     * @return 实例对象
     */
    OrderAppraise update(OrderAppraise orderAppraise);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
