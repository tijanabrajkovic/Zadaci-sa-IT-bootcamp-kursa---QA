package POMbase;

import POMpages.LoginPage;
import POMpages.LogoutPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {
    public WebDriverWait wdwait;
    public WebDriver driver;
    public LoginPage loginPage;
    public LogoutPage logoutPage;


    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        wdwait= new WebDriverWait(driver, Duration.ofSeconds(15));
        loginPage= new LoginPage(wdwait, driver);
        logoutPage= new LogoutPage(driver,wdwait);
    }

    @AfterClass
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }


}
