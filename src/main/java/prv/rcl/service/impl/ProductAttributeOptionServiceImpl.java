package prv.rcl.service.impl;

import prv.rcl.entity.ProductAttributeOption;
import prv.rcl.dao.ProductAttributeOptionDao;
import prv.rcl.service.ProductAttributeOptionService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import prv.rcl.service.ProductAttributeOptionService;

import javax.annotation.Resource;

/**
 * 商品属性选项表(ProductAttributeOption)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
@Service("productAttributeOptionService")
public class ProductAttributeOptionServiceImpl implements ProductAttributeOptionService {
    @Resource
    private ProductAttributeOptionDao productAttributeOptionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductAttributeOption queryById(Long id) {
        return this.productAttributeOptionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param productAttributeOption 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ProductAttributeOption> queryByPage(ProductAttributeOption productAttributeOption, PageRequest pageRequest) {
        long total = this.productAttributeOptionDao.count(productAttributeOption);
        return new PageImpl<>(this.productAttributeOptionDao.queryAllByLimit(productAttributeOption, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param productAttributeOption 实例对象
     * @return 实例对象
     */
    @Override
    public ProductAttributeOption insert(ProductAttributeOption productAttributeOption) {
        this.productAttributeOptionDao.insert(productAttributeOption);
        return productAttributeOption;
    }

    /**
     * 修改数据
     *
     * @param productAttributeOption 实例对象
     * @return 实例对象
     */
    @Override
    public ProductAttributeOption update(ProductAttributeOption productAttributeOption) {
        this.productAttributeOptionDao.update(productAttributeOption);
        return this.queryById(productAttributeOption.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.productAttributeOptionDao.deleteById(id) > 0;
    }
}
