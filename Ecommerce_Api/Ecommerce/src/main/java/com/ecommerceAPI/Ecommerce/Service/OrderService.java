package com.ecommerceAPI.Ecommerce.Service;

import com.ecommerceAPI.Ecommerce.Model.Order;
import com.ecommerceAPI.Ecommerce.Repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public String OrderPost(List<Order> newOrder) {

        orderRepo.saveAll(newOrder);
        return  "order added";
    }

    public Optional<Order> getOrderById(Integer id) {
            return orderRepo.findById(id);
    }

}
