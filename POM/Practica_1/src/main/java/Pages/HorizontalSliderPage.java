package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private  WebDriver driver;
    private By Slider = By.xpath("//input[@type='range']");
    private By value = By.id("range");


    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSliderValue(String desiredValue){

        while (!getSliderValue().equals(desiredValue)){
            driver.findElement(Slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue(){
      return driver.findElement(value).getText();
    }

}
