package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WorldWeather {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\msedgedriver.exe");
        //launch browser
        WebDriver driver = new EdgeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate url
        driver.get("https://worldweather.wmo.int/en/home.html");
        //input username
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#q_search")).sendKeys("lagos");
        driver.findElement(By.xpath("//*[@id=\"searchForm\"]/input[3]")).click();
        String text = driver.findElement(By.xpath("/html/body/div[1]/div[6]")).getText();
        System.out.println(text);

        

    }
}