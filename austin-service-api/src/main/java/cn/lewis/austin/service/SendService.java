package cn.lewis.austin.service;

import cn.lewis.austin.domain.SendRequest;
import cn.lewis.austin.domain.SendResponse;

/**
 * @author lewis
 * @description: 发送接口
 * @date: 2023/12/5
 * @Copyright:
 */
public interface SendService
{
    SendResponse send(SendRequest sendRequest);

    SendResponse batchSend(SendRequest sendRequest);
}
