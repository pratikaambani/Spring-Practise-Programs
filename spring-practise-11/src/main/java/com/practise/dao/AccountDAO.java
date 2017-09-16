package com.practise.dao;

import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 16/09/2017.
 */
@Component
public class AccountDAO {

    public void addAccount() {
        System.out.println("AccountDAO#addAccount()");
    }

    public void addAccount(String name) {
        System.out.println("AccountDAO#addAccount(name): " +name);
    }

    public void updateAccount() {
        System.out.println("AccountDAO#updateAccount()");
    }


}
