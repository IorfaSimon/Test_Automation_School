package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Idorenyi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\msedgedriver.exe");
        //launch browser
        WebDriver driver = new EdgeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate url
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("King");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#lastName")).sendKeys("David");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#email")).sendKeys("kingdavid@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#password")).sendKeys("Davking1");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#male")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#confirmPass")).sendKeys("Davking1");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#xpLevel")).sendKeys("I'm a Tester");
        driver.findElement(By.xpath("//*[@id=\"create\"]")).isEnabled();
        boolean expected = driver.findElement(By.xpath("//*[@id=\"create\"]")).isEnabled();
        System.out.println(expected);


    }
}
