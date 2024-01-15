package stepDefinition;

import Pages.LoginPageWebElements;
import Pages.SecurePageWebElements;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {

    WebDriver driver = null;
    LoginPageWebElements LpElements;
    SecurePageWebElements SpElements;

    @Given("User opens the browser")
    public void User_Opens_The_Browser () throws InterruptedException {
        //Creating Driver
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        LpElements = new LoginPageWebElements(driver);
        SpElements = new SecurePageWebElements(driver);

    }
    @And("User navigates to login page")
    public void User_Navigates_To_The_Login_Page () throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        Thread.sleep(1000);
    }
    @When("^User enters username \"(.*)\"$")
    public void User_Enters_Username (String username) throws InterruptedException {

        LpElements.username().clear();
        LpElements.username().sendKeys(username);
        Thread.sleep(1000);

    }
    @And("^Enters password \"(.*)\"$")
    public void Enters_Password (String password) throws InterruptedException {

        LpElements.password().clear();
        LpElements.password().sendKeys(password);
        Thread.sleep(1000);

    }
    @And("Press login")
    public void Press_Login () throws InterruptedException {
        LpElements.loginButton().click();
        Thread.sleep(1000);
    }
    @Then("Success message appears")
    public void Success_Message_Appears () throws InterruptedException {
        System.out.println(SpElements.flashMsg().getText());
        String actualMsg = SpElements.flashMsg().getText();
        Assert.assertTrue(actualMsg.contains("You logged into a secure area"));
        Thread.sleep(1000);
    }
    @Then("Failure message appears")
    public void Failure_Message_Appears () throws InterruptedException {
        System.out.println(SpElements.flashMsg().getText());
        String actualMsg = SpElements.flashMsg().getText();
        Assert.assertTrue(actualMsg.contains("is invalid!"));
        Thread.sleep(1000);
    }
    @And("Press Logout")
    public void Press_Logout() throws InterruptedException {
        SpElements.logoutButton().click();
        Thread.sleep(1000);
    }
    @After
    public void Close_driver () throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
