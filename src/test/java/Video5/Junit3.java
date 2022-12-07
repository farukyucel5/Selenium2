package Video5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit3 {
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

    @Test @Ignore//yapılmasını istemediğimiz testin başına ignore  eklersek pas geçer.
    public void test3(){
        driver.get("https://www.facebook.com");
    }

    @Test
    public void test4(){
        driver.get("https://dictionary.cambridge.org/tr/");

    }
}

