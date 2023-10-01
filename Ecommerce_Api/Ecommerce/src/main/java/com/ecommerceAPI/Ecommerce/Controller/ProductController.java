package com.ecommerceAPI.Ecommerce.Controller;

import com.ecommerceAPI.Ecommerce.Model.Order;
import com.ecommerceAPI.Ecommerce.Model.Product;
import com.ecommerceAPI.Ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    @PostMapping("post/product")
    public String productPost(@RequestBody List<Product> newProduct){
        return  productService.productPost(newProduct);
    }
    @GetMapping("products")
    public List<Product> getProduct(){
     return   productService.getProduct();
    }

    @GetMapping("product/category")
    public List<Product> getCategory(@RequestParam("category") String category) {
        return productService.getCategory(category);
    }
    @DeleteMapping("delete/product")
    public String DeleteProduct(@RequestParam Integer id){
        return productService.DeleteProduct(id);
    }

}
