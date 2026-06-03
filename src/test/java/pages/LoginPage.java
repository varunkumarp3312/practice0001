package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class LoginPage {
	
	 WebDriver driver;
	 CommonMethods common;
	By username = By.cssSelector("input[placeholder='Enter Email Address']");
	By password =  By.cssSelector("input[placeholder='Enter Password']");
	By loginbutton = By.xpath("//button[@class='login-button']");
	By errorMessage = By.id("notistack-snackbar");

	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		 common=new CommonMethods(driver);
	}
	
	public void enterUsername(String userName)
	{
		common.enterText(username, userName);
	}
	
	public void  enterPassword(String passWord)
	{
		common.enterText(password, passWord);
	}
	
	public void clickLoginButton()
	{
		common.click(loginbutton);
		
		System.out.println("log in button clicked successfully");
	}
	
	
	public String getErrorMessage (){
		
		return common.getText(errorMessage);
	}
	
	public String getcurrenturl()
	{
	return common.getcurrenturl(errorMessage);
	
	}
	
}
