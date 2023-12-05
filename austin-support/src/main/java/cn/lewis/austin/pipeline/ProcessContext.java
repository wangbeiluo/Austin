package cn.lewis.austin.pipeline;

import cn.lewis.austin.vo.BasicResultVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lewis
 * @description: 责任链上下文
 * @date: 2023/12/5
 * @Copyright:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProcessContext
{
    /**
     * 标识责任链的code
     */
    private String code;

    /**
     * 存储责任链上下文数据的模型
     */
    private ProcessModel processModel;

    /**
     * 责任链中断的标识
     */
    private Boolean needBreak = false;

    /**
     * 流程处理的结果
     */
    BasicResultVO response = BasicResultVO.success();
}
