package com.orangehrm.web.testcases.Admin.Job;

import com.orangehrm.web.base.TestBase;
import com.orangehrm.web.pages.Admin.Job.JobTitle.JobTitle;
import org.testng.annotations.Test;

public class JobTitlesTests extends TestBase {

    @Test(priority = 1)
    public void validate_All_Elements_Present_In_Job_Titles_Page() {
        JobTitle jobTitle = new JobTitle(driver);
        loginPage.loginToPage("Admin", "admin123");
        jobTitle.navigateToJobTitlesPage();
        jobTitle.validateAllElementsPresentInJobTitlePage();
    }

    @Test(priority = 2)
    public void validate_All_Elements_Present_In_Add_Job_Titles_Page() {
        JobTitle jobTitle = new JobTitle(driver);
        loginPage.loginToPage("Admin", "admin123");
        jobTitle.navigateToJobTitlesPage();
        jobTitle.click_on_Add_Button();
        jobTitle.validate_All_Elements_Present_In_Add_JobTitle_Page();
    }
}
