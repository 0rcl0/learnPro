package prv.rcl.service;

import prv.rcl.entity.ProductAttributeOption;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 商品属性选项表(ProductAttributeOption)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
public interface ProductAttributeOptionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductAttributeOption queryById(Long id);

    /**
     * 分页查询
     *
     * @param productAttributeOption 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ProductAttributeOption> queryByPage(ProductAttributeOption productAttributeOption, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param productAttributeOption 实例对象
     * @return 实例对象
     */
    ProductAttributeOption insert(ProductAttributeOption productAttributeOption);

    /**
     * 修改数据
     *
     * @param productAttributeOption 实例对象
     * @return 实例对象
     */
    ProductAttributeOption update(ProductAttributeOption productAttributeOption);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
