package Exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Select_Class {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        WebElement cookies= driver.findElement(By.cssSelector("span.cookie-choices-buttons>:nth-child(2)"));
        cookies.click();
        WebElement isim = driver.findElement(By.xpath("//input[@name='firstname']"));
        isim.sendKeys("Faruk");

        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Yucel");

        driver.findElement(By.cssSelector("input[id=sex-0]")).click();

        List<WebElement> list=driver.findElements(By.cssSelector("div[dir=ltr]>:nth-child(14)>input"));

        for (WebElement webElement : list) {

            webElement.click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        WebElement date=driver.findElement(By.cssSelector("#datepicker"));
        date.sendKeys("23.07.2020");

        List<WebElement> list2=driver.findElements(By.cssSelector("div[dir=ltr]>:nth-child(20)>input"));

        for (WebElement each:list2) {
            each.click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


        List<WebElement> tool=driver.findElements(By.xpath("(//div[@class='control-group'])[7]//input"));

        for (WebElement each:tool) {
            each.click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        //select class

        WebElement continents=driver.findElement(By.cssSelector("#continents"));//select[id=continents]
        Select slc=new Select(continents);

        slc.selectByVisibleText("Europe");


        WebElement command=driver.findElement(By.cssSelector("#selenium_commands"));
        slc=new Select(command);

        slc.selectByIndex(0);
        slc.selectByIndex(1);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();






    }
}
