package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Service_Provider_Pay_Out {
	
	WebDriver driver;
	CommonMethods common;
	
	By spPayoutPageHeaderText = By.xpath("//span[@class='topic' and text()='Service Provider Pay-Out']");
	
	public Service_Provider_Pay_Out(WebDriver driver) {
		this.driver = driver;
		common = new CommonMethods(driver);
	}

	public String fetchsppayoutHeaderText()
	{
		return common.getText(spPayoutPageHeaderText);
	}

}
