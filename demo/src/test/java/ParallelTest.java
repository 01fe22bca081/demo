import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
    public WebDriver driver;

    @Test
    public void FirefoxTest() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\University\\Desktop\\\\Sem4\\ST\\\\Maven1\\apache-maven-3.8.8-bin\\demo\\\\demo\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        String urlFromWebpage = driver.getCurrentUrl();
        System.out.println("Current URL is : " + urlFromWebpage);
        System.out.println("Print Firefox");
        driver.quit();
    }

    @Test
    public void ChromeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\University\\Desktop\\Sem4\\ST\\Maven1\\apache-maven-3.8.8-bin\\demo\\demo\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        String urlFromWebpage = driver.getCurrentUrl();
        System.out.println("Current URL is : " + urlFromWebpage);
        System.out.println("Print Chrome");
        driver.quit();
    }
}
