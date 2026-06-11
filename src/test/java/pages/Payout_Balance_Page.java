package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Payout_Balance_Page {
	WebDriver driver ; 
	CommonMethods common;
	
	public Payout_Balance_Page(WebDriver driver)
	{
		this.driver=driver;
		common = new CommonMethods(driver);
	}
	
	By payoutBalancePageHeaderText = By.xpath("//span[@class='topic' and text()='Payout Balance']");
	
	public String fetchPayoutHeaderText()
	{
		return common.getText(payoutBalancePageHeaderText);
	}
}

