package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Pay_Out_Transaction {
	
	WebDriver driver ; 
	CommonMethods common;
	
	public Pay_Out_Transaction(WebDriver driver)
	{
		this.driver=driver;
		common = new CommonMethods(driver);
	}
	
	By payoutTransactionsHeaderText = By.xpath("//span[contains(text(),'Pay-Out Transaction')]");
	
	public String fetchPayoutHeaderText()
	{
		return common.getText(payoutTransactionsHeaderText);
		
	}

}
