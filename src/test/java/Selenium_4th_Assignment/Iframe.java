package Selenium_4th_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        //main frame
        System.out.println("Main iFrame:" + driver.findElement(By.className("text-center")).getText());
        Thread.sleep(3000);
        driver.switchTo().frame("frame1");
        //inside frame
        System.out.println("inside iFrame:" + driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
        Thread.sleep(3000);

        //main frame-2
        System.out.println("Main iFrame:" + driver.findElement(By.className("text-center")).getText());
        Thread.sleep(3000);
        driver.switchTo().frame("frame2");
        //inside frame-2
        System.out.println("inside iFrame:" + driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
        Thread.sleep(3000);

        driver.quit();



    }
}
