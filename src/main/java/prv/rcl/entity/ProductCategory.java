package prv.rcl.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 产品分类表(ProductCategory)实体类
 *
 * @author makejava
 * @since 2022-07-24 11:38:50
 */
public class ProductCategory implements Serializable {
    private static final long serialVersionUID = 632080199510252527L;
    
    private Long id;
    /**
     * 分类表
     */
    private String name;
    /**
     * 父分类编号
     */
    private Integer pid;
    /**
     * 封面图
     */
    private String cover;
    /**
     * 首页块级状态 1=>显示
     */
    private Integer indexBlockStatus;
    /**
     * 状态 1=>正常
     */
    private Integer status;
    /**
     * 排序
     */
    private Integer sort;
    
    private Date createdAt;
    
    private Date updatedAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getIndexBlockStatus() {
        return indexBlockStatus;
    }

    public void setIndexBlockStatus(Integer indexBlockStatus) {
        this.indexBlockStatus = indexBlockStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}

