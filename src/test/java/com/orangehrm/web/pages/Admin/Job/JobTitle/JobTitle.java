package com.orangehrm.web.pages.Admin.Job.JobTitle;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobTitle extends TestBase {
    public WebDriver driver;
    public JobTitleLocators jobTitleLocators;

    public JobTitle(WebDriver driver) {
        this.driver = driver;
        this.jobTitleLocators = new JobTitleLocators(driver);
    }

    public void validate_Add_Job_Title_Page_Header() {
        WebElement addJobTitleHeader = jobTitleLocators.addJobTitleHeader;
        waitForElementToBeVisible(addJobTitleHeader, 10);
        validateText(addJobTitleHeader, "Add Job Title", "Validated Add Job Title successfully", 5);
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
        validateText(requiredText, " * Required", "Validated required text successfully", 5);
    }
}
