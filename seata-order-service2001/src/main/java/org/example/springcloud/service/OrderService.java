package org.example.springcloud.service;

import org.example.springcloud.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
