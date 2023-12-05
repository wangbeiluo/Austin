package cn.lewis.austin.controller;

import cn.lewis.austin.kafkatest.UserLogProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lewis
 * @description:
 * @date: 2023/12/5
 * @Copyright:
 */
@RestController
public class KafkaTestController
{
    @Autowired
    private UserLogProducer userLogProducer;

    /**
     * test insert
     */
    @GetMapping("/kafka/insert")
    public String insert(String userId) {
        userLogProducer.sendLog(userId);

        return null;
    }
}
