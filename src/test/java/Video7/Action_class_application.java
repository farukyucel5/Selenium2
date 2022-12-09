package Video7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Action_class_application {
    @Test
    public void test01() {
        //1. Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Navigate to url 'http://automationexercise.com
        driver.get("http://automationexercise.com");
        //3. Click on 'Signup / Login' button
        WebElement signupElementi=driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        Actions actions=new Actions(driver);
        actions.click(signupElementi).perform();

        //4. Enter name and email address
        //5. Click 'Signup' button
        WebElement nameKutusu= driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        actions.click(nameKutusu)
                .sendKeys("Faruk")
                .sendKeys(Keys.TAB)
                .sendKeys("faruk06@bfcde.com")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        //6. Fill details: Title, Name, Email, Password, Date of birth
        //7. Select checkbox 'Sign up for our newsletter!'
        //8. Select checkbox 'Receive special offers from our partners!'
        //9. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement titleRadiButton= driver.findElement(By.xpath("//div[@id='uniform-id_gender1']"));
        WebElement click1=driver.findElement(By.xpath("//input[@id='newsletter']"));
        WebElement click2=driver.findElement(By.xpath("//input[@id='optin']"));
        WebElement createAccount=driver.findElement(By.xpath("//button[@data-qa='create-account']"));

        actions.click(titleRadiButton)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("3")
                .sendKeys(Keys.TAB)
                .sendKeys("March")
                .sendKeys(Keys.TAB)
                .sendKeys("1990     ")
                .sendKeys(Keys.TAB)
                .click(click1)
                .sendKeys(Keys.TAB)
                .click(click2).
                sendKeys(Keys.TAB).
                sendKeys("Faruk").
                sendKeys(Keys.TAB).
                sendKeys("Yucel").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("Sendurak street no 29").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("Poland").
                sendKeys(Keys.TAB).
                sendKeys("Null").
                sendKeys(Keys.TAB).
                sendKeys("Warsaw").
                sendKeys(Keys.TAB).
                sendKeys("12345").
                sendKeys(Keys.TAB).
                sendKeys("12345678").
                sendKeys(Keys.TAB)
                .click(createAccount)//it also could be like this .sendKeys(Keys.ENTER)
                .perform();

        //10. Click 'Create Account button'
        //11. Verify that 'ACCOUNT CREATED!' is visible
        String expectedYazi="ACCOUNT CREATED!";
        String actualYazi=driver.findElement(By.xpath("//h2[@data-qa='account-created']")).getText();
        Assert.assertEquals(expectedYazi,actualYazi);

        driver.close();
    }
}
