package prv.rcl.service.impl;

import prv.rcl.entity.ProductSku;
import prv.rcl.dao.ProductSkuDao;
import prv.rcl.service.ProductSkuService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import prv.rcl.service.ProductSkuService;

import javax.annotation.Resource;

/**
 * sku 表(ProductSku)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
@Service("productSkuService")
public class ProductSkuServiceImpl implements ProductSkuService {
    @Resource
    private ProductSkuDao productSkuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductSku queryById(Long id) {
        return this.productSkuDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param productSku 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ProductSku> queryByPage(ProductSku productSku, PageRequest pageRequest) {
        long total = this.productSkuDao.count(productSku);
        return new PageImpl<>(this.productSkuDao.queryAllByLimit(productSku, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param productSku 实例对象
     * @return 实例对象
     */
    @Override
    public ProductSku insert(ProductSku productSku) {
        this.productSkuDao.insert(productSku);
        return productSku;
    }

    /**
     * 修改数据
     *
     * @param productSku 实例对象
     * @return 实例对象
     */
    @Override
    public ProductSku update(ProductSku productSku) {
        this.productSkuDao.update(productSku);
        return this.queryById(productSku.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.productSkuDao.deleteById(id) > 0;
    }
}
