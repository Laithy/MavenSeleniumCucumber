package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageWebElements {

    WebDriver driver;

    //Constructor
    public LoginPageWebElements (WebDriver mainDriver){
        mainDriver = this.driver;
    }

    //Username Locator
    public WebElement username () {
        return driver.findElement(By.cssSelector("input[id=username]"));
    }

    //Password Locator
    public WebElement password (){
        return driver.findElement(By.cssSelector("input[id=password]"));
    }

    //Login button Locator
    public WebElement loginButton (){
        return driver.findElement(By.cssSelector("button[class=radius]"));
    }

}
