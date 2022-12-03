package Video2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_methods {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com");
        waiting();

        driver.navigate().to("https://www.facebook.com");
        /*
        driver.navigate.to() driver.get()ile aynı işlemi yapar fakat bir
        farkı var,forward and back işlemlerinin de yapılmasına
        imkan tanır
         */
        waiting();

        driver.navigate().back();//Amazon'dan Facebook'a geri döner
        waiting();

        driver.navigate().forward();//Facebook'tan Amazona dönüş yapar.
        waiting();

        driver.navigate().refresh();//bulunduğu sayfayı yeniler.
        waiting();

        //driver.close();//driver oluşturulduğunda açılan sayfayı kapatır

        driver.quit();//driver çalışırken birden fazla tab açtıysa tümünü kapatır.
    }

    public static void waiting()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
