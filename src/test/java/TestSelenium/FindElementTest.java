package TestSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class FindElementTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        List<WebElement> webelement = driver.findElements(By.tagName("input"));
        System.out.println("Total link: "+webelement.size());
        Thread.sleep(3000);
        driver.quit();
    }
}
