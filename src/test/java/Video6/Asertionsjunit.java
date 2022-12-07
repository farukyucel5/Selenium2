package Video6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Asertionsjunit {
    static WebDriver driver;
    @BeforeClass//before class yaparsak bir kere sınıfın basında çalısır. HER SEFERİNDE TEKRAR ÇALISMAZ
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterClass //AYNI ŞEKİLDE BİR DEFA ÇALIŞIR YANİ İŞLEMLER SONUNDA KAPATIR VE BİTİRİR.
    public static void tearDown(){ //beforeclass veya afterclass yaparsak methodlar static olmak zorunda.
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("https://www.amazon.com");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("Nutella");
        searchBox.submit();

        WebElement resultText=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));


        String actualText=resultText.getText();
        String expectedWord="Kutella";

        Assert.assertTrue(actualText.contains(expectedWord));
    }
    @Test
    public void test2(){
        driver.get("https://www.amazon.com");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("Nutella");
        searchBox.submit();

        WebElement resultText=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));


        String actualText=resultText.getText();
        String expectedWord="Nutella";

        Assert.assertTrue(actualText.contains(expectedWord));
    }

    @Test
    public void test3(){
        driver.get("https://www.amazon.com");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("Nutella");
        searchBox.submit();

        WebElement resultText=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));


        String actualText=resultText.getText();
        String expectedWord="Nutella";

        Assert.assertEquals(expectedWord,actualText);
    }

}
