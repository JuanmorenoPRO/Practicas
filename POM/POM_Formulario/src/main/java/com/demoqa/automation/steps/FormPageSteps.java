package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.FormPage;
import com.demoqa.automation.util.Javascript;
import com.demoqa.automation.util.Times;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class FormPageSteps  {

    FormPage formPage = new FormPage();
    DataInjection dataInjection= new DataInjection();

    @Step
    public void openBrowser(){
        formPage.open();
    }
    @Step
    public void fillFieldsInFormPage() throws InterruptedException {

        formPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        formPage.setFirstNameInput(dataInjection.getFirstName());
        formPage.setLastNameInput(dataInjection.getLastName());
        formPage.setUserEmailInput(dataInjection.getEmail());
        Times.waitFor(2000);
        formPage.setGenderSelection();
        formPage.setUserNumberInput("3003876637");
        formPage.setDateOfBirthInput(dataInjection.getDateOfBirth());
        formPage.setSubjectInput(dataInjection.getSubjects());
        Times.waitFor(2000);
        Javascript.clickJS(formPage.getDriver(), formPage.hobbiesSelection);
        formPage.setSelectFile("C:\\Users\\jmoreno\\Pictures\\leonisa.png");
        formPage.setCurrentAddressInput(dataInjection.getAddress());
        Javascript.clickJS(formPage.getDriver(), formPage.submitButton);
        Times.waitFor(10000);

    }


}
