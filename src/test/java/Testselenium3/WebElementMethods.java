package Testselenium3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebElementMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Thread.sleep(2000);

       // driver.findElement(By.id("firstName")).sendKeys("Subrata");
        // Thread.sleep(2000);
       // driver.findElement(By.id("lastName")).sendKeys("Barua");
       // Thread.sleep(2000);
       // driver.findElement(By.id("lastName")).clear();
       // driver.findElement(By.id("lastName")).sendKeys("Shuku");

        WebElement webElement = driver.findElement(By.id("lastName"));
        Thread.sleep(2000);
        webElement.sendKeys("Subrata");
        Thread.sleep(2000);
        webElement.clear();
        Thread.sleep(2000);
        webElement.sendKeys("Shuku");

        driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
        Thread.sleep(2000);
        WebElement checkBox = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        System.out.println(checkBox.isDisplayed());
        checkBox.click();
        Thread.sleep(2000);
        System.out.println(checkBox.isSelected());
        System.out.println("get tag name: "+checkBox.getTagName());
        System.out.println("height: "+checkBox.getRect().height);
        System.out.println("font-family: "+checkBox.getCssValue("font-family"));
        System.out.println("get text: "+checkBox.getText());

        driver.quit();
    }
}
