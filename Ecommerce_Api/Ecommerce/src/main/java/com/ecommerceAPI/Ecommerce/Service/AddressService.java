package com.ecommerceAPI.Ecommerce.Service;

import com.ecommerceAPI.Ecommerce.Model.Address;
import com.ecommerceAPI.Ecommerce.Repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public String AddressPost(List<Address> newPost) {
        addressRepo.saveAll(newPost);
        return  "Address Added";
    }
}
