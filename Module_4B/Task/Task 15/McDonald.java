package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class McDonald {
    WebDriver driver = null;
    @BeforeClass
    public void Searchgoogle() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Mr. Simoen\\Desktop\\TestNGSelenium\\SeleniumWebTest\\src\\test\\java\\org\\example\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void NavigateGoogle() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
    }
    @Test
    public void SearchForTestify() throws InterruptedException {
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify limited");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]")).click();
        Thread.sleep(5000);
        driver.manage().window().minimize();
        System.out.println("Testify limited");
        driver.quit();

    }
    @Test
    public void GotoGoogle() throws InterruptedException {
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        Thread.sleep(5000);
        //colour code
        String color_code = driver.findElement(By.cssSelector("#button-ordernow")).getCssValue("color");
        System.out.println(color_code);




    }
}
