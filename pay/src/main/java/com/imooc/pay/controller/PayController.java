package com.imooc.pay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("pay")
public class PayController {
    @RequestMapping("create")
    public ModelAndView create(){
        return new ModelAndView("create");
    }
}
