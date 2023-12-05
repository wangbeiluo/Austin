package cn.lewis.austin.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author lewis
 * @description: 消息参数
 * @date: 2023/12/5
 * @Copyright:
 */
@Data
@Accessors(chain = true)
public class MessageParam
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
    private List<MessageParam> messageParamList;
}
