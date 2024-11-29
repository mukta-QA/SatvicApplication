package tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.RegistrationConfirmationpage;
import pages.RegistrationFormPage;
import utils.DriverManager;
public class testRegistrationForm {



        private RegistrationFormPage registrationFormPage;
        private RegistrationConfirmationpage registrationConfirmationpage;
        @BeforeClass
        public void setUp() {
            DriverManager.getDriver().get("https://detox.satvicmovement.org/");
            registrationFormPage = new RegistrationFormPage(DriverManager.getDriver());
            registrationConfirmationpage =new RegistrationConfirmationpage(DriverManager.getDriver());
        }

        @Test
        public void VerifytestFormisSuccessful() throws InterruptedException {
            registrationFormPage.fillResigtrationForm();
            Thread.sleep(10000);
           String confirmationText=registrationConfirmationpage.getConfirmationText();
            SoftAssert softAssert=new SoftAssert();
            softAssert.assertEquals(confirmationText,"Registration confirmed!","Registration is failed");
            softAssert.assertAll();

        }
        @Test(priority = 1)
        public void VerifyregistrationdetailsIscorrect(){
            String mail=registrationConfirmationpage.getTextemail();
            String phone=registrationConfirmationpage.getTextphone();
            SoftAssert softAssert= new SoftAssert();
            softAssert.assertEquals(mail,"muktagaur35@gmail.com","same mail id is not reflected in confirmation form");
            softAssert.assertEquals(phone,"7385068040","phone number is not same");
            softAssert.assertAll();
        }

        @AfterClass
        public void tearDown() {
            DriverManager.quitDriver();
        }
    }



