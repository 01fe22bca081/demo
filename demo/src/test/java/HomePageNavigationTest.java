// HomePageNavigationTest.java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HomePageNavigationTest {

    WebDriver driver;
    String url="https://demo.guru99.com/test/newtours/index.php";
    
   @BeforeClass
   public void setup()
   {
    System.out.println("setup of Homepage");
   }

    @Test(groups = "pageNavigation")
    public void navigateToHomePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\University\\Desktop\\Sem4\\ST\\\\Maven1\\apache-maven-3.8.8-bin\\demo\\demo\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
       // driver.navigate().to("https://www.google.com");
        // Add assertions or other validation here
    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver after all test methods in the class
        if (driver != null) {
            driver.quit();
        }
    }
}
