package Video4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Bestbuy {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.bestbuy.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        List<WebElement> buttonlist=driver.findElements(By.tagName("button"));
        System.out.println(buttonlist.size()+" adet buton var");

        for (WebElement each:buttonlist) {
            System.out.println(each.getText());

        }

    }
}
