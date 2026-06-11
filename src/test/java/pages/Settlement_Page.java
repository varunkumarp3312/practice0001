package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Settlement_Page {
	
	WebDriver driver ;
	CommonMethods common;
	public Settlement_Page(WebDriver driver)
	{
		this.driver = driver;
		common = new CommonMethods(driver);
		
	}
	
	By settelementPageHeaderText = By.xpath("//span[@class='topic' and text()='Settlement']");
	
	public String settlementPageHeaderText()
	{
		return common.getText(settelementPageHeaderText);
	}

}
