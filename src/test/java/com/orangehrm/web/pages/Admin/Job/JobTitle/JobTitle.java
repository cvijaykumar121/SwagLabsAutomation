package com.orangehrm.web.pages.Admin.Job.JobTitle;

import com.orangehrm.web.base.TestBase;
import com.orangehrm.web.pages.Login.LoginPage;
import com.orangehrm.web.pages.SideMenu.SideMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobTitle extends TestBase {
    public WebDriver driver;
    public JobTitleLocators jobTitleLocators;
    public SideMenu sideMenu;
    public LoginPage loginPage;

    public JobTitle(WebDriver driver) {
        this.driver = driver;
        this.jobTitleLocators = new JobTitleLocators(driver);
        sideMenu = new SideMenu(driver);
        loginPage = new LoginPage(driver);
    }

    private void clickOnJobNavButton() {
        WebElement jobNavButton = jobTitleLocators.jobNavButton;
        waitForElementToBeClickable(jobNavButton, 5, "Job Nav button is clickable");
        clickElement(jobNavButton, "Job Nav button clicked successfully", true, 5);
    }

    public void clickOnJobNavOptions(String option) {
        clickOnJobNavButton();
        if(option.equalsIgnoreCase("job titles")) {
            WebElement jobTitleOption = jobTitleLocators.jobTitlesLink;
            waitForElementToBeClickable(jobTitleOption, 5, "Job Titles option is clickable");
            clickElement(jobTitleOption, "Job Titles Option is clicked successfully", true, 5);
            validate_Job_Title_Page_Header();
        } else if(option.equalsIgnoreCase("pay grades")) {
            WebElement payGradesOption = jobTitleLocators.payGradesLink;
            waitForElementToBeClickable(payGradesOption, 5, "Pay Grades option is clickable");
            clickElement(payGradesOption, "Pay Grades Option is clicked successfully", true, 5);
        } else if(option.equalsIgnoreCase("job categories")) {
            WebElement jobCategoriesOption = jobTitleLocators.jobCategoriesLink;
            waitForElementToBeClickable(jobCategoriesOption, 5, "Job Categories option is clickable");
            clickElement(jobCategoriesOption, "Job Categories Option is clicked successfully", true, 5);
        } else if(option.equalsIgnoreCase("work shifts")) {
            WebElement workShiftsOption = jobTitleLocators.workShiftsLink;
            waitForElementToBeClickable(workShiftsOption, 5, "Work Shifts option is clickable");
            clickElement(workShiftsOption, "Work Shifts Option is clicked successfully", true, 5);
        }
    }

    public void validate_Job_Title_Page_Header() {
        WebElement jobTitleHeader = jobTitleLocators.jobTitlesHeader;
        waitForElementToBeVisible(jobTitleHeader, 10);
        validateText(jobTitleHeader, "Job Titles", "Validated Job Title successfully", 5);
    }

    public void validate_Job_Title_Input_Text_Is_Present() {
        WebElement jobTitleInputText = jobTitleLocators.jobTitleInputHeader;
        waitForElementToBeVisible(jobTitleInputText, 10);
        validateText(jobTitleInputText, "Job Title", "Validated Job Title input header successfully", 5);
    }

    public void validate_Job_Title_Input_Box_Is_Present() {
        WebElement jobTitleInput = jobTitleLocators.jobTitleInput;
        waitForElementToBeVisible(jobTitleInput, 10, "Validated Job Title Input Box successfully");
    }

    public void validate_Job_Description_Input_Text_Is_Present() {
        WebElement jobDescriptionInputHeader = jobTitleLocators.jobDescriptionInputHeader;
        waitForElementToBeVisible(jobDescriptionInputHeader, 10);
        validateText(jobDescriptionInputHeader, "Job Description", "Validated Job Description input header successfully", 5);
    }

    public void validate_Job_Title_Description_Box_Is_Present() {
        WebElement jobTitleDescription = jobTitleLocators.jobDescriptionInput;
        waitForElementToBeVisible(jobTitleDescription, 10, "Validated Job Title description box successfully");
    }


    public void validate_Job_Specification_Input_Text_Is_Present() {
        WebElement jobSpecificationInputHeader = jobTitleLocators.jobSpecificationInputHeader;
        waitForElementToBeVisible(jobSpecificationInputHeader, 10);
        validateText(jobSpecificationInputHeader, "Job Specification", "Validated Job Specification input header successfully", 5);
    }

    public void validate_Job_Specification_Browse_Button_Is_Present() {
        WebElement jobSpecificationBrowseButton = jobTitleLocators.jobSpecificationBrowseButton;
        waitForElementToBeVisible(jobSpecificationBrowseButton, 10, "Job specification browse button is visible");
    }


    public void validate_Job_Specification_Hint_Text_Is_Present() {
        WebElement jobSpecificationHintText = jobTitleLocators.jobSpecificationHint;
        waitForElementToBeVisible(jobSpecificationHintText, 10);
        validateText(jobSpecificationHintText, "Accepts up to 1MB", "Validated Job Specification hint successfully", 5);
    }

    public void validate_Note_Input_Text_Is_Present() {
        WebElement noteInputHeader = jobTitleLocators.noteInputHeader;
        waitForElementToBeVisible(noteInputHeader, 10);
        validateText(noteInputHeader, "Note", "Validated Note input header successfully", 5);
    }

    public void validate_Note_Input_Box_Is_Present() {
        WebElement noteInputBox = jobTitleLocators.addNoteTextBox;
        waitForElementToBeVisible(noteInputBox, 10, "Validated add note input box successfully");
    }


    public void validate_Cancel_Button_Is_Present() {
        WebElement cancelButton = jobTitleLocators.cancelButton;
        waitForElementToBeClickable(cancelButton, 10, "Validated cancel button successfully");
    }

    public void validate_Save_Button_Is_Present() {
        WebElement saveButton = jobTitleLocators.saveButton;
        waitForElementToBeClickable(saveButton, 10, "Validated Save button successfully");
    }

    public void validate_Required_Text_Is_Present_At_Bottom_Of_Page() {
        WebElement requiredText = jobTitleLocators.requiredText;
        waitForElementToBeVisible(requiredText, 10);
//        validateText(requiredText, " * Required", "Validated required text successfully", 5);
    }

    private WebElement validate_Add_Button() {
        WebElement addButton = jobTitleLocators.jobTitleAddButton;
        waitForElementToBeClickable(addButton, 10, "Add button is clickable");
        return addButton;
    }

    public void click_on_Add_Button() {
        WebElement addButton = validate_Add_Button();
        clickElement(addButton, "Clicked on Add button in job titles page", true, 5);
    }

    private void validate_Add_Job_Titles_Page_Header() {
        WebElement requiredText = jobTitleLocators.addJobTitleHeader;
        waitForElementToBeVisible(requiredText, 10);
        validateText(requiredText, "Add Job Title", "Validated Add Job Title header successfully", 5);
    }

    public void validateAllElementsPresentInJobTitlePage() {
        validate_Job_Title_Page_Header();
        validate_Add_Button();
    }

    public void validate_All_Elements_Present_In_Add_JobTitle_Page() {
        validate_Add_Job_Titles_Page_Header();
        validate_Job_Title_Input_Text_Is_Present();
        validate_Job_Title_Input_Box_Is_Present();
        validate_Job_Description_Input_Text_Is_Present();
        validate_Job_Title_Description_Box_Is_Present();
        validate_Job_Specification_Input_Text_Is_Present();
        validate_Job_Specification_Browse_Button_Is_Present();
        validate_Job_Specification_Hint_Text_Is_Present();
        validate_Note_Input_Text_Is_Present();
        validate_Note_Input_Box_Is_Present();
        validate_Cancel_Button_Is_Present();
        validate_Save_Button_Is_Present();
        validate_Required_Text_Is_Present_At_Bottom_Of_Page();
    }


    public void navigateToJobTitlesPage() {
        sideMenu.clickOnAdminLink();
        clickOnJobNavOptions("job titles");
    }
}
