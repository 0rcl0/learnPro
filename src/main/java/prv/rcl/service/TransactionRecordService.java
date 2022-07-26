package prv.rcl.service;

import prv.rcl.entity.TransactionRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 交易记录表(TransactionRecord)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
public interface TransactionRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TransactionRecord queryById(Long id);

    /**
     * 分页查询
     *
     * @param transactionRecord 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TransactionRecord> queryByPage(TransactionRecord transactionRecord, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param transactionRecord 实例对象
     * @return 实例对象
     */
    TransactionRecord insert(TransactionRecord transactionRecord);

    /**
     * 修改数据
     *
     * @param transactionRecord 实例对象
     * @return 实例对象
     */
    TransactionRecord update(TransactionRecord transactionRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
