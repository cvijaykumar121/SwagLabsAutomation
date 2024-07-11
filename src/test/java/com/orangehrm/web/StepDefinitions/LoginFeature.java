package com.orangehrm.web.StepDefinitions;

import com.orangehrm.web.pages.Login.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginFeature {

    @Given("the user is on the login page")
    public void validate_the_presence_of_login_page_header() {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfLoginPageHeader();
    }

    @Then("Validate the presence of Username Input Header")
    public void validate_the_presence_of_username_input_header() {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfUsernameInputHeader();
    }

    @Then("Validate the presence of Username Input field")
    public void validate_the_presence_of_username_input_field() {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfUsernameInputField();
    }

    @Then("Validate the presence of Password Input Header")
    public void validate_the_presence_of_password_input_header() {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfPasswordInputHeader();
    }

    @Then("Validate the presence of Password Input field")
    public void validate_the_presence_of_password_input_field() {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfPasswordInputField();
    }

    @Then("Validate the presence of Login Button")
    public void validate_the_presence_of_login_button() {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfLoginButton();
    }

    @Then("Validate the presence of Forgot Password link")
    public void validate_the_presence_of_forgot_password_link() {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfForgotPasswordLink();
    }

    @Then("Validate the presence of All Footer elements")
    public void validate_the_presence_of_all_footer_elements() {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfFooterElements();
    }

    @Then("the user enters username {string}")
    public void enter_username(String username) {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.enterUsername(username);
    }

    @Then("enters {string}")
    public void enter_password(String password) {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.enterPassword(password);
    }

    @Then("clicks on the login button")
    public void click_on_login_button() {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.clickOnLoginButton();
    }

    @Then("Accept alert")
    public void accept_alert() {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.acceptAlert();
    }

    @Then("the user should be redirected to the dashboard page")
    public void validate_the_dashboard_page() {
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validateDashboardPageHeader();
    }
}
