package prv.rcl.service;

import prv.rcl.entity.ProductTemplate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (ProductTemplate)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
public interface ProductTemplateService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductTemplate queryById(Long id);

    /**
     * 分页查询
     *
     * @param productTemplate 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ProductTemplate> queryByPage(ProductTemplate productTemplate, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param productTemplate 实例对象
     * @return 实例对象
     */
    ProductTemplate insert(ProductTemplate productTemplate);

    /**
     * 修改数据
     *
     * @param productTemplate 实例对象
     * @return 实例对象
     */
    ProductTemplate update(ProductTemplate productTemplate);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
