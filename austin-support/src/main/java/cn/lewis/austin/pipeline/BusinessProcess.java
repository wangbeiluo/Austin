package cn.lewis.austin.pipeline;

/**
 * @author lewis
 * @description: 业务执行器
 * @date: 2023/12/5
 * @Copyright:
 */
public interface BusinessProcess
{
    /**
     * 真正处理逻辑
     * @param context
     */
    void process(ProcessContext context);
}
