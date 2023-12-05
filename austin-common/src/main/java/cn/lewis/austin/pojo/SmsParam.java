package cn.lewis.austin.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

/**
 * @author lewis
 * @description: 发送短信参数
 * @date: 2023/12/5
 * @Copyright:
 */
@Data
@Builder
public class SmsParam
{
    /**
     * 需要发送的手机号
     */
    private Set<String> phones;

    /**
     * 发送文案
     */
    private String content;
}
