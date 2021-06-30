package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.FormPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;



public class PracticeFormStepDefinitions {
    @Steps
    FormPageSteps formpagesteps;

    @Given("^A Student want to register in a website$")
    public void aStudentWantToRegisterInAWebsite() {
        // Write code here that turns the phrase above into concrete actions
        formpagesteps.openBrowser();
    }


    @When("^The student fills all the fields$")
    public void theStudentFillsAllTheFields() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        formpagesteps.fillFieldsInFormPage();
    }

    @Then("^The student should see all the information in a new window$")
    public void theStudentShouldSeeAllTheInformationInANewWindow() {
        // Write code here that turns the phrase above into concrete actions

    }

}
