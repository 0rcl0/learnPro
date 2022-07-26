package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 购物车内容(MemberCartItem)实体类
 *
 * @author rcl
 * @since 2022-07-24 11:38:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberCartItem implements Serializable {
    private static final long serialVersionUID = -71683102949880864L;

    private Long id;
    /**
     * 购物车编码
     */
    private Integer cartId;
    /**
     * 商品sku信息
     */
    private String productDesc;
    /**
     * 商品快照
     */
    private String productImg;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 价格
     */
    private Double price;
    /**
     * 商品编码
     */
    private Integer productId;
    /**
     * 店铺编码
     */
    private Integer supplierId;
    /**
     * 商品sku编码
     */
    private Integer skuId;
    /**
     * 商品数量
     */
    private Integer number;

    private Date createdAt;

    private Date updatedAt;

}
