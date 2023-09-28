package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class Selenium08 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate url
        driver.navigate().to("https://selenium08.blogspot.com/");
        driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Demo dropdown");
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/div[1]/*[1]")).click();
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[4]/div[2]/a[1]")).click();
        WebElement Menu = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));
        Select select = new Select(Menu);
        select.selectByIndex(159);
        Thread.sleep(500);

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeAsyncScript("window.scrollBy(0, 500)");

        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]"));
//        WebElement Menu1 = driver.findElement(By.xpath("//option[contains(text(),'January')]"));
//        Select select1 = new Select(Menu1);
        select.selectByIndex(5);
//        select1.selectByVisibleText("Feb");
//        select1.selectByVisibleText("Mar");



    }
}
