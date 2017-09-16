package com.practise.aopdemo;

import com.practise.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Pratik Ambani on 16/09/2017.
 */
public class MainDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO dao = context.getBean("accountDAO", AccountDAO.class);
        dao.addAccount();
        try {
            dao.addAccountFailure();
        } catch (Exception e) {
            e.printStackTrace();
        }

        context.close();

    }
}
