package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Pay_Out_Scheduler {

	
	WebDriver driver ;
	CommonMethods common;
	public Pay_Out_Scheduler(WebDriver driver)
	{
		this.driver = driver;
		common = new CommonMethods(driver);
		
	}
	
	By payoutSchedulerPageHeaderText = By.xpath("//span[@class='topic' and text()='Pay-Out Scheduler']");
	
	public String fetchPayoutSchedulerPageHeaderText()
	{
		return common.getText(payoutSchedulerPageHeaderText);
	}

	
}
