package prv.rcl.service;

import prv.rcl.entity.MemberAddress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 用户收货地址(MemberAddress)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:16
 */
public interface MemberAddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MemberAddress queryById(Long id);

    /**
     * 分页查询
     *
     * @param memberAddress 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MemberAddress> queryByPage(MemberAddress memberAddress, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param memberAddress 实例对象
     * @return 实例对象
     */
    MemberAddress insert(MemberAddress memberAddress);

    /**
     * 修改数据
     *
     * @param memberAddress 实例对象
     * @return 实例对象
     */
    MemberAddress update(MemberAddress memberAddress);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
