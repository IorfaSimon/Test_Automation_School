package org.example;


import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;


public class AlertsGoogle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\msedgedriver.exe");
        //launch browser
        WebDriver driver = new EdgeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate url
        driver.navigate().to("https://www.google.com/");
        //input testify ltd
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Testify ltd");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
        Thread.sleep(300);

        //scroll
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeAsyncScript("window.scrollBy(0, 5200)");
        Thread.sleep(5000);

        Set<String> window = driver.getWindowHandles();
        for (String windows : window) {
            driver.switchTo().window(windows);
            Thread.sleep(3000);
            System.out.println(driver.getCurrentUrl());
            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/company/testifyorg/")) {
                driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/*[1]")).click();

            }

        }

    }
}


