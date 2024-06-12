package com.orangehrm.web.pages.ABTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ABTestingPageLocators {

    public ABTestingPageLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3")
    public WebElement pageHeading;

    @FindBy(xpath = "//p[contains(text(),'Also known as split testing.')]")
    public WebElement pageDescription;

    @FindBy(xpath = "//div[text()='Powered by ']")
    public WebElement footerText;

    @FindBy(xpath = "//div[text()='Powered by ']/a[text()='Elemental Selenium']")
    public WebElement elementalSeleniumLink;

    @FindBy(xpath = "//img[@alt='Fork me on GitHub']")
    public WebElement forkOnGithubImage;
}
