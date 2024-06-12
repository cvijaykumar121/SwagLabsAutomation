package com.orangehrm.web.base;

import com.orangehrm.web.pages.HomePage.HomePage;
import com.orangehrm.web.utilities.ExtentManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties config = new Properties();
    public static Properties OR = new Properties();
    public static FileInputStream fis;
    public static JavascriptExecutor js;
    public HomePage homePage;

    @BeforeMethod
    public void setUp() throws IOException {

        fis = new FileInputStream(
                System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
        config.load(fis);

        fis = new FileInputStream(
                System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
        OR.load(fis);

        if (config.getProperty("browser").equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (config.getProperty("browser").equalsIgnoreCase("Internet Explorer")) {
            System.setProperty("webdriver.ie.driver",
                    System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        js = (JavascriptExecutor) driver;

        driver.get(config.getProperty("application_url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        homePage = new HomePage(driver);
    }

    public void logPass(String message, boolean takeScreenshot) {
        if (takeScreenshot) {
            ExtentManager.logPass(message);
        }
    }

    public void logFail(String message, boolean takeScreenshot) {
        ExtentManager.logFail(message);
        Assert.fail(message);
    }

    public void logInfo(String message, boolean takeScreenshot) {
        ExtentManager.logInfo(message);
    }

    public void logSkip(String message, boolean takeScreenshot) {
        ExtentManager.logSkip(message);
    }

    public void waitForElementToBeVisible(WebElement element, int timeoutInSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            Assert.fail("Timeout: Element is not visible within the specified time.", e);
        } catch (NoSuchElementException e) {
            Assert.fail("Error: Element not found in the DOM.", e);
        } catch (StaleElementReferenceException e) {
            Assert.fail("Error: Element is no longer attached to the DOM.", e);
        } catch (ElementNotInteractableException e) {
            Assert.fail("Error: Element is present but not interactable.", e);
        } catch (WebDriverException e) {
            Assert.fail("WebDriver error: " + e.getMessage(), e);
        }
    }

    public void waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (TimeoutException e) {
            Assert.fail("Timeout: Element is not visible within the specified time.", e);
        } catch (NoSuchElementException e) {
            Assert.fail("Error: Element not found in the DOM.", e);
        } catch (StaleElementReferenceException e) {
            Assert.fail("Error: Element is no longer attached to the DOM.", e);
        } catch (ElementNotInteractableException e) {
            Assert.fail("Error: Element is present but not interactable.", e);
        } catch (WebDriverException e) {
            Assert.fail("WebDriver error: " + e.getMessage(), e);
        }
    }

    public void waitForFrameAndSwitchToIt(WebElement frameElement, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
            System.out.println("Switched to frame successfully");
        } catch (TimeoutException e) {
            Assert.fail("Timeout: Frame is not available within the specified time.");
        } catch (NoSuchFrameException e) {
            Assert.fail("Error: Frame not found.");
        } catch (StaleElementReferenceException e) {
            Assert.fail("Error: Frame element is no longer attached to the DOM.");
        } catch (ElementNotInteractableException e) {
            Assert.fail("Error: Frame element is present but not interactable.");
        } catch (WebDriverException e) {
            Assert.fail("WebDriver error: " + e.getMessage());
        }
    }

    public void clickElement(WebElement element, String message, boolean takeScreenshot, int timeOut) {
        waitForElementToBeClickable(element, timeOut);
        try {
            element.click();
            logInfo(message, takeScreenshot);
        } catch (NoSuchElementException e) {
            Assert.fail("Error: Element not found in the DOM.");
        } catch (StaleElementReferenceException e) {
            Assert.fail("Error: Element is no longer attached to the DOM.");
        } catch (ElementNotInteractableException e) {
            Assert.fail("Error: Element is present but not intractable.");
        } catch (WebDriverException e) {
            Assert.fail("WebDriver error: " + e.getMessage());
        }
    }

    public void sendKeys(WebElement element, String data, String message, int timeOut) throws InterruptedException {
        waitForElementToBeClickable(element, timeOut);
        try {
            element.sendKeys(data);
            logInfo(message, true);
        } catch (NoSuchElementException e) {
            Assert.fail("Error: Element not found in the DOM.");
        } catch (StaleElementReferenceException e) {
            Assert.fail("Error: Element is no longer attached to the DOM.");
        } catch (ElementNotInteractableException e) {
            Assert.fail("Error: Element is present but not interactable.");
        } catch (WebDriverException e) {
            Assert.fail("WebDriver error: " + e.getMessage());
        }
    }

    public String getTextFromElement(WebElement element, int timeOut) {
        waitForElementToBeVisible(element, timeOut);
        try {
            return element.getText();
        } catch (NoSuchElementException e) {
            Assert.fail("Error: Element not found in the DOM.");
        } catch (StaleElementReferenceException e) {
            Assert.fail("Error: Element is no longer attached to the DOM.");
        } catch (ElementNotInteractableException e) {
            Assert.fail("Error: Element is present but not interactable.");
        } catch (WebDriverException e) {
            Assert.fail("WebDriver error: " + e.getMessage());
        }
        return null;
    }

    public void selectOptionFromDropdown(WebElement element, String option, String message, int timeOut) {
        waitForElementToBeClickable(element, timeOut);
        try {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(option);
            System.out.println("Option selected successfully");
        } catch (NoSuchElementException e) {
            Assert.fail("Error: Option not found in the dropdown.");
        } catch (StaleElementReferenceException e) {
            Assert.fail("Error: Dropdown element is no longer attached to the DOM.");
        } catch (ElementNotInteractableException e) {
            Assert.fail("Error: Dropdown element is present but not interactable.");
        } catch (WebDriverException e) {
            Assert.fail("WebDriver error: " + e.getMessage());
        }
    }

    public void switchToFrame(WebElement frameElement, String message, int timeOut) {
        waitForFrameAndSwitchToIt(frameElement, timeOut);
        try {
            frameElement.click();
            System.out.println("Element inside frame clicked successfully");
        } catch (NoSuchElementException e) {
            Assert.fail("Error: Element inside frame not found in the DOM.");
        } catch (StaleElementReferenceException e) {
            Assert.fail("Error: Element inside frame is no longer attached to the DOM.");
        } catch (ElementNotInteractableException e) {
            Assert.fail("Error: Element inside frame is present but not interactable.");
        } catch (WebDriverException e) {
            Assert.fail("WebDriver error: " + e.getMessage());
        }
    }

    public void switchToDefaultContent() {
        try {
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void validateText(WebElement element, String expectedText, String message, int timeOut) {
        waitForElementToBeVisible(element, timeOut);
        try {
            String actualText = element.getText();
            System.out.println("Actual title: " + actualText);

            if (actualText.trim().equals(expectedText)) {
                logPass(message, true);
            } else {
                logFail("Text validation failed. Expected: " + expectedText + ", but found: " + actualText, true);
            }
        } catch (NoSuchElementException e) {
            Assert.fail("Error: Element not found in the DOM.");
        } catch (StaleElementReferenceException e) {
            Assert.fail("Error: Element is no longer attached to the DOM.");
        } catch (ElementNotInteractableException e) {
            Assert.fail("Error: Element is present but not interactable.");
        } catch (WebDriverException e) {
            Assert.fail("WebDriver error: " + e.getMessage());
        }
    }

    public static String captureScreenshot() {
        TakesScreenshot ts = (TakesScreenshot) driver;
        return ts.getScreenshotAs(OutputType.BASE64);
    }

//    private String captureScreenshot(String fileName) {
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        String destination = System.getProperty("user.dir") + "\\src\\test\\resources\\screenshots" + System.currentTimeMillis() + ".png";
//
//        try {
//            FileUtils.copyFile(source, new File(destination));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return destination;
//    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Quits the WebDriver session, closing all browser windows
            driver = null; // Sets driver to null to avoid using a terminated instance
        }
    }

//    @AfterSuite
//    public void openExtentReport() {
//        try {
//            Desktop.getDesktop().browse(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\extent-report.html").toURI());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
