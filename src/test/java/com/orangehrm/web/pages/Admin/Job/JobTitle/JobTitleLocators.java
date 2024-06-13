package com.orangehrm.web.pages.Admin.Job.JobTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active']/../preceding-sibling::div[@class='oxd-input-group__label-wrapper']")
    public WebElement jobTitleInput;

    @FindBy(xpath = "//form[@class='oxd-form']/div[@class='oxd-form-row']//label[text()='Job Description']")
    public WebElement jobDescriptionInputHeader;

    @FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical' and @placeholder='Type description here']")
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

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space' or text()='Save']")
    public WebElement saveButton;
}
