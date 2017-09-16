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

        AccountDAO dao = context.getBean("accountDAO", AccountDAO.class);

        dao.addAccount();
        System.out.println("Again calling same method ;) ");
        dao.addAccount("Hiiiiii, from param");

        dao.addAccount();
        /*
        try {
            dao.addAccountFailure();
        } catch (Exception e) {
            e.printStackTrace();
        }
        */

        MembershipDAO membershipDao = context.getBean("membershipDAO", MembershipDAO.class);
        //membershipDao.addAccount();
        System.out.println("In Method: " +membershipDao.addAccount());
        System.out.println("Printing name: " +membershipDao.addAccount("Pratik"));
        System.out.println("\n \n \n \n");

        context.close();
    }
}
