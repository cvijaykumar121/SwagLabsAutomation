package com.orangehrm.web.pages.Footer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterLocators {
    @FindBy(xpath = "(//p[@class='oxd-text oxd-text--p orangehrm-copyright'])[1]")
    public WebElement footer1;

    @FindBy(xpath = "(//p[@class='oxd-text oxd-text--p orangehrm-copyright'])[2]")
    public WebElement footer2;
}
