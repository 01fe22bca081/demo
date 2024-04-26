//3.	Implement a TestNG test class to navigate through different web pages of a website, validating page transitions and displaying the name of  visited current page for verification."
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class NavigateTestNG {
    ChromeDriver driver;
    String url = "https://www.flipkart.com";
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Maven\\demo\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void navigateCommands()
    {
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        String urlFromWebpage = driver.getCurrentUrl();
        System.out.println("Current URL: " + urlFromWebpage);
        driver.navigate().refresh();
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
