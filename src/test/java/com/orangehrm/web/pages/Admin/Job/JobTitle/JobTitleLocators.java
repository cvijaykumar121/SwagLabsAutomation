package com.orangehrm.web.pages.Admin.Job.JobTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class JobTitleLocators {
    public JobTitleLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='oxd-topbar-body-nav-tab-item' and text()='Job ']")
    public WebElement jobNavButton;

    @FindBy(xpath = "//a[@class='oxd-topbar-body-nav-tab-link' and text()='Job Titles']")
    public WebElement jobTitlesLink;

    @FindBy(xpath = "//a[@class='oxd-topbar-body-nav-tab-link' and text()='Pay Grades']")
    public WebElement payGradesLink;

    @FindBy(xpath = "//a[@class='oxd-topbar-body-nav-tab-link' and text()='Employment Status']")
    public WebElement employmentStatusLink;

    @FindBy(xpath = "//a[@class='oxd-topbar-body-nav-tab-link' and text()='Job Categories']")
    public WebElement jobCategoriesLink;

    @FindBy(xpath = "//a[@class='oxd-topbar-body-nav-tab-link' and text()='Work Shifts']")
    public WebElement workShiftsLink;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title' or text()='Job Titles']")
    public WebElement jobTitlesHeader;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary' or text()=' Add ']")
    public WebElement jobTitleAddButton;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title' and text()='Add Job Title']")
    public WebElement addJobTitleHeader;

    @FindBy(xpath = "//form[@class='oxd-form']/div[@class='oxd-form-row']//label[text()='Job Title']")
    public WebElement jobTitleInputHeader;

    @FindBy(xpath = "//form[@class='oxd-form']/div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
    public WebElement jobTitleInput;

    @FindBy(xpath = "//form[@class='oxd-form']/div[@class='oxd-form-row']//label[text()='Job Description']")
    public WebElement jobDescriptionInputHeader;

    @FindBy(xpath = "(//form[@class='oxd-form']/div[@class='oxd-form-row']//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[1]")
    public WebElement jobDescriptionInput;

    @FindBy(xpath = "//form[@class='oxd-form']/div[@class='oxd-form-row']//label[text()='Job Specification']")
    public WebElement jobSpecificationInputHeader;

    @FindBy(xpath = "//div[@class='oxd-file-button']")
    public WebElement jobSpecificationBrowseButton;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-input-hint' or text()='Accepts up to 1MB ']")
    public WebElement jobSpecificationHint;

    @FindBy(xpath = "//form[@class='oxd-form']/div[@class='oxd-form-row']//label[text()='Note']")
    public WebElement noteInputHeader;

    @FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical' and @placeholder='Add note']")
    public WebElement addNoteTextBox;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-form-hint']")
    public WebElement requiredText;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost' or text()='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='oxd-table']")
    public WebElement jobTitlesTable;

    @FindBy(xpath = "(//div[@class='oxd-table-header-cell oxd-padding-cell oxd-table-th'])[1]")
    public WebElement checkboxHeader;

    @FindBy(xpath = "//div[@class='oxd-table']//div[@class='oxd-table-header-cell oxd-padding-cell oxd-table-th' and text()='Job Titles']")
    public WebElement jobTitlesTableHeader;

    @FindBy(xpath = "//div[@class='oxd-table']//div[@class='oxd-table-header-cell oxd-padding-cell oxd-table-th' and text()='Job Description']")
    public WebElement jobDescriptionTableHeader;

    @FindBy(xpath = "//div[@class='oxd-table']//div[@class='oxd-table-header-cell oxd-padding-cell oxd-table-th' and text()='Actions']")
    public WebElement actionsTableHeader;

    @FindBy(xpath = "//div[@class='oxd-table-body']")
    public WebElement jobTitlesBody;

    @FindBy(xpath = "//div[@class='oxd-table-body']/*")
    public List<WebElement> jobTitlesTableRows;

    @FindBy(xpath = "//div[@class='oxd-form-row' and .//label[text()='Job Title']]//span[text()='Required']")
    public WebElement jobTitleRequiredErrorMessage;
}
