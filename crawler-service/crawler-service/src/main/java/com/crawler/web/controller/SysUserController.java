package com.crawler.web.controller;

import com.crawler.web.entity.User;
import com.crawler.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@autor Zp
 *@create  14:26
 */
@Controller
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private UserService userService;
        @RequestMapping("/info")
        public String info() {
           User user =  userService.selectByPrimaryKey(1);

           System.out.println(user);
            return "user/user";
        }
}
