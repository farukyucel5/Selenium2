package Exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag {

    static WebDriver driver;
    @BeforeClass
    public static void first(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void test(){

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
    }

    @Test
    public void test1(){

        driver.findElement(By.xpath("//a[@id='reset_sidebar_link']")).click();
    }

    @AfterClass
    public static void close(){
        driver.quit();
    }


}
