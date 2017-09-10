package com.practise.spring;

import java.util.LinkedHashMap;

/**
 * Created by Pratik Ambani on 10/09/2017.
 */
public class Student {

    private String fName;
    private String lName;

    public Student() {

        //TODO 030 We can also retrieve dropdown values from Java Class
        countryOptions = new LinkedHashMap();
        countryOptions.put("IN", "India");
        countryOptions.put("UK", "United Kingdom");
        countryOptions.put("US", "Unites States");
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

    //TODO 030 We can also retrieve dropdown values from Java Class
    private LinkedHashMap<String, String> countryOptions;

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    //TODO 031 radio buttons
    private String favouriteLang;

    public String getFavouriteLang() {
        return favouriteLang;
    }

    public void setFavouriteLang(String favouriteLang) {
        this.favouriteLang = favouriteLang;
    }
}
