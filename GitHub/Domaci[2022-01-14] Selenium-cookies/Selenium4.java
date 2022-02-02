package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class Selenium4 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/login");

        WebElement userName= driver.findElement(By.id("userName"));
        userName.sendKeys("tinab992");
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("Qwerty123!@#");
        WebElement button= driver.findElement(By.id("login"));
        button.click();

        Cookie kolacic= new Cookie("userName", "tinab992");
        driver.manage().addCookie(kolacic);
        Cookie kolacic1= new Cookie("userID","fe152156-acd7-4031-993d-68b29a85c26e");
        driver.manage().addCookie(kolacic1);
        Cookie kolacic2= new Cookie("expires","2022-01-23T15%3A13%3A32.643Z");
        driver.manage().addCookie(kolacic2);
        Cookie kolacic3= new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InRpbmFiOTkyIiwicGFzc3dvcmQiOiJRd2VydHkxMjMhQCMiLCJpYXQiOjE2NDIzNDYwMTJ9.07Dz3ogpFBPCTM7lVy-xyZr-KUcrFmremKhsIVICy-0");
        driver.manage().addCookie(kolacic3);

        Thread.sleep(2000);
        driver.navigate().to("https://demoqa.com/profile");
        Thread.sleep(2000);
        WebElement logout=driver.findElement(By.id("submit"));
        logout.click();
        Thread.sleep(2000);

        String actualURL= driver.getCurrentUrl();
        System.out.println(actualURL);

        String expectedURl= "https://demoqa/login";
        Assert.assertEquals(actualURL,expectedURl);
        Thread.sleep(2000);
        driver.quit();




    }
}
