package com.demoqa.automation.steps;

import com.demoqa.automation.pageobjects.FileUploadPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class FileUploadSteps {

    FileUploadPage fileUploadPage = new FileUploadPage();

    @Step
    public void openBrowser(){
        fileUploadPage.open();
    }

    @Step
    public void uploadAFile(){
        fileUploadPage.setSelectFile("C:\\Users\\jmoreno\\Pictures\\leonisa.png");
    }





}
