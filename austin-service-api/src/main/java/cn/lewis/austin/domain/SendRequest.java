package cn.lewis.austin.domain;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author lewis
 * @description: 发送接口的参数
 * @date: 2023/12/5
 * @Copyright:
 */
@Data
@Accessors(chain = true)
public class SendRequest
{
    /**
     * 执行业务类型
     */
    private String code;

    /**
     * 消息模板Id
     */
    private Long messageTemplateId;

    /**
     * 消息相关的参数
     */
    private MessageParam messageParam;
}
