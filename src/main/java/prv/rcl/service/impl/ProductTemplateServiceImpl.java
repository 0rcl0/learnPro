package prv.rcl.service.impl;

import prv.rcl.entity.ProductTemplate;
import prv.rcl.dao.ProductTemplateDao;
import prv.rcl.service.ProductTemplateService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import prv.rcl.service.ProductTemplateService;

import javax.annotation.Resource;

/**
 * (ProductTemplate)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
@Service("productTemplateService")
public class ProductTemplateServiceImpl implements ProductTemplateService {
    @Resource
    private ProductTemplateDao productTemplateDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductTemplate queryById(Long id) {
        return this.productTemplateDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param productTemplate 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ProductTemplate> queryByPage(ProductTemplate productTemplate, PageRequest pageRequest) {
        long total = this.productTemplateDao.count(productTemplate);
        return new PageImpl<>(this.productTemplateDao.queryAllByLimit(productTemplate, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param productTemplate 实例对象
     * @return 实例对象
     */
    @Override
    public ProductTemplate insert(ProductTemplate productTemplate) {
        this.productTemplateDao.insert(productTemplate);
        return productTemplate;
    }

    /**
     * 修改数据
     *
     * @param productTemplate 实例对象
     * @return 实例对象
     */
    @Override
    public ProductTemplate update(ProductTemplate productTemplate) {
        this.productTemplateDao.update(productTemplate);
        return this.queryById(productTemplate.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.productTemplateDao.deleteById(id) > 0;
    }
}
