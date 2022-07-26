package prv.rcl.service;

import prv.rcl.entity.ProductAttributeAndOption;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 规格属性绑定表(ProductAttributeAndOption)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
public interface ProductAttributeAndOptionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductAttributeAndOption queryById(Long id);

    /**
     * 分页查询
     *
     * @param productAttributeAndOption 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ProductAttributeAndOption> queryByPage(ProductAttributeAndOption productAttributeAndOption, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param productAttributeAndOption 实例对象
     * @return 实例对象
     */
    ProductAttributeAndOption insert(ProductAttributeAndOption productAttributeAndOption);

    /**
     * 修改数据
     *
     * @param productAttributeAndOption 实例对象
     * @return 实例对象
     */
    ProductAttributeAndOption update(ProductAttributeAndOption productAttributeAndOption);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
