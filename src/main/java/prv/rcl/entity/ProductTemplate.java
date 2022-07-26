package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (ProductTemplate)实体类
 *
 * @author rcl
 * @since 2022-07-24 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductTemplate implements Serializable {
    private static final long serialVersionUID = -79129757312558000L;
    
    private Long id;
    /**
     * 模板名称
     */
    private String title;
    /**
     * 类型 0 自定义运费 1 包邮
     */
    private Integer type;
    
    private Date createdAt;
    
    private Date updatedAt;

}

