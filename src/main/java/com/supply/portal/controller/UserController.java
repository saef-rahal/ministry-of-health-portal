package com.supply.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 3/30/2020.
 */
@Controller
public class UserController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
