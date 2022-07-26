package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 系统规格表(SystemAttribute)实体类
 *
 * @author rcl
 * @since 2022-07-24 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SystemAttribute implements Serializable {
    private static final long serialVersionUID = -70398010502132094L;
    
    private Long id;
    /**
     * 商品类别编号
     */
    private Integer categoryId;
    /**
     * 属性名称
     */
    private String name;
    /**
     * 排列次序
     */
    private Integer sort;

}

