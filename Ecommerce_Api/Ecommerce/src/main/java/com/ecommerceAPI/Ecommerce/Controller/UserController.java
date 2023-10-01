package com.ecommerceAPI.Ecommerce.Controller;

import com.ecommerceAPI.Ecommerce.Model.Order;
import com.ecommerceAPI.Ecommerce.Model.User;
import com.ecommerceAPI.Ecommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("post/user")
    public String userPost(@RequestBody  List<User> newUser){
     return   userService.userPost(newUser);
    }

    @GetMapping("user/Id/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getProductById(id);
    }


}
