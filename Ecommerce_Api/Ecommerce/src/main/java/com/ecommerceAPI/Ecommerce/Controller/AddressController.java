package com.ecommerceAPI.Ecommerce.Controller;

import com.ecommerceAPI.Ecommerce.Model.Address;
import com.ecommerceAPI.Ecommerce.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {


    @Autowired
    AddressService addressService;

    @PostMapping("post/addres")
    public String AddressPost(@RequestBody List<Address> newPost){
        return  addressService.AddressPost(newPost);
    }


}
