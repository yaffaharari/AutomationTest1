import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.NodeList;

import javax.swing.*;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class TestCase1 {

    public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
        // System.setProperty("webdriver.chrome.driver", ".//drivers.chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //open the web app
        driver.navigate().to("https://he.wikipedia.org/wiki/%D7%A2%D7%9E%D7%95%D7%93_%D7%A8%D7%90%D7%A9%D7%99");
        // driver.manage().window().maximize();

        String title = driver.getTitle();

        if (title.equalsIgnoreCase("google"))
            System.out.println("Title matches");
        else
            System.out.println("title");

        WebElement a = driver.findElement(By.xpath("//*[@id='n-portal']/a"));
        a.click();

    }
}
