import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
    @Test
    void sampleRun() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //  WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com");
        String page_title = driver.getTitle();
        System.out.println(page_title);
        System.out.println(driver.getCurrentUrl());
        driver.close();
        
    }

}
