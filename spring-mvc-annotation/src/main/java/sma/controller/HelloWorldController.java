package sma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import smc.domain.User;

/**
 * @Author ISJINHAO
 * @Date 2020/12/29 15:46
 */
@Controller
public class HelloWorldController {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private User user;

    @GetMapping("/helloworld")
    @ResponseBody
    public User index(@RequestParam("name") String name) {
        System.out.println(applicationContext.getParent());
        System.out.println(applicationContext.getClass());
        user.setName(name);
        return user;
    }

}
