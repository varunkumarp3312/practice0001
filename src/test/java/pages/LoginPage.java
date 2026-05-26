package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtility;

public class LoginPage {
	
	 WebDriver driver;
	By username = By.cssSelector("input[placeholder='Enter Email Address']");
	By password =  By.cssSelector("input[placeholder='Enter Password']");
	By loginbutton = By.xpath("//button[@class='login-button']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterusername(String userName)
	{
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(userName);
	}
	
	public void  enterpassword(String passWord)
	{
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(passWord);
	}
	
	public void clickloginbutton()
	{
		driver.findElement(loginbutton).click();
		
		System.out.println("log in button clicked successfully");
	}
	
	By errorMessage = By.id("notistack-snackbar");
	
	public String getErrorMessage (){
		
		WaitUtility.waitforelement(driver, errorMessage);
		return driver.findElement(errorMessage).getText();
	}
	
}
