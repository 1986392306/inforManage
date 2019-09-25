package com.hunau.test;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2018/7/4.
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "刘金龙，学号为201841882102";
    }
}