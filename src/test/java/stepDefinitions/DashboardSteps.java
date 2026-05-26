package stepDefinitions;


import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DashboardPage;
import utils.BaseClass;

public class DashboardSteps {

	DashboardPage dashboard;
	
	@Then("dashboard should display")
	public void dashboard_should_display()
	{
		dashboard = new DashboardPage(BaseClass.driver);
		
		String actualText = dashboard.getDashboardText();
		
		System.out.println("the dashboard text which is fetched is :" + actualText);
		Assert.assertEquals("Dashboard", actualText);		
		
	}
	
}
