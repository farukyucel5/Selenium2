package Exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {


     @Test
    public void test1(){
         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();


         driver.get("https://www.demo.guru99.com/popup.php");


         String firstWin= driver.getWindowHandle();//ilk penceremi kaydettim
          System.out.println("the first win : "+firstWin);

         String firstWebUrl= driver.getCurrentUrl();

         System.out.println("First url: "+firstWebUrl);

         driver.findElement(By.xpath("//a[text()='Click Here']")).click();



         Set<String> windowAllWindows=driver.getWindowHandles();


         for (String window:windowAllWindows){

             driver.switchTo().window(window);

         }



         driver.findElement(By.name("emailid")).sendKeys("frk@gmail.com");

         driver.findElement(By.name("btnLogin")).click();

         System.out.println("Second window's url: "+driver.getCurrentUrl());

         driver.close();

         driver.switchTo().window(firstWin);

         String expected="https://www.demo.guru99.com/popup.php";

         Assert.assertEquals(expected,driver.getCurrentUrl());

         driver.close();
     }

}
