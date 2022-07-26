package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 规格属性绑定表(ProductAttributeAndOption)实体类
 *
 * @author rcl
 * @since 2022-07-24 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductAttributeAndOption implements Serializable {
    private static final long serialVersionUID = -85897794068029793L;
    
    private Long id;
    /**
     * sku编码
     */
    private Integer skuId;
    /**
     * 属性选项编码
     */
    private Integer optionId;
    /**
     * 属性编码
     */
    private Integer attributeId;
    /**
     * 排序
     */
    private Integer sort;
    
    private Integer supplierOptionId;

}

