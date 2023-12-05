package cn.lewis.austin;

import cn.lewis.austin.pojo.SmsParam;
import cn.lewis.austin.script.TencentSmsScript;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author lewis
 * @description:
 * @date: 2023/12/5
 * @Copyright:
 */
@SpringBootApplication
@RestController
public class AustinApplication
{
    @Autowired
    private TencentSmsScript tencentSmsScript;

    private final Logger logger = LoggerFactory.getLogger(AustinApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(AustinApplication.class, args);
    }

    /**
     * @param phone 手机号
     * @return
     */
    @GetMapping("/sendSms")
    public String sendSms(String phone,String content)
    {

        /**
         * 这里的content指的是模板占位符的参数值
         */
        SmsParam smsParam = SmsParam.builder()
                .phones(new HashSet<>(Arrays.asList(phone)))
                .content(content)
                .build();

        return tencentSmsScript.send(smsParam);
    }
}
