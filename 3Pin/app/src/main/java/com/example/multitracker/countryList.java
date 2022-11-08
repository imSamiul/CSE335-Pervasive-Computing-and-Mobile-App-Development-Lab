package com.example.multitracker;

public class countryList {
    String countryName,countryCurrencyName;
    int imageID;

    public countryList( int imageID, String countryName, String countryCurrencyName) {
        this.countryName = countryName;
        this.countryCurrencyName = countryCurrencyName;
        this.imageID = imageID;
    }
}
