This project is the part of QA Assignment for the application of Satvic Movement. It is automating the Resigtration part of the application along with the Register now button navigation. This is also confirmaing the successful Registration and confirms the email id and the phone number dispalyed after registration,
Steps to load the project in local:
You should have an IDE Eclipse or IntelliJ 
The java should present in the system
Also the chrome browser and edge browser should be installed in the system
After loading the project in the system. Save it and make sure all dependencies are in sync and project in not showing any error anywhere
Run it from IDE , 
Go to the src/test/java folder 
Go to tests package 
Open testRegistrationForm testclass
Directly click on run tests or class
For reference Screen REcording is done for the automation run of the project with Chrome browser using IntelliJ IDE
Project Explaination: Its a simple maven project made with maven folder structure.
It has a src/test/java folder which contains all the code related to the automation test.
To keep it simple :
only two test cases have been added
There is a base class with name 
Drivermanager in the utils package which is managing the browser set up code. Currently it has only chrome browser code but to make it run on other browsers we can make changes in the code
we can use WebDriverManager.edgedriver().setup() in line no 12  and initialise the WebDriver with WebDriver driver = new Edgedriver(); in line no 13. Also we can do cross browser testing by creating a testNg.xml file
Now Next I have created POM classes in pages package inside src/test/java , It has first class as RegistrationFormpage class all the webelements used  from the registration page. The second class is confirmationPage which 
has all the weelements which are used in the test cases assertion of this page.
Then these classes have constructor which uses PageFactory class for initialisation of the elements in the classes by using initElements method , It is using FindBy annotation to find the elements and storing them in
the variables assigned for them.All webelemnts are private for encapsulation.Then the methods are created in the classes for performing action on the webelements. 
We have test class which is using testNG annotations @BeforeClass. @Test @Test @After Class, In the @Before Class all the initial set up is being done for the browser to open and open the url
Then under @test annotation is performing the text case execution by calling methods from the POM class. It is applying Assertions to provide the result of test case execution in the TestNG report.
Scope of Improvement: The utils package we can add classes having methods for taking screenshot and for for accessing data from a file in case of passing multiple data from a file. We can also keep all test data in Excel file
and directly use that code to fetch the test data. I would have also done that but giving this code only to make it run easily on other system to avoid any complexities. We can also add Listeners in the project to fetch 
the test results and then taking screenshot for failed result and email the results on passing.
