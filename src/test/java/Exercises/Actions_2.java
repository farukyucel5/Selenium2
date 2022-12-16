package Exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Actions_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com/");

        Actions actions=new Actions(driver);

        List<WebElement> menubar=driver.findElements(By.xpath("//ul[@role='menubar']//li"));

        for (WebElement each:menubar) {
            actions.moveToElement(each).perform();
            Thread.sleep(1000);
        }




















    }
}
