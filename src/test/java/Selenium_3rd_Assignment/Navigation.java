package Selenium_3rd_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://gormg-v3-staging.skylarksoft.net/login");
        navigate.forward();
        Thread.sleep(2000);
        navigate.back();
        Thread.sleep(2000);
        navigate.refresh();
        Thread.sleep(2000);

    }
}
