package com.namsoo.blueart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Namsoo on 2017. 4. 4..
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model)
    {
        System.out.print("민수짱");
        return "index";
    }
}
