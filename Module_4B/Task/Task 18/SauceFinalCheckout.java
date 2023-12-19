package org.example.Tasks.Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task18FinalCheckout {
    WebDriver Fdriver=null;

    public Task18FinalCheckout(WebDriver driver){
        Fdriver = driver;
        PageFactory.initElements(Fdriver, this);

    }


    @FindBy(css = "#item_3_title_link")
    private WebElement checkoutele1;
    public WebElement  getCheckoutele1(){
        return checkoutele1;

    }

    @FindBy(xpath = "//a[(@id='item_0_title_link')]")
    private WebElement checkoutele2;
    public WebElement getCheckoutele2(){
        return checkoutele2;

    }


    @FindBy(xpath = "//a[@id='item_4_title_link']")
    private WebElement checkoutele3;
    public WebElement  getCheckoutele3(){
        return checkoutele3;

    }
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement checkoutfinish;
    public WebElement  getCheckoutfinish(){
        return checkoutfinish;

    }

    @FindBy(xpath = "//a[(@id='item_0_title_link')]")
    private WebElement checkCart;
    public WebElement  getCheckCart(){
        return checkCart;

    }

    @FindBy(xpath = "//a[@id='item_3_title_link']")
    private WebElement checkTshirt;
    public WebElement  getCheckTshirt(){
        return checkTshirt;

    }

}
