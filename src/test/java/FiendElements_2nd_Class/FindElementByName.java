package FiendElements_2nd_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByName {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://gormg-v3-staging.skylarksoft.net/login");
        Thread.sleep(2000);
        //Enter Your Email Or Phone number
        driver.findElement(By.name("email")).sendKeys("shihab@skylarksoft.com");
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("Shihab");
        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);

    }

}
