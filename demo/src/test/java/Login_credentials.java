import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_credentials {
   WebDriver driver;
   String url = "https://practicetestautomation.com/practice-test-login/";

   @BeforeSuite
   public void beforeSuite() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\.vscode\\demo1\\chromedriver.exe");
   }                                                 

   @BeforeTest
   public void BeforeTest() {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
   }

   @BeforeMethod
   public void InvokeBrowser() {
      driver.get(url);
   }

   @Test(priority = 0)
   public void validLogin() {
      Login("student", "Password123");
   }

   @Test(priority = 1)
   public void invalidLogin() {
      Login("student", "password12345");
   }

   @AfterMethod
   public void AfterMethod() {
      System.out.println("Executed All Credentials");
   }

   @AfterTest
   public void AfterTest() {
      System.out.println("Executed All Test Cases");
      // driver.quit();
   }

   @AfterSuite
   public void teardown() {
      System.out.println("Logout Successfull");
      //driver.quit();
   }

   private void Login(String username, String password) {
      WebElement usernameElement = driver.findElement(By.id("username"));
      usernameElement.sendKeys(username);

      WebElement passwordElement = driver.findElement(By.id("password"));
      passwordElement.sendKeys(password);

      driver.findElement(By.id("submit")).click();
   }
}
