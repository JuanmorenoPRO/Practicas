package com.demoqa.automation.pageobjects;

import com.paulhammant.ngwebdriver.ByAngularExactBinding;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.xmlgraphics.util.uri.CommonURIResolver;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

@DefaultUrl("https://www.demoqa.com/text-box")

public class TextBoxPage extends PageObject {

    public By userNameInput = By.id("userName");
    public By emailInput = By.id("userEmail");
    public By currentAddressInput = By.id("currentAddress");
    public By permanentAddressInput = By.id("permanentAddress");
    public By submitButton = By.id("submit");
    public By nameValidation= By.id("name");
    public By emailValidation= By.id("email");
    public By currentAddressValidation= By.xpath("//p[@id='currentAddress']");
    public By permanentAddressValidation= By.xpath("//p[@id='permanentAddress']");

    public By getNameValidation() {
        return nameValidation;
    }

    public By getEmailValidation() {
        return emailValidation;
    }

    public By getCurrentAddressValidation() {
        return currentAddressValidation;
    }

    public By getPermanentAddressValidation() {
        return permanentAddressValidation;
    }

    public void setUserNameInput(String string) {
        getDriver().findElement(userNameInput).sendKeys(string);
    }

    public void setEmailInput(String string) {
        getDriver().findElement(emailInput).sendKeys(string);
    }

    public void setCurrentAddressInput(String string) {
        getDriver().findElement(currentAddressInput).sendKeys(string);
    }

    public void setPermanentAddressInput(String string) {
        getDriver().findElement(permanentAddressInput).sendKeys(string);
    }

    public void setSubmitButton() {
        getDriver().findElement(submitButton).submit();
    }

    public void Validations(String expectedName, String expectedEmail,
                            String expectedCurrentAddress,
                            String expectedPermanentAddress){

        assertEquals(getDriver().findElement(nameValidation).getText(), expectedName);
        assertEquals(getDriver().findElement(emailValidation).getText(), expectedEmail);
        assertEquals(getDriver().findElement(currentAddressValidation).getText(), expectedCurrentAddress);
        assertEquals(getDriver().findElement(permanentAddressValidation).getText(), expectedPermanentAddress);
    }


}

