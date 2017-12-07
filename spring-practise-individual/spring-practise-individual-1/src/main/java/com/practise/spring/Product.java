package com.practise.spring;

import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 7/12/2017.
 */

@Component
public class Product {

    private String name;
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
