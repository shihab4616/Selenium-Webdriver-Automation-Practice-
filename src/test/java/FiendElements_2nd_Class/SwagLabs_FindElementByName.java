package FiendElements_2nd_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwagLabs_FindElementByName {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        //Enter Your Email Or Phone number
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

    }

}
