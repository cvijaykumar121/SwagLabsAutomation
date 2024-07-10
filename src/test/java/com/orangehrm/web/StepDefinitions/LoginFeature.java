package com.orangehrm.web.StepDefinitions;

import com.orangehrm.web.pages.Login.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginFeature {

    @Given("I validate the presence of Login Page Header")
    public void i_validate_the_presence_of_login_page_header() {
        System.out.println("Inside i_validate_the_presence_of_login_page_header() method");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfLoginPageHeader();
    }

    @Then("I validate the presence of Username Input Header")
    public void i_validate_the_presence_of_username_input_header() {
        System.out.println("Inside i_validate_the_presence_of_username_input_header()");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfUsernameInputHeader();
    }

    @Then("I validate the presence of Username Input field")
    public void i_validate_the_presence_of_username_input_field() {
        System.out.println("Inside i_validate_the_presence_of_username_input_field() method");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfUsernameInputField();
    }

    @Then("I validate the presence of Password Input Header")
    public void i_validate_the_presence_of_password_input_header() {
        System.out.println("Inside i_validate_the_presence_of_password_input_header() method");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfPasswordInputHeader();
    }

    @Then("I validate the presence of Password Input field")
    public void i_validate_the_presence_of_password_input_field() {
        System.out.println("Inside i_validate_the_presence_of_password_input_field() method");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfPasswordInputField();
    }

    @Then("I validate the presence of Login Button")
    public void i_validate_the_presence_of_login_button() {
        System.out.println("Inside i_validate_the_presence_of_login_button() method");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfLoginButton();
    }

    @Then("I validate the presence of Forgot Password link")
    public void i_validate_the_presence_of_forgot_password_link() {
        System.out.println("Inside i_validate_the_presence_of_forgot_password_link() method");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfForgotPasswordLink();
    }

    @Then("I validate the presence of All Footer elements")
    public void i_validate_the_presence_of_all_footer_elements() {
        System.out.println("Inside i_validate_the_presence_of_all_footer_elements() method");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validatePresenceOfFooterElements();
    }


    @Then("I enter Username")
    public void i_enter_username() {
        System.out.println("Inside i_enter_username() method");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.enterUsername("Admin");
    }

    @Then("I enter Password")
    public void i_enter_password() {
        System.out.println("Inside i_enter_password() method");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.enterPassword("admin123");
    }

    @Then("I Click on Login Button")
    public void i_click_on_login_button() {
        System.out.println("Inside i_click_on_login_button() method");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.clickOnLoginButton();
    }

    @Then("I accept alert")
    public void i_accept_alert() {
        System.out.println("Inside i_accept_alert() method");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.acceptAlert();
    }

    @Then("I validate the Dashboard page")
    public void i_validate_the_dashboard_page() {
        System.out.println("Inside i_validate_the_dashboard_page() method");
        LoginPage loginPage = new LoginPage(Hooks.driver);
        loginPage.validateDashboardPageHeader();
    }
}
