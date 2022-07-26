package prv.rcl.service.impl;

import prv.rcl.entity.MemberAddress;
import prv.rcl.dao.MemberAddressDao;
import prv.rcl.service.MemberAddressService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 用户收货地址(MemberAddress)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:16
 */
@Service("memberAddressService")
public class MemberAddressServiceImpl implements MemberAddressService {
    @Resource
    private MemberAddressDao memberAddressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MemberAddress queryById(Long id) {
        return this.memberAddressDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param memberAddress 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MemberAddress> queryByPage(MemberAddress memberAddress, PageRequest pageRequest) {
        long total = this.memberAddressDao.count(memberAddress);
        return new PageImpl<>(this.memberAddressDao.queryAllByLimit(memberAddress, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param memberAddress 实例对象
     * @return 实例对象
     */
    @Override
    public MemberAddress insert(MemberAddress memberAddress) {
        this.memberAddressDao.insert(memberAddress);
        return memberAddress;
    }

    /**
     * 修改数据
     *
     * @param memberAddress 实例对象
     * @return 实例对象
     */
    @Override
    public MemberAddress update(MemberAddress memberAddress) {
        this.memberAddressDao.update(memberAddress);
        return this.queryById(memberAddress.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.memberAddressDao.deleteById(id) > 0;
    }
}
