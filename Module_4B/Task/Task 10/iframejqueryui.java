package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iframejqueryui {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\msedgedriver.exe");
        //launch browser
        WebDriver driver = new EdgeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate url
        driver.navigate().to("https://jqueryui.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Draggable')]")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='draggable']"));
        driver.manage().window().minimize();
        driver.close();





    }
}
