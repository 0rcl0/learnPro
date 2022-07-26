package prv.rcl.service.impl;

import prv.rcl.entity.MemberCart;
import prv.rcl.dao.MemberCartDao;
import prv.rcl.service.MemberCartService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import prv.rcl.dao.MemberCartDao;

import javax.annotation.Resource;

/**
 * 购物车(MemberCart)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:20
 */
@Service("memberCartService")
public class MemberCartServiceImpl implements MemberCartService {
    @Resource
    private MemberCartDao memberCartDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MemberCart queryById(Long id) {
        return this.memberCartDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param memberCart 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MemberCart> queryByPage(MemberCart memberCart, PageRequest pageRequest) {
        long total = this.memberCartDao.count(memberCart);
        return new PageImpl<>(this.memberCartDao.queryAllByLimit(memberCart, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param memberCart 实例对象
     * @return 实例对象
     */
    @Override
    public MemberCart insert(MemberCart memberCart) {
        this.memberCartDao.insert(memberCart);
        return memberCart;
    }

    /**
     * 修改数据
     *
     * @param memberCart 实例对象
     * @return 实例对象
     */
    @Override
    public MemberCart update(MemberCart memberCart) {
        this.memberCartDao.update(memberCart);
        return this.queryById(memberCart.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.memberCartDao.deleteById(id) > 0;
    }
}
