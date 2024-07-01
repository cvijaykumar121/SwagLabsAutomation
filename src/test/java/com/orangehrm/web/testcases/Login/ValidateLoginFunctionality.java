package com.orangehrm.web.testcases.Login;

import com.orangehrm.web.base.TestBase;
import com.orangehrm.web.pages.Dashboard.DashboardPage;
import org.testng.annotations.Test;

public class ValidateLoginFunctionality extends TestBase {

    @Test(priority = 1)
    public void verifyLoginWithValidCredentials() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        loginPage.validatePresenceOfLoginPageHeader();
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        dashboardPage.validateDashboardPageHeader();
    }
}
