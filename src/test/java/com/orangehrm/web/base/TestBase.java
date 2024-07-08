package com.orangehrm.web.base;

import com.orangehrm.web.pages.Login.LoginPage;
import com.orangehrm.web.utilities.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

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
    public LoginPage loginPage;
    public String validUsername_Admin;
    public String validPassword_Admin;

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browser) throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        String configPropertyFilePath = currentDirectory + "\\src\\test\\resources\\properties\\Config.properties";
        String ORPropertyFilePath = currentDirectory + "\\src\\test\\resources\\properties\\OR.properties";
        String chromeDriverPath = currentDirectory + "\\src\\test\\resources\\executables\\chromedriver.exe";
        String edgeDriverPath = currentDirectory + "\\src\\test\\resources\\executables\\msedgedriver.exe";

        fis = new FileInputStream(configPropertyFilePath);
        config.load(fis);

        fis = new FileInputStream(ORPropertyFilePath);
        OR.load(fis);

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", edgeDriverPath);
            driver = new EdgeDriver();
        } else if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        js = (JavascriptExecutor) driver;

        driver.get(config.getProperty("application_url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        loginPage = new LoginPage(driver);

        validUsername_Admin = config.getProperty("validUsername_Admin");
        validPassword_Admin = config.getProperty("validPassword_Admin");
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

    public void waitForElementToBeVisible(WebElement element, int timeoutInSeconds, String message) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
            wait.until(ExpectedConditions.visibilityOf(element));
            logPass(message, true);
        } catch (TimeoutException e) {
            logFail("Timeout: Element is not visible within the specified time.\n" + e.getMessage(), true);
        } catch (NoSuchElementException e) {
            logFail("Error: Element not found in the DOM.\n" + e.getMessage(), true);
        } catch (StaleElementReferenceException e) {
            logFail("Error: Element is no longer attached to the DOM.\n" + e.getMessage(), true);
        } catch (ElementNotInteractableException e) {
            logFail("Error: Element is present but not interactable.\n" + e.getMessage(), true);
        } catch (WebDriverException e) {
            logFail("WebDriver error: \n" + e.getMessage(), true);
        }
    }


    public void waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (TimeoutException e) {
            logFail("Timeout: Element is not visible within the specified time.\n" + e.getMessage(), true);
        } catch (NoSuchElementException e) {
            logFail("Error: Element not found in the DOM.\n" + e.getMessage(), true);
        } catch (StaleElementReferenceException e) {
            logFail("Error: Element is no longer attached to the DOM.\n" + e.getMessage(), true);
        } catch (ElementNotInteractableException e) {
            logFail("Error: Element is present but not interactable.\n" + e.getMessage(), true);
        } catch (WebDriverException e) {
            logFail("WebDriver error: \n" + e.getMessage(), true);
        }
    }

    public void waitForElementToBeClickable(WebElement element, int timeoutInSeconds, String message) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            logPass(message, true);
        } catch (TimeoutException e) {
            logFail("Timeout: Element is not visible within the specified time.\n" + e.getMessage(), true);
        } catch (NoSuchElementException e) {
            logFail("Error: Element not found in the DOM.\n" + e.getMessage(), true);
        } catch (StaleElementReferenceException e) {
            logFail("Error: Element is no longer attached to the DOM.\n" + e.getMessage(), true);
        } catch (ElementNotInteractableException e) {
            logFail("Error: Element is present but not interactable.\n" + e.getMessage(), true);
        } catch (WebDriverException e) {
            logFail("WebDriver error: \n" + e.getMessage(), true);
        }
    }

    public void waitForAlertToBePresent(int timeOut, String message) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            wait.withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent());
            logPass(message, true);
        } catch (NoAlertPresentException e) {
            logInfo("No alert present.", true);
        } catch (TimeoutException e) {
            logInfo("No alert present within the specified timeout.", true);
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

    public void sendKeys(WebElement element, String data, String message, int timeOut) {
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

    public void highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Change the element's border and background color to highlight it
        js.executeScript("arguments[0].style.border='3px solid red'", element);
        js.executeScript("arguments[0].style.backgroundColor='yellow'", element);
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
