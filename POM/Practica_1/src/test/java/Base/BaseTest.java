package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        }

    @BeforeMethod
    public void goHome(){
            driver.get("https://the-internet.herokuapp.com/");
            homepage = new HomePage(driver);
        }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}

