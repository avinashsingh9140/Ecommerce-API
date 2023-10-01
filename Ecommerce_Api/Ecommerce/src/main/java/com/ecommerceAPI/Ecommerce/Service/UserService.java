package com.ecommerceAPI.Ecommerce.Service;

import com.ecommerceAPI.Ecommerce.Model.Product;
import com.ecommerceAPI.Ecommerce.Model.User;
import com.ecommerceAPI.Ecommerce.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public String userPost(List<User> newUser) {

        userRepo.saveAll(newUser);
        return "added user";
    }

    public Optional<User> getProductById(Integer id) {
        return   userRepo.findById(id);
    }
}
