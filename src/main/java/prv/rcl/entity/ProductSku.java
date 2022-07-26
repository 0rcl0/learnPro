package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * sku 表(ProductSku)实体类
 *
 * @author rcl
 * @since 2022-07-24 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductSku implements Serializable {
    private static final long serialVersionUID = -91564155275636229L;
    
    private Long id;
    /**
     * 商品编码
     */
    private Integer productId;
    /**
     * sku名称
     */
    private String name;
    /**
     * 主图
     */
    private String img;
    /**
     * 价格
     */
    private Double price;
    /**
     * 库存
     */
    private Integer stock;
    /**
     * 商品编码
     */
    private String code;
    /**
     * 商品条形码
     */
    private String barcode;
    /**
     * sku串
     */
    private String data;

}

