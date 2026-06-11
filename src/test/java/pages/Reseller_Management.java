package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Reseller_Management {
	
	WebDriver driver ;
	CommonMethods common;
	public Reseller_Management(WebDriver driver)
	{
		this.driver = driver;
		common = new CommonMethods(driver);
		
	}
	
	By resellerPageHeaderText = By.xpath("//span[@class='topic' and text()='Reseller Management']");
	
	public String fetchResellerManagementHeaderText()
	{
		return common.getText(resellerPageHeaderText);
	}

}
