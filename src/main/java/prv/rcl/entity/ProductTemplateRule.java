package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (ProductTemplateRule)实体类
 *
 * @author rcl
 * @since 2022-07-24 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductTemplateRule implements Serializable {
    private static final long serialVersionUID = 234263120692629370L;
    
    private Long id;
    /**
     * 模板编码
     */
    private Integer templateId;
    /**
     * 城市
     */
    private String city;
    /**
     * 默认数量
     */
    private Integer defaultNumber;
    /**
     * 默认运费
     */
    private Double defaultPrice;
    /**
     * 新增数量
     */
    private Integer createNumber;
    /**
     * 新增运费
     */
    private Double createPrice;
    
    private Date createdAt;
    
    private Date updatedAt;

}

