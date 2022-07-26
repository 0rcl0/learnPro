package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * 购物车 实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberCart {
    private long id;
    private long memberId;
    private Date createdAt;
    private Date updatedAt;
}
