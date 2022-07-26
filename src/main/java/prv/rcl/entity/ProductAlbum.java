package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 产品相册（展示）表(ProductAlbum)实体类
 *
 * @author rcl
 * @since 2022-07-24 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductAlbum implements Serializable {
    private static final long serialVersionUID = -53401488011867427L;
    
    private Long id;
    /**
     * 商品编号
     */
    private Integer productId;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 图片地址
     */
    private String url;
    /**
     * 视频大小
     */
    private Integer size;
    /**
     * 图片介绍
     */
    private String intro;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 图片状态
     */
    private Integer status;
    /**
     * 资源类型 0=>图片 1=>视频
     */
    private Integer state;
    
    private Date createdAt;
    
    private Date updatedAt;

}

