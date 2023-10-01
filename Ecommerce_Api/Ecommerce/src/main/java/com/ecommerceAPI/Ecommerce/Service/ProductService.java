package com.ecommerceAPI.Ecommerce.Service;

import com.ecommerceAPI.Ecommerce.Model.Order;
import com.ecommerceAPI.Ecommerce.Model.Product;
import com.ecommerceAPI.Ecommerce.Repo.ProductRepo;
import com.ecommerceAPI.Ecommerce.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public String productPost(List<Product> newProduct) {
        productRepo.saveAll(newProduct);
        return  "added product";
    }

    public Optional<Product> getProductById(Integer id) {
       return   productRepo.findById(id);
    }

    public List<Product> getProduct() {
      return   productRepo.findAll();
    }

    public String DeleteProduct(Integer id) {
            productRepo.deleteById(id);
            return "Delete Success";
        }

    public List<Product> getCategory(String category) {

        return  productRepo.findAll();
    }
}
