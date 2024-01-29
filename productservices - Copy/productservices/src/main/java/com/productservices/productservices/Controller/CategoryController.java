package com.productservices.productservices.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CategoryController {
    @GetMapping("/categories")

    public  String  getAllCatogories(){
        return  " Getting all categories";
    }

    public  String getProductsInCatogory(){
        return "Get Products in catogery";
    }
}
