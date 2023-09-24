package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserNavigationSaucedemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\msedgedriver.exe");
        //launch browser
        WebDriver driver = new EdgeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate url
        driver.navigate().to("https://www.saucedemo.com/");
        //input username
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("performance_glitch_user");
        Thread.sleep(500);
        //input password
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
        Thread.sleep(500);
        //click login button
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
        driver.navigate().refresh();
        Thread.sleep(500);
        driver.navigate().back();
        Thread.sleep(5000);

        String name = driver.findElement(By.xpath("//input[@id=\"login-button\"]")).getAttribute("name");
        System.out.println(name);
        driver.navigate().forward();


    }
}
