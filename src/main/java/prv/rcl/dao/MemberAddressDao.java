package prv.rcl.dao;

import prv.rcl.entity.MemberAddress;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 用户收货地址(MemberAddress)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-24 15:18:54
 */
public interface MemberAddressDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MemberAddress queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param memberAddress 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<MemberAddress> queryAllByLimit(MemberAddress memberAddress, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param memberAddress 查询条件
     * @return 总行数
     */
    long count(MemberAddress memberAddress);

    /**
     * 新增数据
     *
     * @param memberAddress 实例对象
     * @return 影响行数
     */
    int insert(MemberAddress memberAddress);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MemberAddress> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MemberAddress> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MemberAddress> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MemberAddress> entities);

    /**
     * 修改数据
     *
     * @param memberAddress 实例对象
     * @return 影响行数
     */
    int update(MemberAddress memberAddress);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

