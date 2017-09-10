package com.practise.spring;

/**
 * Created by Pratik Ambani on 10/09/2017.
 */
public class Student {

    private String fName;
    private String lName;

    public Student() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    //TODO 029 Dropdown options
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
