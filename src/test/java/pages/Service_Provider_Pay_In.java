package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Service_Provider_Pay_In {
	
	WebDriver driver;
	CommonMethods common;
	
	By spPayinPageHeaderText = By.xpath("//span[@class='topic' and text()='Service Provider Pay-In']");
	
	public Service_Provider_Pay_In(WebDriver driver) {
		this.driver = driver;
		common = new CommonMethods(driver);
	}

	public String fetchSpPayinPageHeaderText()
	{
		return common.getText(spPayinPageHeaderText);
	}

}
