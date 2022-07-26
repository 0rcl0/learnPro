package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 商品品牌表(ProductBrand)实体类
 *
 * @author makejava
 * @since 2022-07-24 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductBrand implements Serializable {
    private static final long serialVersionUID = 547141675621881998L;
    
    private Long id;
    /**
     * 商品类别编号
     */
    private Integer productCategoryId;
    /**
     * 品牌名称
     */
    private String name;
    /**
     * 图片url
     */
    private String imageUrl;
    /**
     * 排列次序
     */
    private Integer sort;
    /**
     * 状态
     */
    private Integer status;
    
    private Date createdAt;
    
    private Date updatedAt;

}

