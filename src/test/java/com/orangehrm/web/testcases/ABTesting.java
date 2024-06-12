package com.orangehrm.web.testcases;

import com.orangehrm.web.base.TestBase;
import com.orangehrm.web.pages.ABTesting.ABTestingPage;
import org.testng.annotations.Test;

public class ABTesting extends TestBase {

    @Test(priority = 1)
    public void validatePageHeading() {
        ABTestingPage abTestingPage = new ABTestingPage(driver);

        homePage.clickOnABTestingLink();
        abTestingPage.validatePageHeading();
    }

    @Test(priority = 2)
    public void validatePageDescription() {
        ABTestingPage abTestingPage = new ABTestingPage(driver);

        homePage.clickOnABTestingLink();
        abTestingPage.validatePageDescription();
    }

    @Test(priority = 3)
    public void validateFooterText() {
        ABTestingPage abTestingPage = new ABTestingPage(driver);

        homePage.clickOnABTestingLink();
        abTestingPage.validateFooterText();
    }

    @Test(priority = 4)
    public void validateElementalSeleniumLink() {
        ABTestingPage abTestingPage = new ABTestingPage(driver);

        homePage.clickOnABTestingLink();
        abTestingPage.validateElementalSeleniumLink();
    }

    @Test(priority = 5)
    public void validateForkMeOnGithubImage() {
        ABTestingPage abTestingPage = new ABTestingPage(driver);

        homePage.clickOnABTestingLink();
        abTestingPage.validateForkMeOnGithubImage();
    }
}
