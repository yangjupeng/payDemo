package com.imooc.pay.service;

import java.math.BigDecimal;

public interface IPayService {
    /**
     * 发起创建支付
     */
    void create(String orderId, BigDecimal amount);
}
