package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String fullName, email, currentAddress, permanentAddress,
    extensionName, extensionEmail, extensionCurrentAddress, extensionPermanentAddress;

      public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public String getExtensionEmail() {
        return extensionEmail;
    }

    public String getExtensionCurrentAddress() {
        return extensionCurrentAddress;
    }

    public String getExtensionPermanentAddress() {
        return extensionPermanentAddress;
    }

    public DataInjection() {

        this.fullName = faker.name().fullName();
        this.email= faker.internet().emailAddress();
        this.currentAddress= faker.address().secondaryAddress();
        this.permanentAddress= faker.address().fullAddress();
        this.extensionName= "Name:";
        this.extensionEmail= "Email:";
        this.extensionCurrentAddress= "Current Address :";
        this.extensionPermanentAddress= "Permananet Address :";


    }
}
