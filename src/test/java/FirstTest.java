import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {


    @Test
    public  void Test(){
        System.setProperty("Webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver  = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.quit();
    }
}
