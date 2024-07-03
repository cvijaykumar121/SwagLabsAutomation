package com.orangehrm.web.testcases.Admin.Job;

import com.orangehrm.web.base.TestBase;
import com.orangehrm.web.pages.Admin.Job.JobTitle.JobTitle;
import com.orangehrm.web.pages.Login.LoginPage;
import org.testng.annotations.Test;

public class ValidatePresenceOfAllElementsInJobTitlePage extends TestBase {

    @Test(priority = 1)
    public void validate_Add_Job_Title_Page_Header() {
//        LoginPage loginPage = new LoginPage(driver);
        JobTitle jobTitle = new JobTitle(driver);

        loginPage.loginToPage(validUsername, validPassword);
        jobTitle.navigateToJobTitlesPage();
    }
}
