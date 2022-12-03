package Video2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver_manage_methods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        System.out.println(driver.manage().window().getSize());//(1050,708)içinde olduğu sayfanın pixel olarak ölçülerini
        // verir
        System.out.println(driver.manage().window().getSize().height);//708
        System.out.println(driver.manage().window().getSize().width);//1050

        System.out.println(driver.manage().window().getPosition());//10,10
        System.out.println(driver.manage().window().getPosition().x);//10
        System.out.println(driver.manage().window().getPosition().y);//10

        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(900,600));

        System.out.println("The new position"+driver.manage().window().getPosition());
        System.out.println("The new page size"+driver.manage().window().getSize());

        System.out.println("======================================================");

        driver.manage().window().maximize();
        System.out.println("The maximized position"+driver.manage().window().getPosition());
        System.out.println("The maximized page size"+driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println("The fullscreen position"+driver.manage().window().getPosition());
        System.out.println("The fullscreen page size"+driver.manage().window().getSize());

        driver.manage().window().minimize();//sayfayı simge durumunda küçültür yani aşağı alır.





    }
}
