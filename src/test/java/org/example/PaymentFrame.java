package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentFrame {
    public WebDriver driver;

    public PaymentFrame(WebDriver driver) {
        this.driver = driver;
        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='connection-phone']")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//*[@id='connection-sum']")
    WebElement conSumField;

    @FindBy(xpath = "//*[@id='pay-connection']/button")
    WebElement continueButton;

    @FindBy(xpath = "//*[@class='bepaid-iframe']")
    WebElement paymentForm;

    @FindBy(xpath = "//div[@class='pay-description__cost']/span[1]")
    WebElement upperCost;

    @FindBy(xpath = "//app-card-page//button")
    WebElement lowerCost;

    @FindBy(xpath = "//app-payment-container//div[2]/span")
    WebElement framePhone;

    @FindBy(xpath = "//app-input//label[contains(text(), 'Номер карты')]")
    WebElement cardNumLabel;

    @FindBy(xpath = "//app-input//label[contains(text(), 'Срок действия')]")
    WebElement dateLabel;

    @FindBy(xpath = "//app-input//label[contains(text(), 'CVC')]")
    WebElement cvcLabel;

    @FindBy(xpath = "//app-input//label[contains(text(), 'Имя держателя (как на карте)')]")
    WebElement cardHolderLabel;

    public void fillPhoneNumberField() {
        phoneNumberField.sendKeys("297777777");
    }

    public void fillConSumField() {
        conSumField.sendKeys("100");
    }

    public void continueClick() {
        continueButton.click();
    }

    public void checkUpperCost(String cost) {
        assertEquals(cost + " BYN", upperCost.getText());
    }

    public void checkLowerCost(String butCost) {
        assertEquals("Оплатить " + butCost + " BYN", lowerCost.getText());
    }

    public void checkPhoneNumber(String num) {
        assertEquals("Оплата: Услуги связи Номер:375" + num, framePhone.getText());
    }

    public void findIcons() {
        driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/visa-system.svg']"));
        driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']"));
        driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']"));
        driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/mir-system-ru.svg']"));
        driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/maestro-system.svg']"));
    }

    public void checkCardNumLabel() {
        assertEquals("Номер карты", cardNumLabel.getText());
    }

    public void checkDateLabel() {
        assertEquals("Срок действия", dateLabel.getText());
    }

    public void checkCvcLabel() {
        assertEquals("CVC", cvcLabel.getText());
    }

    public void checkCardHolderLabel() {
        assertEquals("Имя держателя (как на карте)", cardHolderLabel.getText());
    }
}
