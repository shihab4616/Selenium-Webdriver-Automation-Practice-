package Selenium_3rd_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebInfoTest {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://gormg-v3-staging.skylarksoft.net/login");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        //Axis X and Y find out
        WebElement webElement= driver.findElement(By.id("email"));
        System.out.println(webElement.getTagName());
        System.out.println(webElement.getRect().x);
        System.out.println(webElement.getRect().y);

        //Find out Css color, Size & Font size
        WebElement element = driver.findElement(By.id("login"));
        System.out.println(element.getCssValue("font-family"));
        System.out.println(element.getCssValue("font-size"));
        System.out.println(element.getCssValue("font-weight"));
        System.out.println(element.getCssValue("border-radius"));
        System.out.println(element.getCssValue("color"));

        driver.quit();
    }
}
