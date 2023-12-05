package cn.lewis.austin.service;

import cn.lewis.austin.domain.BatchSendRequest;
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
    /**
     * 单文案发送接口
     * @param sendRequest
     * @return
     */
    SendResponse send(SendRequest sendRequest);


    /**
     * 多文案发送接口
     * @param batchSendRequest
     * @return
     */
    SendResponse batchSend(BatchSendRequest batchSendRequest);
}
