// AboutPageNavigationTest.java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AboutPageNavigationTest {

   private WebDriver driver;
    private String url="https://demo.guru99.com/test/newtours/login.php";
    @BeforeClass
    public void setUp() {
        // Set up WebDriver (assuming ChromeDriver is used)
        System.out.println("setup of aboutpage");
    }

    @Test(groups = "pageNavigation")
    public void navigateToAboutPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\University\\Desktop\\Sem4\\ST\\Maven1\\apache-maven-3.8.8-bin\\demo\\demo\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
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
