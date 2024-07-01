package com.orangehrm.web.testcases.Login;

import com.orangehrm.web.base.TestBase;
import com.orangehrm.web.pages.Dashboard.DashboardPage;
import com.orangehrm.web.pages.UserMenu.UserMenu;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateLoginFunctionality extends TestBase {
    String validUsername;
    String validPassword;
    String invalidUsername;
    String invalidPassword;
    String caseSensitiveUsername;
    String caseSensitivePassword;

    @BeforeMethod
    public void setUpBeforeValidateLoginFunctionalityTests() {
        validUsername = config.getProperty("validUsername");
        validPassword = config.getProperty("validPassword");
        invalidUsername = config.getProperty("invalidUsername");
        invalidPassword = config.getProperty("invalidPassword");
        caseSensitiveUsername = config.getProperty("caseSensitiveUsername");
        caseSensitivePassword = config.getProperty("caseSensitivePassword");
    }

    @Test(priority = 1)
    public void verify_Login_With_Valid_Credentials() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        loginPage.validatePresenceOfLoginPageHeader();
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        dashboardPage.validateDashboardPageHeader();
    }

    @Test(priority = 2)
    public void Verify_login_with_invalid_username() {
        loginPage.validatePresenceOfLoginPageHeader();
        loginPage.enterUsername(invalidUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        loginPage.validateInvalidCredentialsError();
    }

    @Test(priority = 3)
    public void Verify_login_with_invalid_password() {
        loginPage.validatePresenceOfLoginPageHeader();
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(invalidPassword);
        loginPage.clickOnLoginButton();
        loginPage.validateInvalidCredentialsError();
    }

    @Test(priority = 4)
    public void Verify_login_with_both_invalid_username_and_password() {
        loginPage.validatePresenceOfLoginPageHeader();
        loginPage.enterUsername(invalidUsername);
        loginPage.enterPassword(invalidPassword);
        loginPage.clickOnLoginButton();
        loginPage.validateInvalidCredentialsError();
    }

    @Test(priority = 5)
    public void Verify_login_with_blank_username() {
        loginPage.validatePresenceOfLoginPageHeader();
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        loginPage.validateRequiredMessageError();
    }

    @Test(priority = 6)
    public void Verify_login_with_blank_password() {
        loginPage.validatePresenceOfLoginPageHeader();
        loginPage.enterUsername(validUsername);
        loginPage.clickOnLoginButton();
        loginPage.validateRequiredMessageError();
    }

    @Test(priority = 7)
    public void Verify_case_sensitivity_of_the_username() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        loginPage.validatePresenceOfLoginPageHeader();
        loginPage.enterUsername(caseSensitiveUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        dashboardPage.validateDashboardPageHeader();
    }

    @Test(priority = 7)
    public void Verify_case_sensitivity_of_the_password() {
        loginPage.validatePresenceOfLoginPageHeader();
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(caseSensitivePassword);
        loginPage.clickOnLoginButton();
        loginPage.validateInvalidCredentialsError();
    }

    @Test(priority = 8)
    public void Verify_All_Links_Are_Present_In_User_Menu() {
        UserMenu userMenu = new UserMenu(driver);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();

        userMenu.validateUserMenuIsPresent();
        userMenu.validateProfilePictureIsPresent();
        userMenu.validateUserDropdownIsPresent();
        userMenu.clickOnUserDropdown();
        userMenu.validateDropdownMenus();
    }

    @Test(priority = 9)
    public void Verify_the_logout_functionality() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        UserMenu userMenu = new UserMenu(driver);

        loginPage.validatePresenceOfLoginPageHeader();
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();

        dashboardPage.validateDashboardPageHeader();
        userMenu.validateUserMenuIsPresent();
        userMenu.clickOnUserDropdown();
        userMenu.clickOnLogoutMenuOption();

        loginPage.validatePresenceOfLoginPageHeader();
    }
}
