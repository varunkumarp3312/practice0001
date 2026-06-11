package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Reports_Page {
	
	WebDriver driver ;
	CommonMethods common;
	public Reports_Page(WebDriver driver)
	{
		this.driver = driver;
		common = new CommonMethods(driver);
		
	}
	
	By ReportsPagePageHeaderText = By.xpath("//span[@class='topic' and text()='Reports']");
	
	public String fetchReportsPageHeaderText()
	{
		return common.getText(ReportsPagePageHeaderText);
	}

}
