package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utils.BaseClass;
import utils.ConfigReader;

public class LoginSteps {
	
    LoginPage login;

    @Given("user opens login page")
    public void user_opens_login_page() {

        login = new LoginPage(BaseClass.driver);

        System.out.println("Login page opened");
    }

    @When("user enters username")
    public void user_enters_username() {

        login.enterusername(
                ConfigReader.getProperty("username"));

        System.out.println("Username entered");
    }

    @When("user enters password")
    public void user_enters_password() {

        login.enterpassword(
                ConfigReader.getProperty("password"));

        System.out.println("Password entered");
    }

    @When("user clicks login")
    public void user_clicks_login() {

        login.clickloginbutton();

        System.out.println("Login clicked");
    }
    
    
    @When("user enters invalid username")
    public void user_eneters_invalid_username()
    {
    	login.enterusername(ConfigReader.getProperty("invalidUsername") );
    	System.out.println("invalid username enetered");
    }
    
    @When("user enters invalid password")
    public void user_enters_invalid_password()
    {
    	login.enterpassword(ConfigReader.getProperty("invalidPassword"));
    	System.out.println("invalid password eneterd");
    }
    
    
    
    @Then("login error message should display")
    public void login_Error_Message_should_Display()
    {
    	String actualloginmessage = login.getErrorMessage();
    	
    	System.out.println("the login page error message is :" + actualloginmessage );
    	Assert.assertEquals("Credentials are wrong!", actualloginmessage);
    }
}