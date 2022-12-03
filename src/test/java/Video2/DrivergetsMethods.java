package Video2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrivergetsMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println("The page title "+driver.getTitle());

        System.out.println("The page url "+driver.getCurrentUrl());


    }
}
