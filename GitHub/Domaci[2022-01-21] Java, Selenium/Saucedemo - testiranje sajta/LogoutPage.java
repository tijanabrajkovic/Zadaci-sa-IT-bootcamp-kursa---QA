package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement menuButton;
    WebElement logOutButton;

    public LogoutPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getMenuButton() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }

    public WebElement getLogOutButton() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }
}
