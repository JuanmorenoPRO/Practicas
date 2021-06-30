package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoqa.com/automation-practice-form")
public class FormPage extends PageObject {
    public By firstNameInput = By.id("firstName");
    public By lastNameInput = By.id("lastName");
    public By userEmailInput = By.id("userEmail");
    public By genderSelection= By.xpath("//label[contains(@for, 'gender-radio-1')]");
    public By userNumberInput = By.id("userNumber");
    public By dateOfBirthInput = By.id("dateOfBirthInput");
    public By subjectInput = By.id("subjectsInput");
    public By hobbiesSelection = By.id("hobbies-checkbox-2");
    public By currentAddressInput = By.id("currentAddress");
    public By selectFile = By.id("uploadPicture");
    public By submitButton = By.id("submit");

    public void setFirstNameInput(String string) {
        getDriver().findElement(firstNameInput).sendKeys(string);
    }

    public void setLastNameInput(String string) {
        getDriver().findElement(lastNameInput).sendKeys(string);
    }

    public void setGenderSelection() {
        getDriver().findElement(genderSelection).click();
    }

    public void setUserNumberInput(String string) {
        getDriver().findElement(userNumberInput).sendKeys(string);
    }

    public void setDateOfBirthInput(String string) {
        getDriver().findElement(dateOfBirthInput).sendKeys(string);
    }

    public void setSubjectInput(String string) {
        getDriver().findElement(subjectInput).sendKeys(string);
    }

    public void setHobbiesSelection() {
        getDriver().findElement(hobbiesSelection).click();
    }

    public void setCurrentAddressInput(String string) {
        getDriver().findElement(currentAddressInput).sendKeys(string);
    }

    public void setSelectFile(String absolutePath) {
        getDriver().findElement(selectFile).sendKeys(absolutePath);
    }

    public void setUserEmailInput(String string) {
        getDriver().findElement(userEmailInput).sendKeys(string);
    }
}


