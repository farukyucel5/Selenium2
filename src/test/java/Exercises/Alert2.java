package Exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.cssSelector(".btn.btn-danger")).click();


        String message1 = driver.switchTo().alert().getText();
        System.out.println(message1);

        driver.switchTo().alert().accept();

//todo                      Basit Uyarı

        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();


        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();

        WebElement message=driver.findElement(By.cssSelector("#demo"));

        System.out.println(message.getText());

        //todo             input bekleyen uyarılar
        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();


        driver.findElement(By.cssSelector(".btn.btn-info")).click();



        driver.switchTo().alert().sendKeys("Faruk");


        driver.switchTo().alert().accept();


        String message2= driver.findElement(By.cssSelector("#demo1")).getText();


        System.out.println("Mesajım :   " + message2);




    }
}
