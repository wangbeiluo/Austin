package cn.lewis.austin.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author lewis
 * @description: 全局响应状态枚举
 * @date: 2023/12/5
 * @Copyright:
 */
@Getter
@ToString
@AllArgsConstructor
public enum RespStatusEnum
{
    /**
     * OK：操作成功
     */
    SUCCESS("00000", "操作成功"),
    FAIL("00001", "操作失败"),

    /**
     * 客户端
     */
    CLIENT_BAD_PARAMETERS("A0100", "客户端参数错误"),

    /**
     * 系统
     */
    SERVICE_ERROR("B0001", "服务执行异常"),
    RESOURCE_NOT_FOUND("B0404", "资源不存在"),
    ;

    /**
     * 响应状态
     */
    private final String code;
    /**
     * 响应编码
     */
    private final String msg;
}
