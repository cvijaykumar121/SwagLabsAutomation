package com.orangehrm.web.pages.ABTesting;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;

public class ABTestingPage extends TestBase {
    public WebDriver driver;
    public ABTestingPageLocators abTestingPageLocators;

    public ABTestingPage(WebDriver driver) {
        this.driver = driver;
        this.abTestingPageLocators = new ABTestingPageLocators(driver);
    }

    public void validatePageHeading() {
//        String expectedHeading = "A/B Test Variation 1";
        waitForElementToBeVisible(abTestingPageLocators.pageHeading, 20);
        logPass("ABTesting page heading is visible", true);
//        validateText(abTestingPageLocators.pageHeading, expectedHeading, "Page heading not validated successfully", 10);
    }

    public void validatePageDescription() {
        String expectedDescription = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
        waitForElementToBeVisible(abTestingPageLocators.pageDescription, 10);
        validateText(abTestingPageLocators.pageDescription, expectedDescription, "Page Description not validated successfully", 10);
    }

    public void validateFooterText() {
        String expectedText = "Powered by Elemental Selenium";
        waitForElementToBeVisible(abTestingPageLocators.footerText, 10);
        validateText(abTestingPageLocators.footerText, expectedText, "Footer Text validated successfully", 10);
    }

    public void validateElementalSeleniumLink() {
        String expectedText = "Elemental Selenium";
        waitForElementToBeVisible(abTestingPageLocators.elementalSeleniumLink, 10);
        validateText(abTestingPageLocators.elementalSeleniumLink, expectedText, "Elemental Selenium Text validated successfully", 10);
    }

    public void validateForkMeOnGithubImage() {
        waitForElementToBeVisible(abTestingPageLocators.forkOnGithubImage, 10);
        logPass("Successfully validated Fork Me On Github Image", true);
    }
}
