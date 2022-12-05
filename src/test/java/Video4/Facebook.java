package Video4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Facebook {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));

        email.sendKeys("hasan@gmail.com");

        WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));

        password.sendKeys("1203456");

        WebElement enter= driver.findElement(By.xpath("//button[@value='1']"));
        enter.click();

        WebElement message=driver.findElement(By.xpath("//div[@class='_9ay7']"));


        String expectedMessage="Girdiğin şifre yanlış. Şifreni mi Unuttun?";
        String actualMessage=message.getText();

        if (expectedMessage.equalsIgnoreCase(actualMessage))
        {
            System.out.println("Test passed");
        }





    }
}
