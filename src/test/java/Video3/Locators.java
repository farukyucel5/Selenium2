package Video3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

      WebElement summit1=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
       WebElement searchBox1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       searchBox1.click();
       searchBox1.sendKeys(" warm coats");
       summit1.click();




    }

}
