package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * 用户地址表
 * @author rcl
 * @since 2022-07-24 11:18:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberAddress {
    private long id;
    /**
     * 用户ID
     */
    private long memberId;
    /**
     * 收货人姓名
     */
    private String nickName;
    /**
     * 联系电话
     */
    private String tel;
    /**
     * 省
     */
    private int prov;
    /**
     * 市
     */
    private int city;
    /**
     * 区
     */
    private int area;
    /**
     * 收货详细地址 --> 街道地址
     */
    private String address;
    /**
     * 邮政编码
     */
    private int number;
    /**
     * 1 --> 默认地址
     * 0 --> 其他地址
     */
    private boolean Default;
    /**
     * 删除时间
     */
    private Date deletedAt;
    /**
     * 更新时间
     */
    private Date updatedAt;
    /**
     * 创建时间
     */
    private Date createdAt;

}
