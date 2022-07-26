package prv.rcl.dao;

import prv.rcl.entity.TransactionRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 交易记录表(TransactionRecord)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-24 15:18:58
 */
public interface TransactionRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TransactionRecord queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param transactionRecord 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TransactionRecord> queryAllByLimit(TransactionRecord transactionRecord, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param transactionRecord 查询条件
     * @return 总行数
     */
    long count(TransactionRecord transactionRecord);

    /**
     * 新增数据
     *
     * @param transactionRecord 实例对象
     * @return 影响行数
     */
    int insert(TransactionRecord transactionRecord);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TransactionRecord> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TransactionRecord> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TransactionRecord> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TransactionRecord> entities);

    /**
     * 修改数据
     *
     * @param transactionRecord 实例对象
     * @return 影响行数
     */
    int update(TransactionRecord transactionRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

