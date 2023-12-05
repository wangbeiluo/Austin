package cn.lewis.austin.pipeline;

import lombok.Builder;

/**
 * @author lewis
 * @description: 流程处理的结果
 * @date: 2023/12/5
 * @Copyright:
 */
@Builder
public class ProcessResponse
{
    /** 返回值编码 */
    private final String code;

    /** 返回值描述 */
    private final String description;
}
