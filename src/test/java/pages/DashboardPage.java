package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class DashboardPage {
	
	 WebDriver driver ; 
	CommonMethods common;
	 
	
	By dashboardText = By.xpath("//span[text()='Dashboard']");
	 By dailyVolumeValue = By.xpath(
			"//div[text()='Today']/ancestor::div[contains(@class,'stats-card')]//div[contains(@class,'stats-value')]"
			);
	By dailyvolume = By.xpath("/html/body/div/div/div[3]/div/div/div[2]/div[2]/div[4]/div[2]");
	
	public  DashboardPage(WebDriver driver) {
		
		this.driver=driver;
		common =new CommonMethods(driver);
	}
	public String getDashboardText()
	{
       return common.getText(dashboardText);
	}
	
	public void clickDailyMeta()
	{
		common.click(dailyVolumeValue);
		
		System.out.println("daily meta button is clicked");
		
	}
	public String fetchDailyVolume()
	{
		String value = common.getText(dailyvolume);
		System.out.println("daily volume is fetched succeffully : "+dailyvolume);
		return value;
	}

}


