package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public static PaymentBlock paymentBlock;
    public static PaymentFrame paymentFrame;


    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.mts.by/");
        paymentBlock = new PaymentBlock(driver);
        paymentFrame = new PaymentFrame(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if (driver.findElement(By.xpath("//*[@id='cookie-agree']")).isDisplayed()) {
            driver.findElement(By.xpath("//*[@id='cookie-agree']")).click();
        }
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(40,2500)");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterEach
    void tearDown() {

        driver.quit();
    }

    @Test
    public void testTitle() {
        paymentBlock.checkTitle();
    }

    @Test
    public void testInfo() {
        paymentBlock.checkInfo();
    }

    @Test
    public void testIcons() {
        paymentBlock.spIcons();
    }

    @Test
    public void testGoToPayment() {
        paymentBlock.listClick();
        paymentBlock.comServicesFromList();
        paymentFrame.fillPhoneNumberField();
        paymentFrame.fillConSumField();
        paymentFrame.continueClick();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@class='bepaid-iframe']")));
    }

    @Test
    public void testServicesLabels() {
        paymentBlock.listClick();
        paymentBlock.comServicesFromList();
        paymentBlock.checkPhoneNumberLabel();
        paymentBlock.checkConSumLabel();
        paymentBlock.checkConEmailLabel();
    }

    @Test
    public void testHomeNetLabels() {
        paymentBlock.listClick();
        paymentBlock.homeNetFromList();
        paymentBlock.checkSubNumber();
        paymentBlock.checkIntSumLabel();
        paymentBlock.checkIntEmailLabel();
    }

    @Test
    public void testInstallmentLabels() {
        paymentBlock.listClick();
        paymentBlock.installmentFromList();
        paymentBlock.checkScore();
        paymentBlock.checkInstSumLabel();
        paymentBlock.checkInstEmailLabel();
    }

    @Test
    public void testDebtLabels() {
        paymentBlock.listClick();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentBlock.debtFromList();
        paymentBlock.checkDebtScore();
        paymentBlock.checkDebtSumLabel();
        paymentBlock.checkDebtEmailLabel();
    }

    @Test
    public void testFrame() {
        paymentBlock.listClick();
        paymentBlock.comServicesFromList();
        paymentFrame.fillPhoneNumberField();
        paymentFrame.fillConSumField();
        paymentFrame.continueClick();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@class='bepaid-iframe']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//app-card-page//button")));
        paymentFrame.checkLowerCost("100.00");
        paymentFrame.checkUpperCost("100.00");
        paymentFrame.checkPhoneNumber("297777777");
        paymentFrame.findIcons();
        paymentFrame.checkCardNumLabel();
        paymentFrame.checkDateLabel();
        paymentFrame.checkCvcLabel();
        paymentFrame.checkCardHolderLabel();
    }
}




