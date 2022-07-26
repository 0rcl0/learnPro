package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单评价表(OrderAppraise)实体类
 *
 * @author rcl
 * @since 2022-07-24 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderAppraise implements Serializable {
    private static final long serialVersionUID = -14249840050488970L;
    
    private Long id;
    /**
     * 订单编码
     */
    private Integer orderId;
    /**
     * 评论内容
     */
    private String info;
    /**
     * 级别 -1差评 0中评 1好评
     */
    private Object level;
    /**
     * 描述相符 1-5
     */
    private Integer descStar;
    /**
     * 物流服务 1-5
     */
    private Integer logisticsStar;
    /**
     * 服务态度 1-5
     */
    private Integer attitudeStar;
    
    private Date createdAt;
    
    private Date updatedAt;
}

