package cn.lewis.austin.service;

import cn.lewis.austin.domain.BatchSendRequest;
import cn.lewis.austin.domain.SendRequest;
import cn.lewis.austin.domain.SendResponse;
import cn.lewis.austin.domain.SendTaskModel;
import cn.lewis.austin.enums.RequestType;
import cn.lewis.austin.pipeline.ProcessContext;
import cn.lewis.austin.pipeline.ProcessController;
import cn.lewis.austin.pojo.TaskInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lewis
 * @description: 实现发送接口
 * @date: 2023/12/5
 * @Copyright:
 */
@Service
public class SendServiceImpl implements SendService
{
    @Autowired
    private ProcessController processController;

    @Override
    public SendResponse send(SendRequest sendRequest) {
        SendTaskModel sendTaskModel = SendTaskModel.builder()
                .requestType(RequestType.SINGLE.getCode())
                .messageParam(sendRequest.getMessageParam())
                .taskInfo(TaskInfo.builder().messageTemplateId(sendRequest.getMessageTemplateId()).build())
                .build();

        ProcessContext context = ProcessContext.builder()
                .code(sendRequest.getCode())
                .processModel(sendTaskModel).build();

        ProcessContext process = processController.process(context);

        return new SendResponse(process.getResponse().getCode(), process.getResponse().getMsg());
    }

    @Override
    public SendResponse batchSend(BatchSendRequest batchSendRequest)
    {
        SendTaskModel sendTaskModel = SendTaskModel.builder()
                .requestType(RequestType.BATCH.getCode())
                .messageParamList(batchSendRequest.getMessageParamList())
                .taskInfo(TaskInfo.builder().messageTemplateId(batchSendRequest.getMessageTemplateId()).build())
                .build();

        ProcessContext context = ProcessContext.builder()
                .code(batchSendRequest.getCode())
                .processModel(sendTaskModel).build();

        ProcessContext process = processController.process(context);

        return new SendResponse(process.getResponse().getCode(), process.getResponse().getMsg());
    }
}
