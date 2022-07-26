package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 交易记录表(TransactionRecord)实体类
 *
 * @author rcl
 * @since 2022-07-24 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionRecord implements Serializable {
    private static final long serialVersionUID = -31306996379007405L;
    
    private Long id;
    
    private String orderSn;
    /**
     * 事件详情
     */
    private String events;
    /**
     * 结果详情
     */
    private String result;
    
    private Date createdAt;
    
    private Date updatedAt;

}

