package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 个人理解 街道
 * @author rcl
 * @since 2022-07-24 21:33:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Region {
    private long id;
    private long cityId;
    private String code;
    private String name;
    private String cname;
    private String lowerName;
    private String codeFull;
}
