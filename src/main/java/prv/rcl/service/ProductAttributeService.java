package prv.rcl.service;

import prv.rcl.entity.ProductAttribute;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 自定义规格表(ProductAttribute)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
public interface ProductAttributeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductAttribute queryById(Long id);

    /**
     * 分页查询
     *
     * @param productAttribute 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ProductAttribute> queryByPage(ProductAttribute productAttribute, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param productAttribute 实例对象
     * @return 实例对象
     */
    ProductAttribute insert(ProductAttribute productAttribute);

    /**
     * 修改数据
     *
     * @param productAttribute 实例对象
     * @return 实例对象
     */
    ProductAttribute update(ProductAttribute productAttribute);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
