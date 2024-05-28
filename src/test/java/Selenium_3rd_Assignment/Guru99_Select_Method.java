package Selenium_3rd_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99_Select_Method {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

           /* How to use select method
        We can use three select method
        1. Index
        2. Value
        3. Text
         */
        Select select= new Select(driver.findElement(By.cssSelector("select[name='country']")));
        //use of index method
        select.selectByIndex(3);
        Thread.sleep(3000);
        //use of Value method
        select.selectByValue("ALGERIA");
        Thread.sleep(3000);
        //use of Text method
        select.selectByVisibleText("ANDORRA");
        Thread.sleep(3000);










    }
}
