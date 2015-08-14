package com.zuozuo.views;

import com.zuozuo.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by zuozuo on 15-8-14.
 */
@Controller
@RequestMapping("/")
public class HelloWorld {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "hello/world/", method = RequestMethod.GET)
    public String sayHi() {
        System.out.println(userService.getNameById(1));
        return "hello_world";
    }
}
