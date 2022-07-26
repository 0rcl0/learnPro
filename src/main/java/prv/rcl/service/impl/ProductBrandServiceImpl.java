package prv.rcl.service.impl;

import prv.rcl.entity.ProductBrand;
import prv.rcl.dao.ProductBrandDao;
import prv.rcl.service.ProductBrandService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import prv.rcl.service.ProductBrandService;

import javax.annotation.Resource;

/**
 * 商品品牌表(ProductBrand)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
@Service("productBrandService")
public class ProductBrandServiceImpl implements ProductBrandService {
    @Resource
    private ProductBrandDao productBrandDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductBrand queryById(Long id) {
        return this.productBrandDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param productBrand 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ProductBrand> queryByPage(ProductBrand productBrand, PageRequest pageRequest) {
        long total = this.productBrandDao.count(productBrand);
        return new PageImpl<>(this.productBrandDao.queryAllByLimit(productBrand, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param productBrand 实例对象
     * @return 实例对象
     */
    @Override
    public ProductBrand insert(ProductBrand productBrand) {
        this.productBrandDao.insert(productBrand);
        return productBrand;
    }

    /**
     * 修改数据
     *
     * @param productBrand 实例对象
     * @return 实例对象
     */
    @Override
    public ProductBrand update(ProductBrand productBrand) {
        this.productBrandDao.update(productBrand);
        return this.queryById(productBrand.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.productBrandDao.deleteById(id) > 0;
    }
}
