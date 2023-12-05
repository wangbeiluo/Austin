package cn.lewis.austin.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author lewis
 * @description: 发送消息状态
 * @date: 2023/12/5
 * @Copyright:
 */
@Getter
@ToString
@AllArgsConstructor
public enum SmsStatus
{
    SEND_SUCCESS(10,"调用渠道接口发送成功"),
    RECEIVE_SUCCESS(20,"用户收到短信(收到渠道短信回执，状态成功)"),
    RECEIVE_FAIL(30, "用户收不到短信(收到渠道短信回执，状态失败)");

    private Integer code;
    private String description;
}
