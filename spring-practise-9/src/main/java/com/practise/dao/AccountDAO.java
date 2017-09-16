package com.practise.dao;

import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 16/09/2017.
 */
@Component(value = "myBean")
public class AccountDAO {

    public void addAccount() {
        System.out.println("Class name is: " +this.getClass().getCanonicalName()+ " while adding an account");
    }
}
