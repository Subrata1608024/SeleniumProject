package TestSelenium2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class SelectorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/about.htm;jsessionid=B4494B7886257648A90D702E1F0CD386");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Relative xpath
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcesd");
        Thread.sleep(2000);

        //name
        driver.findElement(By.name("password")).sendKeys("abcesd");
        Thread.sleep(2000);

        //linkText
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);

        //PartialLinkText
        driver.findElement(By.partialLinkText("n info?")).click();
        Thread.sleep(2000);

        //CssSelector
        driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("ahjdgfh");
        driver.findElement(By.id("lastName")).sendKeys("ahjdgfh");
        driver.findElement(By.id("address.street")).sendKeys("ahjdgfh");

        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        for (WebElement webElement : webElements) {
            System.out.println(webElement.getText() +" "+webElement.getAttribute("href"));
        }
        driver.quit();


    }

}
