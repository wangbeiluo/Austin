package cn.lewis.austin.action;

import cn.lewis.austin.domain.SendTaskModel;
import cn.lewis.austin.pipeline.BusinessProcess;
import cn.lewis.austin.pipeline.ProcessContext;

/**
 * @author lewis
 * @description: 参数校验
 * @date: 2023/12/5
 * @Copyright:
 */
public class ParamAction implements BusinessProcess
{
    @Override
    public void process(ProcessContext context)
    {
        SendTaskModel sendTaskModel = (SendTaskModel) context.getProcessModel();
    }
}
