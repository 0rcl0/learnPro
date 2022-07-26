package prv.rcl.service;

import prv.rcl.entity.ProductSku;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * sku 表(ProductSku)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
public interface ProductSkuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductSku queryById(Long id);

    /**
     * 分页查询
     *
     * @param productSku 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ProductSku> queryByPage(ProductSku productSku, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param productSku 实例对象
     * @return 实例对象
     */
    ProductSku insert(ProductSku productSku);

    /**
     * 修改数据
     *
     * @param productSku 实例对象
     * @return 实例对象
     */
    ProductSku update(ProductSku productSku);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
