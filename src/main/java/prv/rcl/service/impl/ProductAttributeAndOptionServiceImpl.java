package prv.rcl.service.impl;

import prv.rcl.entity.ProductAttributeAndOption;
import prv.rcl.dao.ProductAttributeAndOptionDao;
import prv.rcl.service.ProductAttributeAndOptionService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import prv.rcl.service.ProductAttributeAndOptionService;

import javax.annotation.Resource;

/**
 * 规格属性绑定表(ProductAttributeAndOption)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
@Service("productAttributeAndOptionService")
public class ProductAttributeAndOptionServiceImpl implements ProductAttributeAndOptionService {
    @Resource
    private ProductAttributeAndOptionDao productAttributeAndOptionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductAttributeAndOption queryById(Long id) {
        return this.productAttributeAndOptionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param productAttributeAndOption 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ProductAttributeAndOption> queryByPage(ProductAttributeAndOption productAttributeAndOption, PageRequest pageRequest) {
        long total = this.productAttributeAndOptionDao.count(productAttributeAndOption);
        return new PageImpl<>(this.productAttributeAndOptionDao.queryAllByLimit(productAttributeAndOption, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param productAttributeAndOption 实例对象
     * @return 实例对象
     */
    @Override
    public ProductAttributeAndOption insert(ProductAttributeAndOption productAttributeAndOption) {
        this.productAttributeAndOptionDao.insert(productAttributeAndOption);
        return productAttributeAndOption;
    }

    /**
     * 修改数据
     *
     * @param productAttributeAndOption 实例对象
     * @return 实例对象
     */
    @Override
    public ProductAttributeAndOption update(ProductAttributeAndOption productAttributeAndOption) {
        this.productAttributeAndOptionDao.update(productAttributeAndOption);
        return this.queryById(productAttributeAndOption.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.productAttributeAndOptionDao.deleteById(id) > 0;
    }
}
