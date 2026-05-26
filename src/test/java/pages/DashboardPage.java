package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	 WebDriver driver ; 
	
	By dashboardText = By.xpath("//span[text()='Dashboard']");
	
	public  DashboardPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public String getDashboardText()
	{
        return driver.findElement(dashboardText).getText();
	}
	
	

}


