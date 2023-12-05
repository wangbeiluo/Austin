package cn.lewis.austin.kafkatest;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author lewis
 * @description: 定义用户发送的日志数据
 * @date: 2023/12/5
 * @Copyright:
 */
@Data
@Accessors(chain = true)
public class UserLog
{
    private String username;
    private String userid;
    private String state;
}
