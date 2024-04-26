// 4.Implement a TestNG annotations to validate webpage title, ensuring they match predefined expected title and compare with the actual title of the page.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testing_Assert {
    WebDriver driver;
    String url = "http://demo.guru99.com/test/newtours/";
    @BeforeTest
    public void beforetest() {
        System.out.println("before test");
        System.setProperty("webdriver.chrome.driver", "C:\\Maven\\demo\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }
    @Test
    public void test() {
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        if (expectedTitle.contentEquals(actualTitle)) {
            System.out.println("test passed   " + actualTitle);
        } else {
            System.out.println("test fail " + expectedTitle);
        }
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test");
        driver.close();
    }
}

