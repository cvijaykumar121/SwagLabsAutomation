package com.orangehrm.web.testcases.Login;

import com.orangehrm.web.base.TestBase;
import org.testng.annotations.Test;

public class ValidatePresenceOfAllElementsInLoginPage extends TestBase {

    @Test(priority = 1)
    public void validatePresenceOfLoginPageHeaderInLoginPage() {
        loginPage.validatePresenceOfLoginPageHeader();
    }

    @Test(priority = 2)
    public void validatePresenceOfUsernameInputHeader() {
        loginPage.validatePresenceOfUsernameInputHeader();
    }

    @Test(priority = 3)
    public void validatePresenceOfUsernameInputField() {
        loginPage.validatePresenceOfUsernameInputField();
    }

    @Test(priority = 3)
    public void validatePresenceOfPasswordInputHeader() {
        loginPage.validatePresenceOfPasswordInputHeader();
    }

    @Test(priority = 4)
    public void validatePresenceOfPasswordInputField() {
        loginPage.validatePresenceOfPasswordInputField();
    }

    @Test(priority = 5)
    public void validatePresenceOfLoginButton() {
        loginPage.validatePresenceOfLoginButton();
    }

    @Test(priority = 6)
    public void validatePresenceOfForgotPasswordLink() {
        loginPage.validatePresenceOfForgotPasswordLink();
    }

    @Test(priority = 7)
    public void validatePresenceOfFooterElements() {
        loginPage.validatePresenceOfFooterElements();
    }
}
