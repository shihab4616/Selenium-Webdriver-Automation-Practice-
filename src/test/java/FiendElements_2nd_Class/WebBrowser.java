package FiendElements_2nd_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://gormg-v3-staging.skylarksoft.net/login");
        Thread.sleep(4000);
        driver.quit();
    }

}
