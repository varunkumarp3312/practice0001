package stepDefinitions;


import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Client_Page;
import pages.DashboardPage;
import pages.Pay_In_Transaction;
import utils.BaseClass;

public class DashboardSteps {

	DashboardPage dashboard;
	Client_Page client;
	Pay_In_Transaction payin;
	
	
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
		  dashboard = new DashboardPage(BaseClass.driver);
		    dashboard.clickDailyMeta();
	  }
	  @Then("daily updated data should display")
	  
	public void  user_Fetch_daily_volume()
	  {
		  dashboard = new DashboardPage(BaseClass.driver);

		    String dailyValue = dashboard.fetchDailyVolume();

		    Assert.assertNotNull(dailyValue);

		    System.out.println("Daily volume value is : " + dailyValue);
	  }
	  
	  @When("user clicks this week volume button")
	  public void user_clicks_week_meta_button() {
		  dashboard = new DashboardPage(BaseClass.driver);
		    dashboard.clickWeekMeta();
	  }
	  
	  @Then("client selection card should display before displaying the week data")
	  public void client_selection_card_should_display_before_displaying_the_week_data() {
		  dashboard = new DashboardPage(BaseClass.driver);
		String weekClienttext = dashboard.fetchWeekClientselectiontext();
		System.out.println("the popup client text is :"+weekClienttext);
		
		Assert.assertTrue("Client Selection popup is not displayed",
				weekClienttext.contains("Select a Client"));
		System.out.println("the client text fetched successfully");
		
		
		  		  
	  }
	  
	  @And("deselect the selected client")
	  public void deselect_the_selected_client()
	  {
		  dashboard = new DashboardPage(BaseClass.driver);
		  dashboard.clickdeselectTheClientButton();
	  }
	  
	  
	  @And("user closes client selection popup")
	 public void user_closes_client_selection_popup()
	  {
		  dashboard =new  DashboardPage(BaseClass.driver);
		  dashboard.close_client_selection_page();
		  
	  }
	  
	  
	  
	 @And("user select the particular client")
	 public void user_select_the_particular_client() 
	 {
		dashboard = new DashboardPage(BaseClass.driver);
	dashboard.select_perticular_client();
	
	 }
	  
	@ Then("the client Weekly data should display")
	public void the_client_Weekly_data_should_display()
	{
		 dashboard = new DashboardPage(BaseClass.driver);
			String thisWeekMetaValue= dashboard.thisWeekMetaFetch();
			 System.out.println(thisWeekMetaValue);
			 Assert.assertNotNull(thisWeekMetaValue);		 
	}
		 	  
	 @When("user clicks this month volume button") 
	 public void user_clicks_this_month_volume_button()
	 {
		 dashboard = new DashboardPage(BaseClass.driver);
		 dashboard.clicMonthMeta();
	 }
	 @Then("client selection card should display before displaying the month data")
	 public void client_selection_card_should_display_before_displaying_the_month_data()
	 {
		 dashboard = new DashboardPage(BaseClass.driver);
		 String monthClienttext =dashboard.fetchMonthClientselectiontext();
		 System.out.println(monthClienttext);
		 Assert.assertTrue("Client Selection popup is not displayed",
				 monthClienttext.contains("Select a Client"));
		
		 
	 }
	 
	 @Then("the client month data should display")
	public void the_client_month_data_should_display()
	 {
		 dashboard = new DashboardPage(BaseClass.driver);
		 String thisMonthMetaValue=dashboard.thisMonthMetaFetch();
		 System.out.println(thisMonthMetaValue);
		 Assert.assertNotNull(thisMonthMetaValue);
		 
	 }
	 
	 @When("user clicks on date range selection button")
	public void user_clicks_on_date_range_selection_button()
	 {
		 dashboard = new DashboardPage(BaseClass.driver);
		 dashboard.clickcustomDateRangeMeta();
		 
	 
	 }
	 @And("user select the particular client in customdate range")
	   public void user_select_the_particular_client_inDateRange() throws InterruptedException
	   {
		 dashboard = new DashboardPage(BaseClass.driver);
		 dashboard.clientselectDropDown();
	   }
	 
	 @And("user select the particular provider")
	public void  user_select_the_particular_provider()
	 {
		 dashboard = new DashboardPage(BaseClass.driver);
		 dashboard.providersselectDropdown();
		 
	 }
	 
	 @And("select From date")
	 public void select_From_and_To_date()
	 {
		 dashboard = new DashboardPage(BaseClass.driver);
		 dashboard.enterFromDate();
	 }
	 
	 @And("select To date")
	 public void select_To_date()
	 {
		 dashboard = new DashboardPage(BaseClass.driver);
		 dashboard.enterToDate();
	 }
	 @And("click on the apply button")
	 public void click_on_the_apply_button()
	 {
		 dashboard = new DashboardPage(BaseClass.driver);
		 dashboard.clickApplyButtonInCustomMeta();
				 
	 }
	 @Then("The particular clients data should be display with the selected date")
	 public void The_particular_clients_data_should_be_display_with_the_selected_date()
	 {
		 dashboard =new DashboardPage(BaseClass.driver);
		String custommetadaterangevalue=dashboard.fetchCustomDateMetaValue();
		System.out.println(custommetadaterangevalue);
		Assert.assertNotNull(custommetadaterangevalue);
		 
	 }
	 
	 @When("user navigates to {string}")
	 public void user_navigates_to(String Menu)
	 {
		 if(Menu.equalsIgnoreCase("client")) {
			 dashboard =new DashboardPage(BaseClass.driver);
			 dashboard.clickClientPage();
		 }
		 else if(Menu.equalsIgnoreCase("Transactions"))
		 {
			 dashboard = new DashboardPage(BaseClass.driver);
			 dashboard.clickPayinTransactionsPage();
		 }
		 
	 }
	 
	 @Then("{string} page should be displayed")
	 public void page_should_be_displayed(String Menu)
	 {
		 if(Menu.equalsIgnoreCase("client"))
		 {
			 client = new Client_Page(BaseClass.driver);
			 String headerText = client.fetchClientPageHeaderText();
			 System.out.println("client Page Header text is :"+headerText);
			 Assert.assertEquals("Client", headerText);
		 }
		 else if(Menu.equalsIgnoreCase("Transactions"))
		 {
			 payin = new Pay_In_Transaction(BaseClass.driver);
			 String payinheader = payin.fetchPayinHeaderText();
			 System.out.println("payin page header text is :"+payinheader);
			 Assert.assertTrue(payinheader.contains("Pay-In"));
		 }
		 
	 }
	 
	 
	 
}
