package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Saucedemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\msedgedriver.exe");
        //launch browser
        WebDriver driver = new EdgeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate url
        driver.get("https://www.saucedemo.com/");
        //input username
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("performance_glitch_user");
        Thread.sleep(500);
        //input password
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        Thread.sleep(500);
        //click login button
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(500);
        //add to cart
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        Thread.sleep(500);
        //clich cart container
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
        //checkout
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        //input first name
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Simon");
        Thread.sleep(500);
        //input last name
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Iorfa");
        //postal code
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("234");
        Thread.sleep(500);
        //continue
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        // click finish
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();



    }
}
