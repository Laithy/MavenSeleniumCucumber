import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageWebElements {

    public WebElement UsernameElement (WebDriver driver){
        return driver.findElement(By.name("username"));
    }

    public WebElement PasswordElement (WebDriver driver){
        return driver.findElement(By.name("password"));
    }

    public WebElement LoginButtonElement (WebDriver driver){
        return driver.findElement(By.cssSelector("i[class=\"fa fa-2x fa-sign-in\"]"));
    }

}
