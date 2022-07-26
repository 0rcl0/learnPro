package prv.rcl.service;

import prv.rcl.entity.ProductAlbum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 产品相册（展示）表(ProductAlbum)表服务接口
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
public interface ProductAlbumService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductAlbum queryById(Long id);

    /**
     * 分页查询
     *
     * @param productAlbum 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ProductAlbum> queryByPage(ProductAlbum productAlbum, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param productAlbum 实例对象
     * @return 实例对象
     */
    ProductAlbum insert(ProductAlbum productAlbum);

    /**
     * 修改数据
     *
     * @param productAlbum 实例对象
     * @return 实例对象
     */
    ProductAlbum update(ProductAlbum productAlbum);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
