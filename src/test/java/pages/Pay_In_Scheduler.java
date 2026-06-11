package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Pay_In_Scheduler {
	WebDriver driver ;
	CommonMethods common;
	public Pay_In_Scheduler(WebDriver driver)
	{
		this.driver = driver;
		common = new CommonMethods(driver);
		
	}
	
	By payinSchedulerPageHeaderText = By.xpath("//span[@class='topic' and text()='Pay-In Scheduler']");
	
	public String fetchPayinSchedulerPageHeaderText()
	{
		return common.getText(payinSchedulerPageHeaderText);
	}


}
