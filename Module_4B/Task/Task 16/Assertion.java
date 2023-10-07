package testNgExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
    WebDriver driver;
    @BeforeClass
    public void setDriver(){
        System.setProperty("webdriver.edge.driver","C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\msedgedriver.exe");
        //launch browser
        driver = new EdgeDriver();
        //maximize browser
        driver.manage().window().maximize();
        driver.get("https://testifyltd.com/");
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeAsyncScript("window.scrollBy(0, 5500)");

    }
    @Test

    public void phoneNumber(){
        WebElement actualPhoneNumber = driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/div[1]/div[1]/div/p"));
        String expectedPhonenumber = "(+234)904-882-0971";
        Assert.assertEquals(actualPhoneNumber, expectedPhonenumber);
        System.out.println("Assertion Passed");




    }
    public void Location(){
        WebElement ActuaLocation = driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/div[2]/div[1]/p"));
        String expectedLocation = "Nigeria";
        Assert.assertEquals(expectedLocation,ActuaLocation);
        System.out.println("Assertion Passed");

    }
    public void Email(){
        WebElement actualEmail =driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/div[1]/div[1]/div/p"));
        String expectedEmail = "info@testifyltd.co.uk";
        Assert.assertEquals(actualEmail, expectedEmail);
        System.out.println("Assertion Passed");

    }




}
