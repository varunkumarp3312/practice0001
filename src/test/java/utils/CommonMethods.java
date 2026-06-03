package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

	WebDriver driver;
	
	public CommonMethods(WebDriver driver){
		this.driver=driver;
	}
	
	public void enterText(By locators , String text){
		
		WaitUtility.waitforelement(driver, locators);
		
		driver.findElement(locators).clear();
		
		driver.findElement(locators).sendKeys(text);
		
	}
	
	public void click(By locator)
	{
		WaitUtility.waitforelement(driver, locator);
		driver.findElement(locator).click();
		
	}
	
	public String getText(By locator)
	{
		WaitUtility.waitforelement(driver, locator);
		return driver.findElement(locator).getText();
	}
	
	
	public String gettittle()
	{
		return driver.getTitle();
	}
	
	public String getcurrenturl(By locator)
	{
		return driver.getCurrentUrl();
	}
	
	
}
