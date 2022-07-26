package prv.rcl.service;

import prv.rcl.entity.MemberCartItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 购物车内容(MemberCartItem)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:21
 */
public interface MemberCartItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MemberCartItem queryById(Long id);

    /**
     * 分页查询
     *
     * @param memberCartItem 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MemberCartItem> queryByPage(MemberCartItem memberCartItem, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param memberCartItem 实例对象
     * @return 实例对象
     */
    MemberCartItem insert(MemberCartItem memberCartItem);

    /**
     * 修改数据
     *
     * @param memberCartItem 实例对象
     * @return 实例对象
     */
    MemberCartItem update(MemberCartItem memberCartItem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
