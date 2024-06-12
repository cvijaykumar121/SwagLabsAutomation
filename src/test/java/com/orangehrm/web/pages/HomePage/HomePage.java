package com.orangehrm.web.pages.HomePage;

import com.orangehrm.web.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends TestBase {
    public WebDriver driver;
    public HomePageLocators homePageLocators;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.homePageLocators = new HomePageLocators(driver);
    }

    public void clickOnABTestingLink() {
        WebElement abTestingLink = homePageLocators.abTestingLink;
        waitForElementToBeClickable(abTestingLink, 10);
        clickElement(abTestingLink, "Clicked successfully", true, 5);
    }

    public void clickOnAddRemoveElementsLink() {
        WebElement addRemoveElementsLink = homePageLocators.addRemoveElementsLink;
        waitForElementToBeClickable(addRemoveElementsLink, 10);
        clickElement(addRemoveElementsLink, "Clicked successfully", true, 5);
    }

    public void clickOnBasicAuthLink() {
        WebElement basicAuthLink = homePageLocators.basicAuthLink;
        waitForElementToBeClickable(basicAuthLink, 10);
        clickElement(basicAuthLink, "Clicked successfully", true, 5);
    }

    public void clickOnBrokenImagesLink() {
        WebElement brokenImagesLink = homePageLocators.brokenImagesLink;
        waitForElementToBeClickable(brokenImagesLink, 10);
        clickElement(brokenImagesLink, "Clicked successfully", true, 5);
    }

    public void clickOnChallengingDOMLink() {
        WebElement challengingDOMLink = homePageLocators.challengingDomLink;
        waitForElementToBeClickable(challengingDOMLink, 10);
        clickElement(challengingDOMLink, "Clicked successfully", true, 5);
    }

    public void clickOnCheckBoxesLink() {
        WebElement checkBoxesLink = homePageLocators.checkboxesLink;
        waitForElementToBeClickable(checkBoxesLink, 10);
        clickElement(checkBoxesLink, "Clicked successfully", true, 5);
    }

    public void clickOnContextMenuLink() {
        WebElement contextMenuLink = homePageLocators.contextMenuLink;
        waitForElementToBeClickable(contextMenuLink, 10);
        clickElement(contextMenuLink, "Clicked successfully", true, 5);
    }

    public void clickOnDigestAuthenticationLink() {
        WebElement digestAuthenticationLink = homePageLocators.digestAuthLink;
        waitForElementToBeClickable(digestAuthenticationLink, 10);
        clickElement(digestAuthenticationLink, "Clicked successfully", true, 5);
    }

    public void clickOnDisappearingElementsLink() {
        WebElement disappearingElementsLink = homePageLocators.disappearingElementsLink;
        waitForElementToBeClickable(disappearingElementsLink, 10);
        clickElement(disappearingElementsLink, "Clicked successfully", true, 5);
    }

    public void clickOnDragAndDropLink() {
        WebElement dragAndDropLink = homePageLocators.dragAndDropLink;
        waitForElementToBeClickable(dragAndDropLink, 10);
        clickElement(dragAndDropLink, "Clicked successfully", true, 5);
    }
    public void clickOnDropDownLink() {
        WebElement dropdownLink = homePageLocators.dropdownLink;
        waitForElementToBeClickable(dropdownLink, 10);
        clickElement(dropdownLink, "Clicked successfully", true, 5);
    }

    public void clickOnDynamicContentLink() {
        WebElement dynamicContentLink = homePageLocators.dynamicContentLink;
        waitForElementToBeClickable(dynamicContentLink, 10);
        clickElement(dynamicContentLink, "Clicked successfully", true, 5);
    }

    public void clickOnDynamicControlsLink() {
        WebElement dynamicControlsLink = homePageLocators.dynamicControlsLink;
        waitForElementToBeClickable(dynamicControlsLink, 10);
        clickElement(dynamicControlsLink, "Clicked successfully", true, 5);
    }

    public void clickOnDynamicLoadingLink() {
        WebElement dynamicLoadingLink = homePageLocators.dynamicLoadingLink;
        waitForElementToBeClickable(dynamicLoadingLink, 10);
        clickElement(dynamicLoadingLink, "Clicked successfully", true, 5);
    }

    public void clickOnEntryAdLink() {
        WebElement entryAdLink = homePageLocators.entryAdLink;
        waitForElementToBeClickable(entryAdLink, 10);
        clickElement(entryAdLink, "Clicked successfully", true, 5);
    }

    public void clickOnExitIntentLink() {
        WebElement exitIntentLink = homePageLocators.exitIntentLink;
        waitForElementToBeClickable(exitIntentLink, 10);
        clickElement(exitIntentLink, "Clicked successfully", true, 5);
    }

    public void clickOnFileDownloadLink() {
        WebElement fileDownloadLink = homePageLocators.fileDownloadLink;
        waitForElementToBeClickable(fileDownloadLink, 10);
        clickElement(fileDownloadLink, "Clicked successfully", true, 5);
    }

    public void clickOnFileUploadLink() {
        WebElement fileUploadLink = homePageLocators.fileUploadLink;
        waitForElementToBeClickable(fileUploadLink, 10);
        clickElement(fileUploadLink, "Clicked successfully", true, 5);
    }

    public void clickOnFloatingMenuLink() {
        WebElement floatingMenuLink = homePageLocators.floatingMenuLink;
        waitForElementToBeClickable(floatingMenuLink, 10);
        clickElement(floatingMenuLink, "Clicked successfully", true, 5);
    }

    public void clickOnForgotPasswordLink() {
        WebElement forgotPasswordLink = homePageLocators.forgotPasswordLink;
        waitForElementToBeClickable(forgotPasswordLink, 10);
        clickElement(forgotPasswordLink, "Clicked successfully", true, 5);
    }

    public void clickOnFormAuthenticationLink() {
        WebElement formAuthentication = homePageLocators.formAuthenticationLink;
        waitForElementToBeClickable(formAuthentication, 10);
        clickElement(formAuthentication, "Clicked successfully", true, 5);
    }

    public void clickOnFramesLink() {
        WebElement framesLink = homePageLocators.framesLink;
        waitForElementToBeClickable(framesLink, 10);
        clickElement(framesLink, "Clicked successfully", true, 5);
    }

    public void clickOnGeolocationLink() {
        WebElement geolocationLink = homePageLocators.geoLocationLink;
        waitForElementToBeClickable(geolocationLink, 10);
        clickElement(geolocationLink, "Clicked successfully", true, 5);
    }

    public void clickOnHorizontalSliderLink() {
        WebElement horizontalSliderLink = homePageLocators.horizontalSliderLink;
        waitForElementToBeClickable(horizontalSliderLink, 10);
        clickElement(horizontalSliderLink, "Clicked successfully", true, 5);
    }

    public void clickOnHoversLink() {
        WebElement hoversLink = homePageLocators.hoversLink;
        waitForElementToBeClickable(hoversLink, 10);
        clickElement(hoversLink, "Clicked successfully", true, 5);
    }

    public void clickOnInfiniteScrollLink() {
        WebElement infiniteScrollLink = homePageLocators.infiniteScrollLink;
        waitForElementToBeClickable(infiniteScrollLink, 10);
        clickElement(infiniteScrollLink, "Clicked successfully", true, 5);
    }

    public void clickOnInputsLink() {
        WebElement inputsLink = homePageLocators.inputsLink;
        waitForElementToBeClickable(inputsLink, 10);
        clickElement(inputsLink, "Clicked successfully", true, 5);
    }

    public void clickOnJQueryUIMenusLink() {
        WebElement jqeuryMenus = homePageLocators.jqueryUiMenusLink;
        waitForElementToBeClickable(jqeuryMenus, 10);
        clickElement(jqeuryMenus, "Clicked successfully", true, 5);
    }

    public void clickOnJavascriptAlertsLink() {
        WebElement javascriptAlertsLink = homePageLocators.javaScriptAlerts;
        waitForElementToBeClickable(javascriptAlertsLink, 10);
        clickElement(javascriptAlertsLink, "Clicked successfully", true, 5);
    }

    public void clickOnJavascriptOnloadEventErrorLink() {
        WebElement onloadEventErrorLink = homePageLocators.javascriptOnloadEventErrorLink;
        waitForElementToBeClickable(onloadEventErrorLink, 10);
        clickElement(onloadEventErrorLink, "Clicked successfully", true, 5);
    }

    public void clickOnKeyPressesLink() {
        WebElement keyPressesLink = homePageLocators.keyPressesLink;
        waitForElementToBeClickable(keyPressesLink, 10);
        clickElement(keyPressesLink, "Clicked successfully", true, 5);
    }

    public void clickOnLargeAndDeepDOMLink() {
        WebElement largeAndDeepDOMLink = homePageLocators.largeAndDeepDomLink;
        waitForElementToBeClickable(largeAndDeepDOMLink, 10);
        clickElement(largeAndDeepDOMLink, "Clicked successfully", true, 5);
    }

    public void clickOnMultipleWindowsLink() {
        WebElement multipleWindowsLink = homePageLocators.multipleWindowsLink;
        waitForElementToBeClickable(multipleWindowsLink, 10);
        clickElement(multipleWindowsLink, "Clicked successfully", true, 5);
    }

    public void clickOnNestedFramesLink() {
        WebElement nestedFramesLink = homePageLocators.nestedFramesLink;
        waitForElementToBeClickable(nestedFramesLink, 10);
        clickElement(nestedFramesLink, "Clicked successfully", true, 5);
    }

    public void clickOnNotificationMessagesLink() {
        WebElement notificationMessagesLink = homePageLocators.notificationMessagesLink;
        waitForElementToBeClickable(notificationMessagesLink, 10);
        clickElement(notificationMessagesLink, "Clicked successfully", true, 5);
    }

    public void clickOnRedirectLink() {
        WebElement redirectLink = homePageLocators.redirectLink;
        waitForElementToBeClickable(redirectLink, 10);
        clickElement(redirectLink, "Clicked successfully", true, 5);
    }

    public void clickOnSecureFileDownloadLink() {
        WebElement secureFileDownloadLink = homePageLocators.secureFileDownloadLink;
        waitForElementToBeClickable(secureFileDownloadLink, 10);
        clickElement(secureFileDownloadLink, "Clicked successfully", true, 5);
    }

    public void clickOnShadowDOMLink() {
        WebElement shadowDOMLink = homePageLocators.shadowDOMLink;
        waitForElementToBeClickable(shadowDOMLink, 10);
        clickElement(shadowDOMLink, "Clicked successfully", true, 5);
    }

    public void clickOnShiftingContentLink() {
        WebElement shiftingContentLink = homePageLocators.shiftingContent;
        waitForElementToBeClickable(shiftingContentLink, 10);
        clickElement(shiftingContentLink, "Clicked successfully", true, 5);
    }

    public void clickOnSlowResourcesLink() {
        WebElement slowResourcesLink = homePageLocators.slowResourcesLink;
        waitForElementToBeClickable(slowResourcesLink, 10);
        clickElement(slowResourcesLink, "Clicked successfully", true, 5);
    }

    public void clickOnSortableDataTablesLink() {
        WebElement sortableDatatablesLink = homePageLocators.sortedDataTablesLink;
        waitForElementToBeClickable(sortableDatatablesLink, 10);
        clickElement(sortableDatatablesLink, "Clicked successfully", true, 5);
    }


    public void clickOnStatusCodesLink() {
        WebElement statusCodesLink = homePageLocators.statusCodesLink;
        waitForElementToBeClickable(statusCodesLink, 10);
        clickElement(statusCodesLink, "Clicked successfully", true, 5);
    }

    public void clickOnTyposLink() {
        WebElement typosLink = homePageLocators.typosLink;
        waitForElementToBeClickable(typosLink, 10);
        clickElement(typosLink, "Clicked successfully", true, 5);
    }

    public void clickOnWYSIWYGEditorLink() {
        WebElement wysiwygLink = homePageLocators.wysiwygEditorLink;
        waitForElementToBeClickable(wysiwygLink, 10);
        clickElement(wysiwygLink, "Clicked successfully", true, 5);
    }
}
