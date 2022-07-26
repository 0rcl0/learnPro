package prv.rcl.service.impl;

import prv.rcl.entity.MemberCartItem;
import prv.rcl.dao.MemberCartItemDao;
import prv.rcl.service.MemberCartItemService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 购物车内容(MemberCartItem)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:22
 */
@Service("memberCartItemService")
public class MemberCartItemServiceImpl implements MemberCartItemService {
    @Resource
    private MemberCartItemDao memberCartItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MemberCartItem queryById(Long id) {
        return this.memberCartItemDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param memberCartItem 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MemberCartItem> queryByPage(MemberCartItem memberCartItem, PageRequest pageRequest) {
        long total = this.memberCartItemDao.count(memberCartItem);
        return new PageImpl<>(this.memberCartItemDao.queryAllByLimit(memberCartItem, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param memberCartItem 实例对象
     * @return 实例对象
     */
    @Override
    public MemberCartItem insert(MemberCartItem memberCartItem) {
        this.memberCartItemDao.insert(memberCartItem);
        return memberCartItem;
    }

    /**
     * 修改数据
     *
     * @param memberCartItem 实例对象
     * @return 实例对象
     */
    @Override
    public MemberCartItem update(MemberCartItem memberCartItem) {
        this.memberCartItemDao.update(memberCartItem);
        return this.queryById(memberCartItem.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.memberCartItemDao.deleteById(id) > 0;
    }
}
