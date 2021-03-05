package com.supremepole.springcloud.controller;

import com.supremepole.springcloud.po.Order;
import com.supremepole.springcloud.util.ServiceInfoUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @GetMapping("/order/{id}")
    public String findOrderById(@PathVariable String id){
        Order order=new Order();
        order.setId("123");
        order.setPrice(23.5);
        order.setReceiverAddress("beijing");
        order.setReceiverName("xiaoqiang");
        order.setReceiverPhone("13422343311");
        System.out.println(ServiceInfoUtil.getPort());
        return order.toString();
    }
}
