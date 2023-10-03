package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.util.concurrent.TimeUnit;


public class SychronizeToolsqa {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\msedgedriver.exe");
        //launch browser
        WebDriver driver = new EdgeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate url
        driver.navigate().to("https://www.toolsqa.com/");
        Thread.sleep(300);
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.MILLISECONDS);
        driver.findElement(By.xpath("//a[@id='view-gdpr-policy']")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Save And Accept')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Tutorials')]")).click();
        //driver.switchTo().frame(1);
        //driver.findElement(By.xpath("/html/body/header/nav/div/div/div[4]/a/span[2]"));

    }
}
