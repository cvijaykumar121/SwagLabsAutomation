package com.orangehrm.web.pages.Login;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class LoginPage extends TestBase {
    public WebDriver driver;
    public LoginPageLocators loginPageLocators;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.loginPageLocators = new LoginPageLocators(driver);
    }
}
