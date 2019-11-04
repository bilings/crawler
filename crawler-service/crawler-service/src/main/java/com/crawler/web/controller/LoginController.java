package com.crawler.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *@autor Zp
 *@create  9:45
 */
    @Controller
    @RequestMapping("/login")
public class LoginController {

        @RequestMapping("/toLogin")
        public ModelAndView toLogin(ModelAndView modelAndView) {
            modelAndView.setViewName("login/login");
            /*List<String> userList=new ArrayList<String>();
            userList.add("admin");
            userList.add("user1");
            userList.add("user2");
            modelAndView.addObject("userList", userList);*/
            return modelAndView;
        }

    @RequestMapping("/login")
    @ResponseBody
    public void login(String name, String password, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("********"+name+"********"+password);
        response.sendRedirect("/index/index");
    }
}
