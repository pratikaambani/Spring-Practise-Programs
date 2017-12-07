package com.practise.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 7/12/2017.
 */
@Component
public class Company {

    private Product product;

    @Value("Small Car")
    private String prname;

    @Value("4,00,000")
    private String prprice;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getPrname() {
        return prname;
    }

    public void setPrname(String prname) {
        this.prname = prname;
    }

    public String getPrprice() {
        return prprice;
    }

    public void setPrprice(String prprice) {
        this.prprice = prprice;
    }
}
