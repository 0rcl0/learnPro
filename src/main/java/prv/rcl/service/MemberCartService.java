package prv.rcl.service;

import prv.rcl.entity.MemberCart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 购物车(MemberCart)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:49:11
 */
public interface MemberCartService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MemberCart queryById(Long id);

    /**
     * 分页查询
     *
     * @param memberCart 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MemberCart> queryByPage(MemberCart memberCart, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param memberCart 实例对象
     * @return 实例对象
     */
    MemberCart insert(MemberCart memberCart);

    /**
     * 修改数据
     *
     * @param memberCart 实例对象
     * @return 实例对象
     */
    MemberCart update(MemberCart memberCart);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
