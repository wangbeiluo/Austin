package cn.lewis.austin.pipeline;

import java.util.List;

/**
 * @author lewis
 * @description: 业务执行模板（把责任链的逻辑串起来）
 * @date: 2023/12/5
 * @Copyright:
 */
public class ProcessTemplate
{
    private List<BusinessProcess> processList;

    public List<BusinessProcess> getProcessList() {
        return processList;
    }
    public void setProcessList(List<BusinessProcess> processList) {
        this.processList = processList;
    }
}
