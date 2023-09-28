package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeJqueryui {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate url
        driver.get("https://jqueryui.com/resizable/");
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        WebElement resize = driver.findElement(By.xpath("//body/div[@id='resizable']/div[1]"));
        //WebElement resize = driver.findElement(By.id("resizable"));
        Thread.sleep(2000);
        Actions drag = new Actions(driver);
        new Actions(driver).dragAndDropBy(resize, 294, 243).build().perform();





    }
}
