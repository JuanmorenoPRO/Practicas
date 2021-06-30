package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.TextBoxPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PracticeTextBoxStepDefinitions {

    @Steps
    TextBoxPageSteps textBoxPageSteps;

    @Given("^a web user wants to enter text box$")
    public void aWebUserWantsToEnterTextBox() {
        // Write code here that turns the phrase above into concrete actions
        textBoxPageSteps.openBrowser();
    }

    @When("^he fills all the requested fields in text box section$")
    public void heFillsAllTheRequestedFieldsInTextBoxSection() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        textBoxPageSteps.fillTextBox();
    }

    @Then("^he should see him data down$")
    public void heShouldSeeHimDataDown() {
        // Write code here that turns the phrase above into concrete actions
        textBoxPageSteps.validationsTextBox();
    }

}
