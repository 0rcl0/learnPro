package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 商品主体表(Product)实体类
 *
 * @author rcl
 * @since 2022-07-24 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product implements Serializable {
    private static final long serialVersionUID = 809749887231940854L;
    
    private Long id;
    /**
     * 商品标题
     */
    private String name;
    /**
     * 商品分类编号
     */
    private Integer categoryId;
    /**
     * 商家编号
     */
    private Integer merId;
    
    private Integer freightId;
    /**
     * 类型编号
     */
    private Integer typeId;
    /**
     * 简述
     */
    private String sketch;
    /**
     * 商品描述
     */
    private String intro;
    /**
     * 商品关键字
     */
    private String keywords;
    /**
     * 标签
     */
    private String tags;
    /**
     * 商品型号
     */
    private String marque;
    /**
     * 仓库条码
     */
    private String barcode;
    /**
     * 品牌编号
     */
    private Integer brandId;
    /**
     * 虚拟购买量
     */
    private Integer virtual;
    /**
     * 商品价格
     */
    private Double price;
    /**
     * 市场价格
     */
    private Double marketPrice;
    /**
     * 可使用积分抵消
     */
    private Integer integral;
    /**
     * 库存量
     */
    private Integer stock;
    /**
     * 库存警告
     */
    private Integer warningStock;
    /**
     * 封面图
     */
    private String pictureUrl;
    
    private String posters;
    /**
     * 状态 -1=>下架,1=>上架,2=>预售,0=>未上架
     */
    private Integer status;
    /**
     * 审核状态 -1 审核失败 0 未审核 1 审核成功
     */
    private Integer state;
    /**
     * 是否是套餐
     */
    private Boolean isPackage;
    /**
     * 是否是积分产品
     */
    private Boolean isIntegral;
    /**
     * 排序
     */
    private Integer sort;
    
    private Date deletedAt;
    
    private Date createdAt;
    
    private Date updatedAt;

}

