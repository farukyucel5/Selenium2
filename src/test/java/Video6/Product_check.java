package Video6;

import Video5.Junit3;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Product_check {

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

        WebElement resultText=driver.findElement(By.xpath("//span[normalize-space()='1-48 of 81 results for']"));


        String actualText=resultText.getText();
        String expectedWord="kutella";

        if (actualText.contains(expectedWord))
        System.out.println("Test was passed!!");
        else
         System.out.println("The result text does not contain 'Nutella' "+"\nTest FAİLED!!");
   }


}
