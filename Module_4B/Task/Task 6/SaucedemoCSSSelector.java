package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SaucedemoCSSSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\msedgedriver.exe");
        //launch browser
        WebDriver driver = new EdgeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate url
        driver.get("https://www.saucedemo.com/");
        //input username
        driver.findElement(By.cssSelector("input#user-name")).sendKeys ("standard_user");

        //input password
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        Thread.sleep(500);
        //click login button
        driver.findElement(By.cssSelector("input#login-button")).click();
        Thread.sleep(500);
        //add to cart
        driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(500);
        //clich cart container
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
        //checkout
        driver.findElement(By.cssSelector("button#checkout")).click();
        //input first name
        driver.findElement(By.cssSelector("input#first-name")).sendKeys("Simon");
        Thread.sleep(500);
        //input last name
        driver.findElement(By.cssSelector("input#last-name")).sendKeys("Iorfa");
        //postal code
        driver.findElement(By.cssSelector("input#postal-code")).sendKeys("234");
        Thread.sleep(500);
        //continue
        driver.findElement(By.cssSelector("input#continue")).click();

        driver.findElement(By.cssSelector("button#finish")).click();



    }
}
