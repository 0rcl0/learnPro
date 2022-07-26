package prv.rcl.service;

import prv.rcl.entity.ProductTemplateRule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (ProductTemplateRule)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
public interface ProductTemplateRuleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductTemplateRule queryById(Long id);

    /**
     * 分页查询
     *
     * @param productTemplateRule 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ProductTemplateRule> queryByPage(ProductTemplateRule productTemplateRule, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param productTemplateRule 实例对象
     * @return 实例对象
     */
    ProductTemplateRule insert(ProductTemplateRule productTemplateRule);

    /**
     * 修改数据
     *
     * @param productTemplateRule 实例对象
     * @return 实例对象
     */
    ProductTemplateRule update(ProductTemplateRule productTemplateRule);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
