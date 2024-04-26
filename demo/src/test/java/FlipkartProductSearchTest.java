// Create a TestNG code to simulate user interaction by searching for a product on an e-commerce website and verifying the display of the product description page. Utilize appropriate TestNG annotations to orchestrate the search process, navigate to the product page, and validate its contents."
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartProductSearchTest {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Maven\\demo\\src\\test\\java\\chromedriver.exe");
    }
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testProductSearchAndAddToCart() {
        driver.get("https://www.flipkart.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("iphone 15");
        searchBox.submit();
        WebElement firstSearchResult =
driver.findElement(By.xpath("//div[@class='_4rR01T']")); // This XPathmay need adjustment based on the structure of the search results
        firstSearchResult.click();//div[@class='_4rR01T]'
        WebElement productDescription =
driver.findElement(By.xpath("//div[@class='_4rR01T']"));// This XPathmay need adjustment based on the structure of the product page
        System.out.println("Product Description:sss"+productDescription.getText());
        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @AfterClass
    public void tearDown() {
        // Close the browser
        //driver.quit();
    }
    @AfterTest
    public void afterTest() {
        // Clean up any resources after the test
    }
}
