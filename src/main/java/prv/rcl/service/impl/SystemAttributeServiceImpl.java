package prv.rcl.service.impl;

import prv.rcl.entity.SystemAttribute;
import prv.rcl.dao.SystemAttributeDao;
import prv.rcl.service.SystemAttributeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import prv.rcl.service.SystemAttributeService;

import javax.annotation.Resource;

/**
 * 系统规格表(SystemAttribute)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
@Service("systemAttributeService")
public class SystemAttributeServiceImpl implements SystemAttributeService {
    @Resource
    private SystemAttributeDao systemAttributeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SystemAttribute queryById(Long id) {
        return this.systemAttributeDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param systemAttribute 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SystemAttribute> queryByPage(SystemAttribute systemAttribute, PageRequest pageRequest) {
        long total = this.systemAttributeDao.count(systemAttribute);
        return new PageImpl<>(this.systemAttributeDao.queryAllByLimit(systemAttribute, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param systemAttribute 实例对象
     * @return 实例对象
     */
    @Override
    public SystemAttribute insert(SystemAttribute systemAttribute) {
        this.systemAttributeDao.insert(systemAttribute);
        return systemAttribute;
    }

    /**
     * 修改数据
     *
     * @param systemAttribute 实例对象
     * @return 实例对象
     */
    @Override
    public SystemAttribute update(SystemAttribute systemAttribute) {
        this.systemAttributeDao.update(systemAttribute);
        return this.queryById(systemAttribute.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.systemAttributeDao.deleteById(id) > 0;
    }
}
