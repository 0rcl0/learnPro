package prv.rcl.dao;

import prv.rcl.entity.ProductAttributeOption;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 商品属性选项表(ProductAttributeOption)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-24 15:18:58
 */
public interface ProductAttributeOptionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductAttributeOption queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param productAttributeOption 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<ProductAttributeOption> queryAllByLimit(ProductAttributeOption productAttributeOption, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param productAttributeOption 查询条件
     * @return 总行数
     */
    long count(ProductAttributeOption productAttributeOption);

    /**
     * 新增数据
     *
     * @param productAttributeOption 实例对象
     * @return 影响行数
     */
    int insert(ProductAttributeOption productAttributeOption);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductAttributeOption> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProductAttributeOption> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductAttributeOption> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ProductAttributeOption> entities);

    /**
     * 修改数据
     *
     * @param productAttributeOption 实例对象
     * @return 影响行数
     */
    int update(ProductAttributeOption productAttributeOption);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

