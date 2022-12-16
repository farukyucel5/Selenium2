package Exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.demo.guru99.com/test/delete_customer.php");



        WebElement customer_ID =driver.findElement(By.xpath("//input[@name='cusid']"));

        customer_ID.sendKeys("asd123");

        WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));

        submitButton.click();

        Thread.sleep(2000);

        driver.switchTo().alert().accept();//alert'seki tamam butonuna basarak onayladık

       // driver.switchTo().alert().dismiss();//alert'deki iptale basarak işlemi iptal ettik

        Assert.assertEquals("Customer Successfully Delete!",driver.switchTo().alert().getText());

        Thread.sleep(1000);

        System.out.println(driver.switchTo().alert().getText());//alert'deki yazıyı gösterir
        driver.switchTo().alert().accept();

        Thread.sleep(1000);

        driver.close();


    }
}
