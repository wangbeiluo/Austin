package cn.lewis.austin.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author lewis
 * @description: 发送ID类型枚举
 * @date: 2023/12/5
 * @Copyright:
 */
@Getter
@ToString
@AllArgsConstructor
public enum IdType
{
    USER_ID(10, "userid"),
    DID(20, "did"),
    PHONE(30, "phone"),
    OPEN_ID(40, "openId"),
    EMAIL(50, "email");

    private Integer code;
    private String description;
}
