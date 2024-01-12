package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
    @Given("User opens the browser")
    public void User_Opens_The_Browser (){
        System.out.println("1");
    }
    @And("User navigates to login page")
    public void User_Navigates_To_The_Login_Page (){
        System.out.println("2");
    }
    @When("User enters correct username")
    public void User_Enters_Correct_Username (){
        System.out.println("3");
    }
    @And("correct password")
    public void Correct_Password (){
        System.out.println("4");
    }
    @Then("Success message appears")
    public void Success_Message_Appears (){
        System.out.println("5");
    }
}
