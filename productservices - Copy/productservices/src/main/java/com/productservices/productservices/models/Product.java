package com.productservices.productservices.models;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter

public class Product extends BaseMode {

    private double title;
    private String description;
    private Category category;
    private String imageUrl;

}