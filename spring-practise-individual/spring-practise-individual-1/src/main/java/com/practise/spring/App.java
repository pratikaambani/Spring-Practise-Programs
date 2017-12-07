package com.practise.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Pratik Ambani on 7/12/2017.
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("spring-practise-7/beans.xml");

        Company companyObj = context.getBean("company", Company.class);

        System.out.println("Name: " +companyObj.getPrname());
        System.out.println("Price: " +companyObj.getPrprice());
    }
}
