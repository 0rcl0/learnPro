package prv.rcl.service.impl;

import prv.rcl.entity.ProductTemplateRule;
import prv.rcl.dao.ProductTemplateRuleDao;
import prv.rcl.service.ProductTemplateRuleService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import prv.rcl.service.ProductTemplateRuleService;

import javax.annotation.Resource;

/**
 * (ProductTemplateRule)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
@Service("productTemplateRuleService")
public class ProductTemplateRuleServiceImpl implements ProductTemplateRuleService {
    @Resource
    private ProductTemplateRuleDao productTemplateRuleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductTemplateRule queryById(Long id) {
        return this.productTemplateRuleDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param productTemplateRule 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ProductTemplateRule> queryByPage(ProductTemplateRule productTemplateRule, PageRequest pageRequest) {
        long total = this.productTemplateRuleDao.count(productTemplateRule);
        return new PageImpl<>(this.productTemplateRuleDao.queryAllByLimit(productTemplateRule, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param productTemplateRule 实例对象
     * @return 实例对象
     */
    @Override
    public ProductTemplateRule insert(ProductTemplateRule productTemplateRule) {
        this.productTemplateRuleDao.insert(productTemplateRule);
        return productTemplateRule;
    }

    /**
     * 修改数据
     *
     * @param productTemplateRule 实例对象
     * @return 实例对象
     */
    @Override
    public ProductTemplateRule update(ProductTemplateRule productTemplateRule) {
        this.productTemplateRuleDao.update(productTemplateRule);
        return this.queryById(productTemplateRule.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.productTemplateRuleDao.deleteById(id) > 0;
    }
}
