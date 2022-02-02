package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public WebDriverWait wdwait;
    public WebDriver driver;
    WebElement username;
    WebElement password;
    WebElement login;
    WebElement errorMessage;


    public LoginPage(WebDriverWait wdwait, WebDriver driver) {
        this.wdwait = wdwait;
        this.driver = driver;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLogin() {
        return driver.findElement(By.id("login-button"));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.tagName("h3"));
    }

    //************************************************************************
    public void insertUsername(String username){
        this.getUsername().clear();
        this.getUsername().sendKeys(username);

    }
    public void insertPassword(String password){
        this.getPassword().clear();
        this.getPassword().sendKeys(password);
    }
    public void clickOnLoginButton(){
        this.getLogin().click();
    }
    public String getErrorText() {
        return this.getErrorMessage().getText();
    }

}

