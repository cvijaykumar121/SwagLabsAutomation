package com.orangehrm.web.pages.Login;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends TestBase {
    public WebDriver driver;
    public LoginPageLocators loginPageLocators;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.loginPageLocators = new LoginPageLocators(driver);
    }

    public void validatePresenceOfLoginPageHeader() {
        WebElement loginPageHeader = loginPageLocators.loginHeader;
        waitForElementToBeVisible(loginPageHeader, 20, "Validated Login Page header");
    }

    public void validatePresenceOfUsernameInputHeader() {
        WebElement usernameInputHeader = loginPageLocators.usernameInputText;
        waitForElementToBeVisible(usernameInputHeader, 20, "Validated username input header");
    }

    public void validatePresenceOfPasswordInputHeader() {
        WebElement passwordInputHeader = loginPageLocators.passwordInputText;
        waitForElementToBeVisible(passwordInputHeader, 20, "Validated password input header");
    }

    public void validatePresenceOfUsernameInputField() {
        WebElement usernameInput = loginPageLocators.usernameTextBox;
        waitForElementToBeVisible(usernameInput, 20, "Validated username input field");
    }

    public void validatePresenceOfPasswordInputField() {
        WebElement passwordInput = loginPageLocators.passwordInputText;
        waitForElementToBeVisible(passwordInput, 20, "Validated password input field");
    }

    public void validatePresenceOfLoginButton() {
        WebElement loginButton = loginPageLocators.loginButton;
        waitForElementToBeVisible(loginButton, 20, "Validated login button successfully");
    }

    public void validatePresenceOfForgotPasswordLink() {
        WebElement forgotPasswordLink = loginPageLocators.forgotPasswordLink;
        waitForElementToBeVisible(forgotPasswordLink, 20, "Validated forgot password link successfully");

        String textFromLink = getTextFromElement(forgotPasswordLink, 5);
        validateText(forgotPasswordLink, "Forgot your password?", "Validated text from forgot password link", 5);
    }

    public void validatePresenceOfFooterElements() {
        List<WebElement> footerElements = loginPageLocators.loginFooterElements;
        System.out.println("Size of all footer elements: " + footerElements.size());
    }
}
