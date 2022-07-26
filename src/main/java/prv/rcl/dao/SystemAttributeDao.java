package prv.rcl.dao;

import prv.rcl.entity.SystemAttribute;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 系统规格表(SystemAttribute)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-24 15:18:58
 */
public interface SystemAttributeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SystemAttribute queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param systemAttribute 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<SystemAttribute> queryAllByLimit(SystemAttribute systemAttribute, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param systemAttribute 查询条件
     * @return 总行数
     */
    long count(SystemAttribute systemAttribute);

    /**
     * 新增数据
     *
     * @param systemAttribute 实例对象
     * @return 影响行数
     */
    int insert(SystemAttribute systemAttribute);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SystemAttribute> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SystemAttribute> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SystemAttribute> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SystemAttribute> entities);

    /**
     * 修改数据
     *
     * @param systemAttribute 实例对象
     * @return 影响行数
     */
    int update(SystemAttribute systemAttribute);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

