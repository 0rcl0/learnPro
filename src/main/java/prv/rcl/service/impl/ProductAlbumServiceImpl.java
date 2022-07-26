package prv.rcl.service.impl;

import prv.rcl.entity.ProductAlbum;
import prv.rcl.dao.ProductAlbumDao;
import prv.rcl.service.ProductAlbumService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 产品相册（展示）表(ProductAlbum)表服务实现类
 *
 * @author makejava
 * @since 2022-07-24 15:43:23
 */
@Service("productAlbumService")
public class ProductAlbumServiceImpl implements ProductAlbumService {
    @Resource
    private ProductAlbumDao productAlbumDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductAlbum queryById(Long id) {
        return this.productAlbumDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param productAlbum 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ProductAlbum> queryByPage(ProductAlbum productAlbum, PageRequest pageRequest) {
        long total = this.productAlbumDao.count(productAlbum);
        return new PageImpl<>(this.productAlbumDao.queryAllByLimit(productAlbum, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param productAlbum 实例对象
     * @return 实例对象
     */
    @Override
    public ProductAlbum insert(ProductAlbum productAlbum) {
        this.productAlbumDao.insert(productAlbum);
        return productAlbum;
    }

    /**
     * 修改数据
     *
     * @param productAlbum 实例对象
     * @return 实例对象
     */
    @Override
    public ProductAlbum update(ProductAlbum productAlbum) {
        this.productAlbumDao.update(productAlbum);
        return this.queryById(productAlbum.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.productAlbumDao.deleteById(id) > 0;
    }
}
