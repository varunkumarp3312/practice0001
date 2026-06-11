package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Change_Password_Page {
	
	WebDriver driver ;
	CommonMethods common;
	public Change_Password_Page(WebDriver driver)
	{
		this.driver = driver;
		common = new CommonMethods(driver);
		
	}
	
	By changePasswordPageHeaderText = By.xpath("//span[@class='topic' and text()='Change Password']");
	
	public String fetchchangePasswordPageHeaderText()
	{
		return common.getText(changePasswordPageHeaderText);
	}

}
