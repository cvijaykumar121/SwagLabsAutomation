package com.orangehrm.web.testcases.AdminUser.Admin.Job;

import com.orangehrm.web.base.TestBase;
import com.orangehrm.web.pages.Admin.Job.JobTitle.JobTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobTitlesTests extends TestBase {
    public String validJobTitle;
    public String validJobDescription;
    public String validNote;

    @BeforeMethod
    public void setUpJobTitles() {
        validJobTitle = config.getProperty("validJobTitle");
        validJobDescription = config.getProperty("validJobDescription");
        validNote = config.getProperty("validNote");
    }

    @Test(priority = 1)
    public void validate_All_Elements_Present_In_Job_Titles_Page() {
        JobTitle jobTitle = new JobTitle(driver);
        loginPage.loginToPage(validUsername_Admin, validPassword_Admin);
        jobTitle.navigateToJobTitlesPage();
        jobTitle.validateAllElementsPresentInJobTitlePage();
    }

    @Test(priority = 2)
    public void validate_All_Elements_Present_In_Add_Job_Titles_Page() {
        JobTitle jobTitle = new JobTitle(driver);
        loginPage.loginToPage(validUsername_Admin, validPassword_Admin);
        jobTitle.navigateToJobTitlesPage();
        jobTitle.click_on_Add_Button();
        jobTitle.validate_All_Elements_Present_In_Add_JobTitle_Page();
    }

    @Test(priority = 3)
    public void validate_Add_Job_Title_With_Valid_Details() {
        JobTitle jobTitle = new JobTitle(driver);
        loginPage.loginToPage(validUsername_Admin, validPassword_Admin);
        jobTitle.navigateToJobTitlesPage();
        jobTitle.click_on_Add_Button();
        jobTitle.Add_Job_Title_By_Entering_All_Valid_Data_In_All_Fields(validJobTitle, validJobDescription, validNote);
        jobTitle.validate_JobTitle_Present_In_JobTitles_Page(validJobTitle, validJobDescription);
    }

    @Test(priority = 4)
    public void validate_Delete_Job_Title_Using_Trash_Icon_In_Table() {
        JobTitle jobTitle = new JobTitle(driver);
        loginPage.loginToPage(validUsername_Admin, validPassword_Admin);
        jobTitle.navigateToJobTitlesPage();
        jobTitle.delete_Job_Title_Using_Trash_Icon_In_Job_Titles_Page(validJobTitle);
//        jobTitle.validate_Deleted_Job_Title_Is_Not_Present_In_Job_Titles_Table(validJobTitle);
    }


    @Test(priority = 5)
    public void validate_Add_job_title_with_only_required_fields() {
        JobTitle jobTitle = new JobTitle(driver);
        loginPage.loginToPage(validUsername_Admin, validPassword_Admin);
        jobTitle.navigateToJobTitlesPage();
        jobTitle.click_on_Add_Button();
        jobTitle.Add_Job_Title_By_Entering_Only_Required_Fields(validJobTitle);
        jobTitle.validate_JobTitle_Present_In_JobTitles_Page(validJobTitle);
    }

    @Test(priority = 6)
    public void validate_Error_While_Adding_job_title_with_empty_fields() {
        JobTitle jobTitle = new JobTitle(driver);
        loginPage.loginToPage(validUsername_Admin, validPassword_Admin);
        jobTitle.navigateToJobTitlesPage();
        jobTitle.click_on_Add_Button();
        jobTitle.validate_Error_Message_Displayed_While_Fields_Are_Empty();
    }
}
