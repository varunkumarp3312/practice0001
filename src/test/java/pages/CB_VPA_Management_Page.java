package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class CB_VPA_Management_Page {
	
	WebDriver driver ;
	CommonMethods common;
	public CB_VPA_Management_Page(WebDriver driver)
	{
		this.driver = driver;
		common = new CommonMethods(driver);
		
	}
	
	By cBVPAManagementPageHeaderText = By.xpath("//span[@class='topic' and text()='CB VPA Management']");
	
	public String fetchCbVPAPageHeaderText()
	{
		return common.getText(cBVPAManagementPageHeaderText);
	}
	
	

}
