package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 市级范围
 * @author rcl
 * @since 2022-07-24 21:16:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cities {
    private long id;
    private long stateId;
    private String code;
    /**
     * 英文名称
     */
    private String name;
    /**
     * 中文名称
     */
    private String cname;
    /**
     * 英文名称小写
     */
    private String lowerName;
    /**
     * 编码
     */
    private String codeFull;
}
