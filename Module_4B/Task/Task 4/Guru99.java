package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Guru99 {
    public static void main(String[] args) {
        System.setProperty("webdriver..driver","C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest");

        System.out.println("webdriver.opera.driver");
        //launch browser
        WebDriver driver = new OperaDriver();
        //maximize browser
        driver.manage().window().maximize();

        driver. manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        //navigate url
        driver.get("http://demo.guru99.com/");
        driver.findElement(By.id("message9")).sendKeys("look@gmail.com");
        driver.findElement(By.name("btnLogin")).sendKeys("Submit");
        driver.findElement(By.linkText("http://demo.guru99.com")).sendKeys("Security project");
        driver.quit();





    }
}
