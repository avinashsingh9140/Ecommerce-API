package com.ecommerceAPI.Ecommerce.Controller;

import com.ecommerceAPI.Ecommerce.Model.Order;
import com.ecommerceAPI.Ecommerce.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.OutputDeviceAssigned;
import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("post/order")
    public String OrderPost(@RequestBody  List<Order> newOrder){
        return  orderService.OrderPost(newOrder);
    }

    @GetMapping("oderBy/Id/{id}")
    public Optional<Order> getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }
}
