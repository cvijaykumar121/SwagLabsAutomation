package com.orangehrm.web.pages.Login;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
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
        validateText(loginPageHeader, "Login", "Login Page Header Text validated successfully", 5);
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

    public void enterUsername(String username) {
        validatePresenceOfUsernameInputField();
        WebElement usernameInput = loginPageLocators.usernameTextBox;
        sendKeys(usernameInput, username, "Username entered successfully", 5);
    }

    public void validatePresenceOfPasswordInputField() {
        WebElement passwordInput = loginPageLocators.passwordInputText;
        waitForElementToBeVisible(passwordInput, 20, "Validated password input field");
    }

    public void enterPassword(String password) {
        validatePresenceOfPasswordInputField();
        WebElement passwordInput = loginPageLocators.passwordTextBox;
        sendKeys(passwordInput, password, "Password entered successfully", 5);
    }

    public void validatePresenceOfLoginButton() {
        WebElement loginButton = loginPageLocators.loginButton;
        waitForElementToBeVisible(loginButton, 20, "Validated login button successfully");
    }

    public void clickOnLoginButton() {
        validatePresenceOfLoginButton();
        clickElement(loginPageLocators.loginButton, "Clicked on Login button", true, 5);
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

    public void clickOnForgotPasswordLink() {
        validatePresenceOfForgotPasswordLink();
        clickElement(loginPageLocators.forgotPasswordLink, "Clicked on Forgot Password button", true, 5);
    }

    public void validateInvalidCredentialsError() {
        validateText(loginPageLocators.invalidCredentialsErrorMessage, "Invalid credentials", "Validated Invalid credentials error message successfully", 15);
    }

    public void validateRequiredMessageError() {
        validateText(loginPageLocators.requiredErrorMessage, "Required", "Validated Required error message successfully", 15);
    }

    public void validateDashboardPageHeader() {
        WebElement dashboardPageHeader = loginPageLocators.dashboardPageHeader;
        waitForElementToBeVisible(dashboardPageHeader, 20, "Validated Login Page header");
        validateText(dashboardPageHeader, "Dashboard", "Dashboard Page Header Text validated successfully", 5);
    }

    public void acceptAlert() {
        // Check for the presence of an alert
        try {
            waitForAlertToBePresent(5, "Alert displayed");
            Alert alert = driver.switchTo().alert();
            // Accept the alert
            alert.accept();
            logInfo("Alert accepted.", true);
        } catch (NoAlertPresentException e) {
            logInfo("No alert present.", true);
        } catch (TimeoutException e) {
            logInfo("No alert present within the specified timeout.", true);
        }
    }

    public void loginToPage(String validUsername, String validPassword) {
        validatePresenceOfLoginPageHeader();
        enterUsername(validUsername);
        enterPassword(validPassword);
        clickOnLoginButton();
        validateDashboardPageHeader();
    }

    public void validateAllElementsPresentInLoginPage() {
        validatePresenceOfLoginPageHeader();
        validatePresenceOfUsernameInputHeader();
        validatePresenceOfUsernameInputField();
        validatePresenceOfPasswordInputHeader();
        validatePresenceOfPasswordInputField();
        validatePresenceOfLoginButton();
        validatePresenceOfForgotPasswordLink();
        validatePresenceOfFooterElements();
    }
}
