package Exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Actions_drag_drop {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        //Capital cities
        WebElement oslo=driver.findElement(By.cssSelector("#box1"));
        WebElement stockholm=driver.findElement(By.cssSelector("#box2"));
        WebElement washington=driver.findElement(By.cssSelector("#box3"));
        WebElement copenhagen=driver.findElement(By.cssSelector("#box4"));
        WebElement seoul=driver.findElement(By.cssSelector("#box5"));
        WebElement rome=driver.findElement(By.cssSelector("#box6"));
        WebElement madrid=driver.findElement(By.cssSelector("#box7"));

        //countries

        WebElement italy=driver.findElement(By.cssSelector("#box106"));
        WebElement spain=driver.findElement(By.cssSelector("#box107"));
        WebElement norway=driver.findElement(By.cssSelector("#box101"));
        WebElement denmark =driver.findElement(By.cssSelector("#box104"));
        WebElement south_korea=driver.findElement(By.cssSelector("#box105"));
        WebElement sweden=driver.findElement(By.cssSelector("#box102"));
        WebElement usa=driver.findElement(By.cssSelector("#box103"));

        Actions actions=new Actions(driver);

        actions.dragAndDrop(rome,italy).build().perform();
        actions.dragAndDrop(seoul,south_korea).build().perform();
        actions.dragAndDrop(stockholm,sweden).build().perform();
        actions.dragAndDrop(oslo,norway).build().perform();
        actions.dragAndDrop(madrid,spain).build().perform();
        actions.dragAndDrop(copenhagen,denmark).build().perform();
        actions.dragAndDrop(washington,usa).build().perform();




    }
}
