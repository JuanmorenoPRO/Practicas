package com.demoqa.automation.models;


import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));
    private String firstName, lastName, email, gender, mobile, dateOfBirth,subjects, Address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getAddress() {
        return Address;
    }

    public DataInjection(){
        this.firstName = faker.name().firstName();
        this.lastName= faker.name().lastName();
        this.email= faker.internet().emailAddress();
        this.mobile= faker.phoneNumber().cellPhone();
        this.dateOfBirth= faker.date().birthday().toString();
        this.subjects= faker.name().name();
        this.Address= faker.address().secondaryAddress();
    }
}
