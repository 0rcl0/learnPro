package prv.rcl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 国家实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Countries {
    private long id;
    /**
     * 洲别码
     */
    private long continentId;
    /**
     * 国家编码
     */
    private String code;
    /**
     * 英文名称
     */
    private String name;
    /**
     * 英文全名
     */
    private String fullName;
    /**
     * 中文名称
     */
    private String cname;
    /**
     * 中文全名
     */
    private String fullCname;
    /**
     *
     */
    private String lowerName;
    /**
     * 简介
     */
    private String remark;
}
