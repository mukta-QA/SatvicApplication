package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationConfirmationpage {
    private WebDriver driver;
    @FindBy(id="thank_you")
    private WebElement thankyouform;

    @FindBy(id="registration_confirm")
    private WebElement registrationconfirmationText;
    @FindBy(id="email")
    private WebElement emailread;

    @FindBy(id="wa_no")
    private WebElement phoneNumberRead;

    public RegistrationConfirmationpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTextemail()
    {
        return emailread.getAttribute("value");
    }
    public String getTextphone() {
        return phoneNumberRead.getAttribute("value");
    }
    public String getConfirmationText(){
        return registrationconfirmationText.getText();
    }

}

