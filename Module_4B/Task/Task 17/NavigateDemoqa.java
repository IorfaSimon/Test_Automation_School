package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NavigateDemoqa {

    WebDriver driver = null;

    @Test
    public  void window() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Mr. Simoen\\Desktop\\TestNGSelenium\\SeleniumWebTest");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Thread.sleep(5000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);
        String elementPage = driver.getCurrentUrl();
        System.out.println(elementPage);
        Assert.assertEquals(elementPage, "https://demoqa.com/");

    }
    @Test
    public  void element() throws InterruptedException {
        driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
        Thread.sleep(5000);
        String elementPage = driver.getCurrentUrl();
        System.out.println(elementPage);
        Assert.assertEquals(elementPage, "https://demoqa.com/elements");
    }

    @AfterTest
    public  void close(){
        driver.quit();

    }
}
