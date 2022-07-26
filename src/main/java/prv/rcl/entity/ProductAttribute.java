package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 自定义规格表(ProductAttribute)实体类
 *
 * @author rcl
 * @since 2022-07-24 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductAttribute implements Serializable {
    private static final long serialVersionUID = 162281325834407916L;
    
    private Long id;
    /**
     * 商品编码
     */
    private Integer productId;
    /**
     * 规格名称
     */
    private String name;
    /**
     * 排序
     */
    private Integer sort;
}

