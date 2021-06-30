package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.TextBoxPage;
import com.demoqa.automation.util.Javascript;
import com.demoqa.automation.util.Times;
import net.serenitybdd.screenplay.questions.JavaScript;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;

public class TextBoxPageSteps  {

    TextBoxPage textBoxPage = new TextBoxPage();
    DataInjection dataInjection = new DataInjection();

    @Step
    public void openBrowser(){
        textBoxPage.open();
    }

    @Step
    public void fillTextBox() throws InterruptedException {

        textBoxPage.setUserNameInput(dataInjection.getFullName());
        textBoxPage.setEmailInput(dataInjection.getEmail());
        textBoxPage.setCurrentAddressInput(dataInjection.getCurrentAddress());
        textBoxPage.setPermanentAddressInput(dataInjection.getPermanentAddress());
        Times.waitFor(5000);
        Javascript.clickJS(textBoxPage.getDriver(), textBoxPage.submitButton);
        Times.waitFor(5000);
    }

    @Step

    public void validationsTextBox(){

        textBoxPage.Validations(dataInjection.getExtensionName()+dataInjection.getFullName(),
                dataInjection.getExtensionEmail()+dataInjection.getEmail(),
                dataInjection.getExtensionCurrentAddress()+dataInjection.getCurrentAddress(),
                dataInjection.getExtensionPermanentAddress()+dataInjection.getPermanentAddress());
    }









}
