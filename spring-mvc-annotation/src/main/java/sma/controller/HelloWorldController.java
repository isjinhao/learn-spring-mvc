package sma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ISJINHAO
 * @Date 2020/12/29 15:46
 */
@Controller
public class HelloWorldController {

    @GetMapping("/helloworld")
    @ResponseBody
    public String index(@RequestParam("name") String name) {

        return "hello world -> " + name;
    }

}
