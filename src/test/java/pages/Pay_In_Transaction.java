package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Pay_In_Transaction {
	
	WebDriver driver ; 
	CommonMethods common;
	
	public Pay_In_Transaction(WebDriver driver)
	{
		this.driver=driver;
		common = new CommonMethods(driver);
	}
	
	By payinTransactionsHeaderText = By.xpath("//span[contains(text(),'Pay-In Transaction')]");
	
	public String fetchPayinHeaderText()
	{
		return common.getText(payinTransactionsHeaderText);
	}

}
