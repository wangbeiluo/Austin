package cn.lewis.austin;

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
    public static void main(String[] args)
    {
        SpringApplication.run(AustinApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
