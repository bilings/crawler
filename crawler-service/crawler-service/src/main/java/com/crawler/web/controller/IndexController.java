package com.crawler.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *@autor zp
 *@create  13:50
 */
@Controller
@RequestMapping("/index")
public class IndexController {
        @RequestMapping("/index")
        public String login() {
           return "index/index";
        }
}
