// 7.Demonstration of Failed Test
// Develop a TestNG script to demonstrate the handling of failed tests
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Assert_fail  {
    WebDriver driver;
    String url = "http://demo.guru99.com/test/newtours/";
    @BeforeTest
    public void beforetest() {
        System.out.println("Before test");
    System.setProperty("webdriver.chrome.driver","C:\\Maven\\demo\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }
   @Test
    public void testPass() {
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title verification failed");
        System.out.println("Test passed: " + actualTitle);
    }
    @Test
    public void testFail() {
        String expectedTitle = "Incorrect Title";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title verification failed");
        System.out.println("Test failed: " + actualTitle);
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After test");
        driver.close();
    }
