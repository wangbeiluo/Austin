package cn.lewis.austin.domain;

/**
 * @author lewis
 * @description: 发送接口的参数
 * @date: 2023/12/5
 * @Copyright:
 */
public class SendRequest
{
    /**
     * 消息模板Id
     */
    private Long messageTemplateId;

    /**
     * 接收者
     * 多个用
     */
    private String receiver;
}
