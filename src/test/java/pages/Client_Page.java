package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Client_Page {
	
	WebDriver driver ; 
	public Client_Page(WebDriver driver)
	{
		this.driver=driver;
		common = new CommonMethods(driver);
	}
	CommonMethods common;
	By clientPageHeaderText = By.xpath("//span[@class='topic']");

	
	public String fetchClientPageHeaderText()
	{
		return common.getText(clientPageHeaderText);
	}

}
