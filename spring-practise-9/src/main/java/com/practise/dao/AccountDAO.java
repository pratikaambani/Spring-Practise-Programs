package com.practise.dao;

import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 16/09/2017.
 */
@Component
public class AccountDAO {

    public void addAccount() {
        System.out.println("Class name is: " +this.getClass().getCanonicalName()+ " while adding an account");
        System.out.println("Aspects suspected somewhere around this execution ;) ");
    }

/*
    public void addAccountFailure() throws Exception {
        System.out.println("Failure aspects suspected somewhere around this execution ;) ");
        throw new RuntimeException();
    }
*/





    //Practise 2
    public void updateAccount() {
        System.out.println("This is updateAccount()");
    }


}
