package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.FileUploadSteps;
import com.demoqa.automation.util.Times;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FileUploadStepDefinitions {

    @Steps
    FileUploadSteps fileUploadSteps;

    @Given("^A USer wants to upload a file$")
    public void aUSerWantsToUploadAFile() {
        // Write code here that turns the phrase above into concrete actions
    fileUploadSteps.openBrowser();
    }

    @When("^Clicks on upload a file$")
    public void clicksOnUploadAFile() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    fileUploadSteps.uploadAFile();
        Times.waitFor(10000);
    }

    @Then("^hen User should see the file name$")
    public void henUserShouldSeeTheFileName() {
        // Write code here that turns the phrase above into concrete actions
    }
}


