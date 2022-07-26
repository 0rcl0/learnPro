package prv.rcl.service.impl;

import prv.rcl.entity.ProductAttribute;
import prv.rcl.dao.ProductAttributeDao;
import prv.rcl.service.ProductAttributeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import prv.rcl.service.ProductAttributeService;

import javax.annotation.Resource;

/**
 * 自定义规格表(ProductAttribute)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
@Service("productAttributeService")
public class ProductAttributeServiceImpl implements ProductAttributeService {
    @Resource
    private ProductAttributeDao productAttributeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductAttribute queryById(Long id) {
        return this.productAttributeDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param productAttribute 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ProductAttribute> queryByPage(ProductAttribute productAttribute, PageRequest pageRequest) {
        long total = this.productAttributeDao.count(productAttribute);
        return new PageImpl<>(this.productAttributeDao.queryAllByLimit(productAttribute, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param productAttribute 实例对象
     * @return 实例对象
     */
    @Override
    public ProductAttribute insert(ProductAttribute productAttribute) {
        this.productAttributeDao.insert(productAttribute);
        return productAttribute;
    }

    /**
     * 修改数据
     *
     * @param productAttribute 实例对象
     * @return 实例对象
     */
    @Override
    public ProductAttribute update(ProductAttribute productAttribute) {
        this.productAttributeDao.update(productAttribute);
        return this.queryById(productAttribute.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.productAttributeDao.deleteById(id) > 0;
    }
}
