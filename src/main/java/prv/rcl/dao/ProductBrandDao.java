package prv.rcl.dao;

import prv.rcl.entity.ProductBrand;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 商品品牌表(ProductBrand)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-24 15:18:58
 */
public interface ProductBrandDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductBrand queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param productBrand 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<ProductBrand> queryAllByLimit(ProductBrand productBrand, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param productBrand 查询条件
     * @return 总行数
     */
    long count(ProductBrand productBrand);

    /**
     * 新增数据
     *
     * @param productBrand 实例对象
     * @return 影响行数
     */
    int insert(ProductBrand productBrand);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductBrand> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProductBrand> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductBrand> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ProductBrand> entities);

    /**
     * 修改数据
     *
     * @param productBrand 实例对象
     * @return 影响行数
     */
    int update(ProductBrand productBrand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

