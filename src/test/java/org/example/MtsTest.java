package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MtsTest {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (driver.findElement(By.xpath("//*[@id='cookie-agree']")).isDisplayed()) {
            driver.findElement(By.xpath("//*[@id='cookie-agree']")).click();
        }
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(40,2500)");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void infoTest() {
        WebElement info = driver.findElement(By.xpath("//*[contains(text(),'Подробнее о сервисе')]"));
        info.click();
    }


    @Test
    public void title() {
        WebElement elementTitle = driver.findElement(By.xpath("//div[@class = 'pay__wrapper']/h2"));
        assertEquals("Онлайн пополнение\nбез комиссии", elementTitle.getText());
    }

    @Test
    void findIcons() {
        driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg']"));

        driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg']"));

        driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg']"));

        driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg']"));

        driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg']"));
    }

    @Test
    void goToPayment() {
        WebElement list = driver.findElement(By.xpath("//*[@class='select__wrapper']"));
        list.click();

        WebElement service = driver.findElement(By.xpath("//p[contains(text(), 'Услуги связи')]"));
        service.click();

        WebElement numberField = driver.findElement(By.xpath("//*[@id='connection-phone']"));
        numberField.sendKeys("297777777");

        WebElement sumField = driver.findElement(By.xpath("//*[@id='connection-sum']"));
        sumField.sendKeys("100");

        WebElement continueButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        continueButton.click();

        WebElement payment = driver.findElement(By.xpath("//*[@class='bepaid-iframe']"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        payment.isDisplayed();
    }
}
