package prv.rcl.service.impl;

import prv.rcl.entity.TransactionRecord;
import prv.rcl.dao.TransactionRecordDao;
import prv.rcl.service.TransactionRecordService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import prv.rcl.service.TransactionRecordService;

import javax.annotation.Resource;

/**
 * 交易记录表(TransactionRecord)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
@Service("transactionRecordService")
public class TransactionRecordServiceImpl implements TransactionRecordService {
    @Resource
    private TransactionRecordDao transactionRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TransactionRecord queryById(Long id) {
        return this.transactionRecordDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param transactionRecord 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TransactionRecord> queryByPage(TransactionRecord transactionRecord, PageRequest pageRequest) {
        long total = this.transactionRecordDao.count(transactionRecord);
        return new PageImpl<>(this.transactionRecordDao.queryAllByLimit(transactionRecord, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param transactionRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TransactionRecord insert(TransactionRecord transactionRecord) {
        this.transactionRecordDao.insert(transactionRecord);
        return transactionRecord;
    }

    /**
     * 修改数据
     *
     * @param transactionRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TransactionRecord update(TransactionRecord transactionRecord) {
        this.transactionRecordDao.update(transactionRecord);
        return this.queryById(transactionRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.transactionRecordDao.deleteById(id) > 0;
    }
}
