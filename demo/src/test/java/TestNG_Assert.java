
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNG_Assert {
  
    WebDriver driver; 
    String url = "http://demo.guru99.com/test/newtours/";
    @BeforeTest
    public void beforetest(){
    System.out.println("before test");
    System.setProperty("webdriver.chrome.driver","C:\\Users\\University\\Desktop\\Sem4\\ST\\Maven1\\apache-maven-3.8.8-bin\\demo\\demo\\drivers\\chromedriver.exe");
    driver = new ChromeDriver(); 
    driver.get(url); 
}
@Test
public void test()
{
    String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
         
          if(expectedTitle.contentEquals(actualTitle))
          {
          System.out.println("test passed   "+actualTitle);
          }
          else{
            System.out.println("test fail "+expectedTitle);
          }

}
@AfterTest
public void afterTest()
{
    
    System.out.println("after test");
    driver.close();
}
}
