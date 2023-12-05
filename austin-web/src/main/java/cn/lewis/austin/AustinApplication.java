package cn.lewis.austin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    private final Logger logger = LoggerFactory.getLogger(AustinApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(AustinApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        logger.error("error logback for austin");
        logger.info("info logback for austin");
        return String.format("Hello %s!", name);
    }
}
