package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Mr. Simoen\\Desktop\\SeleniumWebTest\\SeleleniumWebTest\\src\\msedgedriver.exe");

        //launch browser
        WebDriver driver = new EdgeDriver();

        //maximize browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://web.facebook.com/");

    }
}
