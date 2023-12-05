package cn.lewis.austin.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author lewis
 * @description: 请求类型
 * @date: 2023/12/5
 * @Copyright:
 */
@Getter
@ToString
@AllArgsConstructor
public enum RequestType
{
    SINGLE(10, "请求接口为 single 类型"),

    BATCH(20, "请求接口为 batch 类型");

    /**
     * code
     */
    private Integer code;

    /**
     * 类型说明
     */
    private String description;
}
