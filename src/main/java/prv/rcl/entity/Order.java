package prv.rcl.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单表(Order)实体类
 * @author rcl
 * @since 2022-07-24 11:18:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order implements Serializable {
    private static final long serialVersionUID = 218794595110691736L;
    
    private Long id;
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 交易号
     */
    private String orderSn;
    /**
     * 客户编号
     */
    private Integer memberId;
    /**
     * 商户编码
     */
    private Integer supplierId;
    /**
     * 商户名称
     */
    private String supplierName;
    /**
     * 订单状态 0未付款,1已付款,2已发货,3已签收,-1退货申请,-2退货中,-3已退货,-4取消交易
     */
    private Integer orderStatus;
    /**
     * 用户售后状态 0 未发起售后 1 申请售后 -1 售后已取消 2 处理中 200 处理完毕
     */
    private Integer afterStatus;
    /**
     * 商品数量
     */
    private Integer productCount;
    /**
     * 商品总价
     */
    private Double productAmountTotal;
    /**
     * 实际付款金额
     */
    private Double orderAmountTotal;
    /**
     * 运费金额
     */
    private Double logisticsFee;
    /**
     * 收货地址编码
     */
    private Integer addressId;
    /**
     * 支付渠道 0余额 1微信 2支付宝
     */
    private Integer payChannel;
    /**
     * 订单支付单号
     */
    private String outTradeNo;
    /**
     * 第三方支付流水号
     */
    private String escrowTradeNo;
    /**
     * 付款时间
     */
    private Integer payTime;
    /**
     * 发货时间
     */
    private Integer deliveryTime;
    /**
     * 订单结算状态 0未结算 1已结算
     */
    private Integer orderSettlementStatus;
    /**
     * 订单结算时间
     */
    private Integer orderSettlementTime;
    /**
     * 是否是套餐
     */
    private Boolean isPackage;
    /**
     * 是否是积分产品
     */
    private Boolean isIntegral;
    
    private Date createdAt;
    
    private Date updatedAt;
    
    private Date deletedAt;


}

