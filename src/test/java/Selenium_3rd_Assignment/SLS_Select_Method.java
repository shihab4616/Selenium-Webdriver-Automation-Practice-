package Selenium_3rd_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SLS_Select_Method {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://gormg-v3-staging.skylarksoft.net/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Enter Your Email Or Phone number
        driver.findElement(By.cssSelector("input[ng-model='user.email']")).sendKeys("shihab@skylarksoft.com");
        Thread.sleep(2000);

        //Enter YOur Password
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Shihab");
        Thread.sleep(2000);

        //Click for LogIN
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        Thread.sleep(2000);

        driver.get("https://gormg-v3-staging.skylarksoft.net/merchandising/orders/create");
        /* How to use select method
        We can use three select method
        1. Index
        2. Value
        3. Text
         */
        Select select= new Select(driver.findElement(By.cssSelector("select[id='unit']")));
        //use of index method
        select.selectByIndex(10);
        Thread.sleep(3000);
        //use of Value method
        select.selectByValue("3");
        Thread.sleep(3000);
        //use of Text method
        select.selectByVisibleText("SLS Unit");
        Thread.sleep(3000);










    }
}
