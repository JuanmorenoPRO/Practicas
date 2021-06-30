package com.demoqa.automation.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoqa.com/upload-download")
public class FileUploadPage extends PageObject {

    public By selectFile = By.id("uploadFile");

    public void setSelectFile(String absolutepath) {
        getDriver().findElement(selectFile).sendKeys(absolutepath);
    }
}
