package stepDefinition;

import Pages.LoginPageWebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {

    WebDriver driver = null;
    LoginPageWebElements elements = new LoginPageWebElements(driver);

    @Given("User opens the browser")
    public void User_Opens_The_Browser () throws InterruptedException {

        //Creating Driver
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        Thread.sleep(1000);

    }
    @And("User navigates to login page")
    public void User_Navigates_To_The_Login_Page () throws InterruptedException {

        driver.navigate().to("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }
    @When("User enters correct username")
    public void User_Enters_Correct_Username () throws InterruptedException {

        elements.username().clear();
        elements.username().sendKeys("tomsmith");
        Thread.sleep(1000);

    }
    @And("Correct password")
    public void Correct_Password () throws InterruptedException {

        elements.password().clear();
        elements.password().sendKeys("SuperSecretPassword!");
        Thread.sleep(1000);

    }
    @And("Press login")
    public void Press_Login () throws InterruptedException {
        elements.loginButton().click();
        Thread.sleep(1000);
    }
    @Then("Success message appears")
    public void Success_Message_Appears () throws InterruptedException {

        System.out.println(driver.findElement(By.id("flash")).getText());
        Thread.sleep(1000);

    }
}
