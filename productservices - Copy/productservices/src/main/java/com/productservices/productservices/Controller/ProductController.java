package com.productservices.productservices.Controller;

import com.productservices.productservices.dtos.ProductDto;
import com.productservices.productservices.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController

public class ProductController {
    @GetMapping("/products")
    public String getAllProducts(){
        return "Getting All Products";
    }

     @GetMapping("/products/{productId}")
    public  String getSingleProduct(@PathVariable("productId") Long productId){
        return  "Single Product with id "+productId;
    }
     @PostMapping("/products")
    public  String addNewProduct(@RequestBody ProductDto productDto){
        return  "Adding new product"+productDto;
    }

@PutMapping("/products/{productId}")
    public  String updateProduct(@PathVariable("productId") Long productId){
        return "Updating product";
    }


    @DeleteMapping("/products/{productId}")

    public  String deleteProduct(@PathVariable("productId") Long productId){
        return "Deleting a Product with id"+productId;
    }
}
