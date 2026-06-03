package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
	
	  @When("user clicks daily volume button")
	  public void user_click_daily_meta()
	  {
		  dashboard.clickDailyMeta();
	}
	  @Then("daily updated data should display based on meta filter")
	  
	public void  user_Fetch_daily_volume()
	  {
		  dashboard = new DashboardPage(BaseClass.driver);

		    String dailyValue = dashboard.fetchDailyVolume();

		    Assert.assertNotNull(dailyValue);

		    System.out.println("Daily volume value is : " + dailyValue);
	  }
}
