import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class Login_credentials{
    WebDriver driver;
    String url = "https://demo.guru99.com/v4/";
    @BeforeSuite
    public void beforeSuite() {
    System.setProperty("webdriver.chrome.driver", "C:\\Maven\\demo\\src\\test");
    }
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @BeforeMethod
    public void invokeBrowser() {
        driver.get(url);
    }
    @Test(priority = 0)
    public void validLogin() {
        login("mngr266311", "12345678@");
    }
    @Test(priority = 1)
    public void invalidLogin() {
        login("mngr26631", "12345678");
    }
    /*@Test()(priority = 2)
    public void blankLogin() {
        login("", "");
    }*/
    @AfterMethod
    public void afterMethod() {
        System.out.println("executed all credentials");
            }
    @AfterTest
    public void afterTest() {
        System.out.println("login executed successfully aftertest");
      //  driver.close();
    }
    @AfterSuite
    public void tearDown() {
        // Clean up resources if needed
        System.out.println("logout successfully");
        driver.quit();
    }
    private void login(String username, String password) {
        WebElement usernameElement = driver.findElement(By.name("uid"));
        usernameElement.sendKeys(username);

        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys(password);

driver.findElement(By.name("btnLogin")).click();
    }
}
