package com.orangehrm.web.pages.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLocators {
    public HomePageLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[text()='Welcome to the-internet']")
    public WebElement welcomeHeader;

    @FindBy(xpath = "//h2[text()='Available Examples']")
    public WebElement availableExamplesHeader;

    @FindBy(xpath = "//a[text()='A/B Testing']")
    public WebElement abTestingLink;

    @FindBy(xpath = "//a[text()='Add/Remove Elements']")
    public WebElement addRemoveElementsLink;

    @FindBy(xpath = "//a[text()='Basic Auth']")
    public WebElement basicAuthLink;

    @FindBy(xpath = "//li[text()=' (user and pass: admin)' and ./child::a[text()='Basic Auth']]")
    public WebElement userAndPassText;

    @FindBy(xpath = "//a[text()='Broken Images']")
    public WebElement brokenImagesLink;

    @FindBy(xpath = "//a[text()='Challenging DOM']")
    public WebElement challengingDomLink;

    @FindBy(xpath = "//a[text()='Checkboxes']")
    public WebElement checkboxesLink;

    @FindBy(xpath = "//a[text()='Context Menu']")
    public WebElement contextMenuLink;

    @FindBy(xpath = "//a[text()='Digest Authentication']")
    public WebElement digestAuthLink;

    @FindBy(xpath = "//li[text()=' (user and pass: admin)' and ./child::a[text()='Digest Authentication']]")
    public WebElement digestAuthCredentials;

    @FindBy(xpath = "//a[text()='Disappearing Elements']")
    public WebElement disappearingElementsLink;

    @FindBy(xpath = "//a[text()='Drag and Drop']")
    public WebElement dragAndDropLink;

    @FindBy(xpath = "//a[text()='Dropdown']")
    public WebElement dropdownLink;

    @FindBy(xpath = "//a[text()='Dynamic Content']")
    public WebElement dynamicContentLink;

    @FindBy(xpath = "//a[text()='Dynamic Controls']")
    public WebElement dynamicControlsLink;

    @FindBy(xpath = "//a[text()='Dynamic Loading']")
    public WebElement dynamicLoadingLink;

    @FindBy(xpath = "//a[text()='Entry Ad']")
    public WebElement entryAdLink;

    @FindBy(xpath = "//a[text()='Exit Intent']")
    public WebElement exitIntentLink;

    @FindBy(xpath = "//a[text()='File Download']")
    public WebElement fileDownloadLink;

    @FindBy(xpath = "//a[text()='File Upload']")
    public WebElement fileUploadLink;

    @FindBy(xpath = "//a[text()='Floating Menu']")
    public WebElement floatingMenuLink;

    @FindBy(xpath = "//a[text()='Forgot Password']")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//a[text()='Form Authentication']")
    public WebElement formAuthenticationLink;

    @FindBy(xpath = "//a[text()='Frames']")
    public WebElement framesLink;

    @FindBy(xpath = "//a[text()='Geolocation']")
    public WebElement geoLocationLink;

    @FindBy(xpath = "//a[text()='Horizontal Slider']")
    public WebElement horizontalSliderLink;

    @FindBy(xpath = "//a[text()='Hovers']")
    public WebElement hoversLink;

    @FindBy(xpath = "//a[text()='Infinite Scroll']")
    public WebElement infiniteScrollLink;

    @FindBy(xpath = "//a[text()='Inputs']")
    public WebElement inputsLink;

    @FindBy(xpath = "//a[text()='JQuery UI Menus']")
    public WebElement jqueryUiMenusLink;

    @FindBy(xpath = "//a[text()='JavaScript Alerts']")
    public WebElement javaScriptAlerts;

    @FindBy(xpath = "//a[text()='JavaScript onload event error']")
    public WebElement javascriptOnloadEventErrorLink;

    @FindBy(xpath = "//a[text()='Key Presses']")
    public WebElement keyPressesLink;

    @FindBy(xpath = "//a[text()='Large & Deep DOM']")
    public WebElement largeAndDeepDomLink;

    @FindBy(xpath = "//a[text()='Multiple Windows']")
    public WebElement multipleWindowsLink;

    @FindBy(xpath = "//a[text()='Nested Frames']")
    public WebElement nestedFramesLink;

    @FindBy(xpath = "//a[text()='Notification Messages']")
    public WebElement notificationMessagesLink;

    @FindBy(xpath = "//a[text()='Redirect Link']")
    public WebElement redirectLink;

    @FindBy(xpath = "//a[text()='Secure File Download']")
    public WebElement secureFileDownloadLink;

    @FindBy(xpath = "//a[text()='Shadow DOM']")
    public WebElement shadowDOMLink;

    @FindBy(xpath = "//a[text()='Shifting Content']")
    public WebElement shiftingContent;

    @FindBy(xpath = "//a[text()='Slow Resources']")
    public WebElement slowResourcesLink;

    @FindBy(xpath = "//a[text()='Sortable Data Tables']")
    public WebElement sortedDataTablesLink;

    @FindBy(xpath = "//a[text()='Status Codes']")
    public WebElement statusCodesLink;

    @FindBy(xpath = "//a[text()='Typos']")
    public WebElement typosLink;

    @FindBy(xpath = "//a[text()='WYSIWYG Editor']")
    public WebElement wysiwygEditorLink;
}
