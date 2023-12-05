package cn.lewis.austin.script;

import cn.lewis.austin.domain.SmsRecord;
import cn.lewis.austin.pojo.SmsParam;

import java.util.List;

/**
 * @author lewis
 * @description:
 * @date: 2023/12/5
 * @Copyright:
 */
public interface SmsScript
{
    /**
     * @param smsParam 发送短信参数
     * @return 渠道商接口返回值
     */
    List<SmsRecord> send(SmsParam smsParam);
}
