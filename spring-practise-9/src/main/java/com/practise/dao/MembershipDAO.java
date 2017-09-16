package com.practise.dao;

import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 16/09/2017.
 */
@Component
public class MembershipDAO {


/*
    public void addAccount() {
        System.out.println("This is MembershipDAO#addAccount()");
    }
*/

    public String addAccount() {
        return "Class name is:"  +this.getClass().getCanonicalName()+ " while adding an account";
    }

    public String addAccount(String name) {
        return "Name is: " +name;
    }
}
