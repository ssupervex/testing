package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentBlock {
    public WebDriver driver;

    public PaymentBlock(WebDriver driver) {
        this.driver = driver;
        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class = 'pay__wrapper']/h2")
    WebElement title;

    @FindBy(xpath = "//*[contains(text(),'Подробнее о сервисе')]")
    WebElement info;


    @FindBy(xpath = "//*[@class='select__wrapper']")
    WebElement list;

    @FindBy(xpath = "//*[@id='connection-phone']")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//*[@id='connection-sum']")
    WebElement conSumField;

    @FindBy(xpath = "//p[contains(text(), 'Услуги связи')]")
    WebElement comServices;

    @FindBy(xpath = "//*[@id='connection-email']")
    WebElement conEmailField;

    @FindBy(xpath = "//p[contains(text(), 'Домашний интернет')]")
    WebElement homeNet;

    @FindBy(xpath = "//*[@id='internet-phone']")
    WebElement subNumberField;

    @FindBy(xpath = "//*[@id='internet-sum']")
    WebElement intSumField;

    @FindBy(xpath = "//*[@id='internet-email']")
    WebElement intEmailField;

    @FindBy(xpath = "//p[contains(text(), 'Рассрочка')]")
    WebElement installment;

    @FindBy(xpath = "//*[@id='score-instalment']")
    WebElement scoreField;

    @FindBy(xpath = "//*[@id='instalment-sum']")
    WebElement instSumField;

    @FindBy(xpath = "//*[@id='instalment-email']")
    WebElement instEmailField;

    @FindBy(xpath = "//p[contains(text(), 'Задолженность')]")
    WebElement debt;

    @FindBy(xpath = "//*[@id='score-arrears']")
    WebElement debtScoreField;

    @FindBy(xpath = "//*[@id='arrears-sum']")
    WebElement debtSumField;

    @FindBy(xpath = "//*[@id='arrears-email']")
    WebElement debtEmailField;

    By iconVisa = By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg']");
    By iconVisaVerified = By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg']");
    By iconMasterCard = By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg']");
    By iconMasterCardSecure = By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg']");
    By iconBelkart = By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg']");

    public void checkTitle() {
        assertEquals("Онлайн пополнение\nбез комиссии", title.getText());
    }

    public void checkInfo() {
        info.click();
    }

    public void spIcons() {
        driver.findElement(iconVisa);
        driver.findElement(iconVisaVerified);
        driver.findElement(iconMasterCard);
        driver.findElement(iconMasterCardSecure);
        driver.findElement(iconBelkart);
    }

    public void checkPhoneNumberLabel() {
        assertEquals("Номер телефона", phoneNumberField.getAttribute("placeholder"));
    }

    public void checkConSumLabel() {
        assertEquals("Сумма", conSumField.getAttribute("placeholder"));
    }

    public void checkConEmailLabel() {
        assertEquals("E-mail для отправки чека", conEmailField.getAttribute("placeholder"));
    }

    public void checkSubNumber() {
        assertEquals("Номер абонента", subNumberField.getAttribute("placeholder"));
    }

    public void checkIntSumLabel() {
        assertEquals("Сумма", intSumField.getAttribute("placeholder"));
    }

    public void checkIntEmailLabel() {
        assertEquals("E-mail для отправки чека", intEmailField.getAttribute("placeholder"));
    }

    public void checkScore() {
        assertEquals("Номер счета на 44", scoreField.getAttribute("placeholder"));
    }

    public void checkInstSumLabel() {
        assertEquals("Сумма", instSumField.getAttribute("placeholder"));
    }

    public void checkInstEmailLabel() {
        assertEquals("E-mail для отправки чека", instEmailField.getAttribute("placeholder"));
    }

    public void checkDebtScore() {
        assertEquals("Номер счета на 2073", debtScoreField.getAttribute("placeholder"));
    }

    public void checkDebtSumLabel() {
        assertEquals("Сумма", debtSumField.getAttribute("placeholder"));
    }

    public void checkDebtEmailLabel() {
        assertEquals("E-mail для отправки чека", debtEmailField.getAttribute("placeholder"));
    }

    public void listClick() {
        list.click();
    }

    public void comServicesFromList() {
        comServices.click();
    }

    public void homeNetFromList() {
        homeNet.click();
    }

    public void installmentFromList() {
        installment.click();
    }

    public void debtFromList() {
        debt.click();
    }
}
