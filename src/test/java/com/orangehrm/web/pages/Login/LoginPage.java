package com.orangehrm.web.pages.Login;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends TestBase {
    public WebDriver driver;
    public LoginPageLocators loginPageLocators;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.loginPageLocators = new LoginPageLocators(driver);
    }

    public void validateLoginPageHeader() {
        WebElement loginPageHeader = loginPageLocators.loginHeader;
        waitForElementToBeVisible(loginPageHeader, 20, "Validated username input header");
    }

    public void validateUsernameInputHeader() {
        WebElement usernameInputHeader = loginPageLocators.usernameInputText;
        waitForElementToBeVisible(usernameInputHeader, 20, "Validated username input header");
    }

    public void validatePasswordInputHeader() {
        WebElement passwordInputHeader = loginPageLocators.passwordInputText;
        waitForElementToBeVisible(passwordInputHeader, 20, "Validated password input header");
    }


}
