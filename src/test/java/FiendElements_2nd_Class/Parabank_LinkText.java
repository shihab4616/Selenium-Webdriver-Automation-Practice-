package FiendElements_2nd_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwagLabs_LinkText {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("gin in")).click();
        Thread.sleep(2000);


    }

}
