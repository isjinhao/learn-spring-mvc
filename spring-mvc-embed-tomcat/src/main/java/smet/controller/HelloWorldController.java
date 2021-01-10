package smet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ISJINHAO
 * @Date 2021/1/8 19:21
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}