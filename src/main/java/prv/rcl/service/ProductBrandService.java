package prv.rcl.service;

import prv.rcl.entity.ProductBrand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 商品品牌表(ProductBrand)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
public interface ProductBrandService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductBrand queryById(Long id);

    /**
     * 分页查询
     *
     * @param productBrand 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ProductBrand> queryByPage(ProductBrand productBrand, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param productBrand 实例对象
     * @return 实例对象
     */
    ProductBrand insert(ProductBrand productBrand);

    /**
     * 修改数据
     *
     * @param productBrand 实例对象
     * @return 实例对象
     */
    ProductBrand update(ProductBrand productBrand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
