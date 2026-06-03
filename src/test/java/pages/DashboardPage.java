package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class DashboardPage {
	
	 WebDriver driver ; 
	CommonMethods common;
	 
	
	By dashboardText = By.xpath("//span[text()='Dashboard']");
	
	public  DashboardPage(WebDriver driver) {
		
		this.driver=driver;
		common =new CommonMethods(driver);
	}
	public String getDashboardText()
	{
       return common.getText(dashboardText);
	}
	
	

}


