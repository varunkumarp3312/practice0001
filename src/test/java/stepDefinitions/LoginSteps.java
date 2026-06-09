//package stepDefinitions;
//
//import org.junit.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.DashboardPage;
//import pages.LoginPage;
//import utils.BaseClass;
//
//public class LoginSteps {
//	
//    LoginPage login;
//
//    @Given("user opens login page")
//    public void user_opens_login_page() {
//
//        login = new LoginPage(BaseClass.driver);
//
//        System.out.println("Login page opened");
//    }
//
//    
//    @When("user enters username {string}")
//   public void user_Enters_Username(String username)
//    {
//    	login.enterUsername(username);
//        System.out.println("Username entered : " + username);
//
//    }
//    @When("user enters password {string}")
//   public void user_enters_password(String password)
//    {
//    	login.enterPassword(password);
//    }
//    
//    @When("user clicks login")
//    public void user_click_login() {
//    	login.clickLoginButton();
//    	System.out.println("login button clicked");
//    }
//    @Then("user validates login result {string}")
//    public void user_validates_login_result(String expectedresult)
//    {
//    	if(expectedresult.equalsIgnoreCase("valid"))
//    	{
//    		DashboardPage dashboard = new DashboardPage(BaseClass.driver);
//    		String actualText = dashboard.getDashboardText();
//    		Assert.assertEquals("Dashboard", actualText);
//    		System.out.println("Valid login verified");
//    	}
//    	else
//    	{
//    		
//			String actualUrl = BaseClass.driver.getCurrentUrl();
//			 Assert.assertTrue(actualUrl.contains("login"));
////
//		        System.out.println("Invalid login verified");
////		        String actualloginmessage = login.getErrorMessage();
////		        System.out.println("the login page error message is :" + actualloginmessage );
////		    	Assert.assertEquals("Credentials are wrong!", actualloginmessage);
//
//    	}
//    }
//
//       
//}



package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
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

    @When("user enters username {string}")
    public void user_enters_username_from_config(String usernameKey) {

        String username = ConfigReader.getProperty(usernameKey);

        login.enterUsername(username);

        System.out.println("Username entered using key : " + usernameKey);
    }

    @When("user enters password {string}")
    public void user_enters_password_from_config(String passwordKey) {

        String password = ConfigReader.getProperty(passwordKey);

        login.enterPassword(password);

        System.out.println("Password entered using key : " + passwordKey);
    }

    @When("user clicks login")
    public void user_click_login() {

        login.clickLoginButton();

        System.out.println("login button clicked");
    }

    @Then("user validates login result {string}")
    public void user_validates_login_result(String expectedResult) {

        if (expectedResult.equalsIgnoreCase("valid")) {

            DashboardPage dashboard = new DashboardPage(BaseClass.driver);

            String actualText = dashboard.getDashboardText();

            Assert.assertEquals("Dashboard", actualText);

            System.out.println("Valid login verified");

        } else {

            String actualUrl = BaseClass.driver.getCurrentUrl();

            Assert.assertTrue(actualUrl.contains("login"));

            System.out.println("Invalid login verified");
        }
    }
}