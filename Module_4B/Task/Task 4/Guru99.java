package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Guru99 {
    public static void main(String[] args)  {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\msedgedriver.exe");

        System.out.println("webdriver.edge.driver");
        //launch browser
        WebDriver driver = new EdgeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate url
        driver.get("http://demo.guru99.com/");
        //Thread.sleep(5000);
        driver.findElement(By.name("emailid")). sendKeys("look@yahoo.com");
        driver.findElement(By.name("btnLogin")).click();

        driver.findElement(By.linkText("<a href=\"http://demo.guru99.com/Security/SEC_V1/index.php\">Security Project</a>"));
        driver.findElement(By.id("message23")).sendKeys("mngr528743");
        driver.findElement(By.id("message18")).sendKeys("zEnUtyd");
        driver.findElement(By.name("bitLogin")).click();








    }
}
