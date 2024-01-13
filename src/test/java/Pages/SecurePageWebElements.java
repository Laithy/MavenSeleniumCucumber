package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecurePageWebElements {

    WebDriver driver;

    //Constructor
    public SecurePageWebElements (WebDriver MainDriver){
        this.driver = MainDriver;
    }

    public WebElement flashMsg (){
        return driver.findElement(By.cssSelector("div[id=flash]"));
    }

    public WebElement logoutButton (){
        return driver.findElement(By.cssSelector("a[href=\"/logout\"]"));
    }
}
