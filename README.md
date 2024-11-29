Overview:
This project is part of a QA assignment to automate the registration process in the Satvic Movement application. It handles the "Register Now" button navigation, confirms successful registration, and validates the email ID and phone number displayed post-registration.
Steps to Load the Project Locally:
Ensure you have an IDE (Eclipse or IntelliJ).
Java, Chrome, and Edge browsers must be installed.
Load the project in your system, sync dependencies, and ensure there are no errors.
Run the project via the IDE:
Navigate to src/test/java.
Open the tests package and the testRegistrationForm class.
Run the tests or the class directly.
Project Explanation:
This is a simple Maven-based project with the following structure:
src/test/java: Contains all automation test code.
Test Cases: Two test cases are implemented.
Base Class (DriverManager): Located in the utils package, manages browser setup. Currently supports Chrome but can be extended for Edge using:
WebDriverManager.edgedriver().setup() (line 12).
Initialize Edge with WebDriver driver = new EdgeDriver(); (line 13).
For cross-browser testing, create a testNG.xml file.
Page Object Model (POM):
Classes:
RegistrationFormPage: Manages web elements on the registration page.
ConfirmationPage: Manages elements used for assertions.
Structure:
Web elements are private for encapsulation.
Elements are initialized using the PageFactory class and @FindBy annotations.
Methods in these classes perform actions on web elements.
Test Class:
Uses TestNG annotations:
@BeforeClass: Sets up the browser and opens the URL.
@Test: Executes test cases by calling POM methods and applying assertions.
@AfterClass: Cleans up post-test execution.
Assertions are used to provide results in the TestNG report.
Scope for Improvement:
Add utility methods for screenshots and reading data from external files for running tests with varied inputs.
Store test data in Excel files and fetch dynamically to simplify data handling.
Include listeners to capture test results, take screenshots for failures, and send email notifications for test outcomes.



