package prv.rcl.service;

import prv.rcl.entity.SystemAttribute;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 系统规格表(SystemAttribute)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
public interface SystemAttributeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SystemAttribute queryById(Long id);

    /**
     * 分页查询
     *
     * @param systemAttribute 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SystemAttribute> queryByPage(SystemAttribute systemAttribute, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param systemAttribute 实例对象
     * @return 实例对象
     */
    SystemAttribute insert(SystemAttribute systemAttribute);

    /**
     * 修改数据
     *
     * @param systemAttribute 实例对象
     * @return 实例对象
     */
    SystemAttribute update(SystemAttribute systemAttribute);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
