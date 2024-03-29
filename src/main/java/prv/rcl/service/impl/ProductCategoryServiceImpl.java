package prv.rcl.service.impl;

import prv.rcl.entity.ProductCategory;
import prv.rcl.dao.ProductCategoryDao;
import prv.rcl.service.ProductCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import prv.rcl.service.ProductCategoryService;

import javax.annotation.Resource;

/**
 * 产品分类表(ProductCategory)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
@Service("productCategoryService")
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Resource
    private ProductCategoryDao productCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductCategory queryById(Long id) {
        return this.productCategoryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param productCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ProductCategory> queryByPage(ProductCategory productCategory, PageRequest pageRequest) {
        long total = this.productCategoryDao.count(productCategory);
        return new PageImpl<>(this.productCategoryDao.queryAllByLimit(productCategory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param productCategory 实例对象
     * @return 实例对象
     */
    @Override
    public ProductCategory insert(ProductCategory productCategory) {
        this.productCategoryDao.insert(productCategory);
        return productCategory;
    }

    /**
     * 修改数据
     *
     * @param productCategory 实例对象
     * @return 实例对象
     */
    @Override
    public ProductCategory update(ProductCategory productCategory) {
        this.productCategoryDao.update(productCategory);
        return this.queryById(productCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.productCategoryDao.deleteById(id) > 0;
    }
}
