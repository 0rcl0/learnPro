package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 商品属性选项表(ProductAttributeOption)实体类
 *
 * @author makejava
 * @since 2022-07-24 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductAttributeOption implements Serializable {
    private static final long serialVersionUID = -40508271763008811L;
    
    private Long id;
    /**
     * 选项名称
     */
    private String name;
    /**
     * 属性编码
     */
    private Integer attrId;
    /**
     * 排序
     */
    private Integer sort;


}

