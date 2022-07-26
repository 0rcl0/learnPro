package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 个人理解（省）
 * @author rcl
 * @since 2022-07-24 21:33:17
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class State {
    private long id;
    private long country_id;
    private String code;
    private String name;
    private String cname;
    private String lowerName;
    private String codeFull;
    private long areaId;
}
