package com.imooc.pay.service.impl;

import com.imooc.pay.PayApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PayServiceTest extends PayApplicationTests {
    @Autowired
    private PayService payService;
    @Test
    public void create() {
        payService.create("123456259", BigDecimal.valueOf(0.01));
    }
    @Test
    public void test(){}
    @Test
    public void test1(){
        System.out.println("local_dev1_1分支添加的方法");
    }
    @Test
    public void test2(){
        System.out.println("local_dev1_1分支自己开发");
    }
}