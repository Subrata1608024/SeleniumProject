package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassAnnotationTest extends BaseClassTest{
    @Test(priority = 1)
    public void loginShouldSucceed() throws InterruptedException {

        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        String login = driver.findElement(By.id("logout_sidebar_link")).getText().trim();
        Assert.assertEquals(login,"Logout");

    }

    @Test(priority = 0)
    public void checkFirstProduct() throws InterruptedException {
        //id
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();




        String productTitle = driver.findElement(By.className("inventory_item_name")).getText().trim();
        Assert.assertEquals(productTitle,"Sauce Labs Backpack");


    }

    

    @Test(priority = 2)
    public void checkTitle(){
        Assert.assertEquals(driver.getTitle(),"Swag Labs");

    }

}
