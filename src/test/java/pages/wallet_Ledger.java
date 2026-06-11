package pages;

import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class wallet_Ledger {
	
	WebDriver driver ; 
	CommonMethods common;
	
	public wallet_Ledger(WebDriver driver)
	{
		this.driver=driver;
		common = new CommonMethods(driver);
	}
	
	

}
