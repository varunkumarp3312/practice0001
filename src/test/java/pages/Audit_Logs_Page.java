package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Audit_Logs_Page {
	
	WebDriver driver ;
	CommonMethods common;
	public Audit_Logs_Page(WebDriver driver)
	{
		this.driver = driver;
		common = new CommonMethods(driver);
		
	}
	
	By auditLogPageHeaderText = By.xpath("//span[@class='topic' and text()='Audit Logs']");
	
	public String fetchAuditLogsPageHeaderText()
	{
		return common.getText(auditLogPageHeaderText);
	}

}
