package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationFormPage {

    //object repository
    private WebDriver driver;
    @FindBy(id = "register_now_btn")
    private WebElement registerNowFrontleft;
    @FindBy(id = "register_right_button")
    private WebElement registerRightdownbutton;
    @FindBy(xpath = "//a[@data-btn='top-bar']")
    private WebElement registerNowTopbutton;
    @FindBy(xpath = "//a[text()='Workshop Login']")
    private WebElement workshopLogin;
    @FindBy(id="loader")
    private WebElement Paymentprogressloader;
    //Scroll-down register now webelements part of page
    @FindBy(id = "register_form")
    private WebElement registerNowForm;
    //name
    @FindBy(id = "name")
    private WebElement username;
    //email
    @FindBy(id = "email")
    private WebElement email;
    //phone
    @FindBy(id = "phone")
    private WebElement phone;
    //place
    @FindBy(id = "city")
    private WebElement city;
    //slotdropbox
    @FindBy(id = "time_slot")
    private WebElement timeslot;

    //ckeckbox
    @FindBy(id = "terms")
    private WebElement termsCheckBox;

    //pay_buttonRegisterNow
    @FindBy(id = "pay_button")
    private WebElement registerNowPaybutton;

    public RegistrationFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillResigtrationForm() throws InterruptedException {

        registerNowFrontleft.click();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebDriverWait wait= new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(registerNowForm));




        username.clear();
        username.sendKeys("Muks");
        email.clear();
        email.sendKeys("muktagaur35@gmail.com");
        phone.clear();
        phone.sendKeys("7385068040");
        city.clear();
        city.sendKeys("Pune");
        Select select = new Select(timeslot);

        select.selectByIndex(1);
        Thread.sleep(3000);
        termsCheckBox.click();
        Thread.sleep(3000);
        registerNowPaybutton.click();


    }
}
