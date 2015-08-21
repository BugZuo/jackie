package com.zuozuo.views;

import com.zuozuo.service.IAlbumService;
import com.zuozuo.service.ISessionService;
import com.zuozuo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zuozuo on 15-8-14.
 */
@Controller
@RequestMapping("/")
public class HelloWorld {

    @Autowired
    private IUserService userService;

    @Autowired
    private IAlbumService albumService;

    @Autowired
    private ISessionService sessionService;

    @RequestMapping(value = "hello/", method = RequestMethod.GET)
    public String sayHi(@RequestParam long id) {

        System.out.println(userService.getNameById(id));

        System.out.println(albumService.getDescById(id));

        String idStr = String.valueOf(id);

        sessionService.set("id", idStr);

        System.out.println(sessionService.get(idStr));

        return "hello_world";
    }
}
