package org.TestNGWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCart {
    WebDriver Sdriver=null;

    public SauceCart(WebDriver driver){
        Sdriver = driver;
        PageFactory.initElements(Sdriver, this);

    }
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement backpack;
    public WebElement  getBackpack(){
        return backpack;

    }
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement bike;
    public WebElement  getBike(){
        return bike;

    }

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement Tshirt ;
    public WebElement  getTshirt(){
        return Tshirt;

    }

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    private WebElement cart;
    public WebElement  getCart(){
        return cart;

    }

    @FindBy(xpath = "//a[(@id='item_0_title_link')]")
    private WebElement checkBike;
    public WebElement  getCheckBike(){
        return checkBike;

    }

    @FindBy(xpath = "//a[@id='item_3_title_link']")
    private WebElement checkTshirt;
    public WebElement  getCheckTshirt(){
        return checkTshirt;

    }

    @FindBy(xpath = "//a[@id='item_4_title_link']")
    private WebElement checkBackpack;
    public WebElement  getCheckBackpack(){
        return checkBackpack;

    }


}
