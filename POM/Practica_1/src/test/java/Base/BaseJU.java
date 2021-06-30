package Base;

import Pages.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseJU {
    private WebDriver driver;
    protected HomePage homepage;


 @BeforeAll

    public  void setUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
    }


    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homepage = new HomePage(driver);
    }

    @AfterAll
    public void tearDown(){
        driver.quit();
    }

}

