package com.practise.aopdemo;

import com.practise.dao.AccountDAO;
import com.practise.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Pratik Ambani on 16/09/2017.
 */
public class MainDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDao = context.getBean("accountDAO", AccountDAO.class);
        accountDao.addAccount();
        accountDao.addAccount("Hiiiiii, from param");

        MembershipDAO membershipDao = context.getBean("membershipDAO", MembershipDAO.class);
        System.out.println(membershipDao.addAccount());
        membershipDao.randomMethod();

        context.close();

    }
}
