package Video5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit2 {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("https://www.amazon.com");
        WebElement seachBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        seachBox.sendKeys("Nutella");

        seachBox.submit();
        WebElement theNumberOfProducts= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(theNumberOfProducts.getText());

    }

    @Test
    public void test2(){
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void test3(){
        driver.get("https://www.facebook.com");
    }
}
