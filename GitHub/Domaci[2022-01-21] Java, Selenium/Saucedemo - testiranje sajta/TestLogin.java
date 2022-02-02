package POMTest;

import POMbase.BasePage;
import POMpages.LogoutPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends BasePage {
    @BeforeMethod
    public void SetUpPage() throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/inventory.html");
        Thread.sleep(2000);

    }
    @Test
    public void userCanLogInWithValidCredentials() throws InterruptedException {
        String validUsername= "standard_user";
        String validPassword= "secret_sauce";

        loginPage.insertUsername(validUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickOnLoginButton();

        String loggedInUrl="https://www.saucedemo.com/inventory.html";
        String actualUrl= driver.getCurrentUrl();
        Thread.sleep(2000);

        Assert.assertEquals(loggedInUrl,actualUrl);

    }
    @Test
    public void userCannotLogInWithInvalidUsername() throws InterruptedException {
        String invalidUsername= "WrongName";
        String validPassword= "secret_sauce";
        String expectedErrorMessage= "Epic sadface: Username and password do not match any user in this service";

        loginPage.insertUsername(invalidUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickOnLoginButton();

        Assert.assertTrue(loginPage.getErrorMessage().isDisplayed());
        Thread.sleep(2000);
        Assert.assertEquals(loginPage.getErrorText(),expectedErrorMessage);
    }
}
