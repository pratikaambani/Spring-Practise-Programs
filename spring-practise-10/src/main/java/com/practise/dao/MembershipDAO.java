package com.practise.dao;

import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 16/09/2017.
 */
@Component
public class MembershipDAO {

    public String addAccount() {
        return "MembershipDAO#addAccount()";
    }

    public void randomMethod() {
        System.out.println("MembershipDAO#randomMethod()");
    }
}
