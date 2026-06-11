package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Developers_Page{
	
	WebDriver driver;
	CommonMethods common;
	
	By developerPageHeaderText = By.xpath("//span[@class='topic' and text()='Developers']");
	
	public Developers_Page(WebDriver driver) {
		this.driver = driver;
		common = new CommonMethods(driver);
	}

	public String fetchDeveloperHeaderText()
	{
		return common.getText(developerPageHeaderText);
	}

}
