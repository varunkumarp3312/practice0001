package stepDefinitions;


import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Audit_Logs_Page;
import pages.CB_VPA_Management_Page;
import pages.Change_Password_Page;
import pages.Client_Page;
import pages.DashboardPage;
import pages.Developers_Page;
import pages.Pay_In_Scheduler;
import pages.Pay_In_Transaction;
import pages.Pay_Out_Scheduler;
import pages.Pay_Out_Transaction;
import pages.Payout_Balance_Page;
import pages.Reports_Page;
import pages.Reseller_Management;
import pages.Service_Provider_Pay_In;
import pages.Service_Provider_Pay_Out;
import pages.Settlement_Page;
import utils.BaseClass;

public class DashboardSteps {

	DashboardPage dashboard;
	Client_Page client;
	Pay_In_Transaction payin;
	Pay_Out_Transaction payout;
	Developers_Page developers;
	Service_Provider_Pay_In sppayin;
	Service_Provider_Pay_Out sppayout;
	Payout_Balance_Page payoutbalance;
	Settlement_Page settlemet;
	Change_Password_Page changepassword;
	Reseller_Management reseller;
	Pay_In_Scheduler payinscheduler;
	Pay_Out_Scheduler payoutscheduler;
	CB_VPA_Management_Page cbvpamanagement;
	Reports_Page reports;
	Audit_Logs_Page auditpage;
	
	
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
		 dashboard =new DashboardPage(BaseClass.driver);
//		 if(Menu.equalsIgnoreCase("client")) {
////			 dashboard =new DashboardPage(BaseClass.driver);
//			 dashboard.clickClientPage();
//		 }
//		 else if(Menu.equalsIgnoreCase("Payin-Transactions"))
//		 {
////			 dashboard = new DashboardPage(BaseClass.driver);
//			 dashboard.clickPayinTransactionsPage();
//		 }
//		 else if(Menu.equalsIgnoreCase("Payout-Transactions"))
//		 {
////			 dashboard=new DashboardPage(BaseClass.driver);
//			 dashboard.clickPayinTransactionsPage();
//			 dashboard.clickPayoutPage();
//		 }
//		 
//		 else if (Menu.equalsIgnoreCase("Developers"))
//		 {
////			 dashboard = new DashboardPage(BaseClass.driver);
//			 dashboard.clickDeveloperPage();
//		 }
//		 else if (Menu.equalsIgnoreCase(""))
//		 {
////			 dashboard = new DashboardPage(BaseClass.driver);
//			 dashboard.clickDeveloperPage();
//		 }
		 
		 if(Menu.equalsIgnoreCase("Client")) {
		        dashboard.clickClientPage();
		    }
		    else if(Menu.equalsIgnoreCase("Payin-Transactions")) {
		        dashboard.clickPayinTransactionsPage();
		    }
		    else if(Menu.equalsIgnoreCase("Payout-Transactions")) {
		        dashboard.clickPayinTransactionsPage();
		        dashboard.clickPayoutPage();
		    }
		    else if(Menu.equalsIgnoreCase("Developers")) {
		        dashboard.clickDeveloperPage();
		    }
		    else if(Menu.equalsIgnoreCase("SP Pay-In")) {
		        dashboard.clickServicePayinPage();
		    }
		    else if(Menu.equalsIgnoreCase("SP Pay-Out")) {
		        dashboard.clickservicePayoutPage();
		    }
		   
		    else if(Menu.equalsIgnoreCase("Payout Balance")) {
		        dashboard.clickPayoutBalancePage();
		    }
		    else if(Menu.equalsIgnoreCase("Settlement")) {
		        dashboard.clickSettlementPage();
		    }
		    else if(Menu.equalsIgnoreCase("Change Password")) {
		        dashboard.changePasswordPage();
		    }
		    else if(Menu.equalsIgnoreCase("Reseller")) {
		        dashboard.clickResllerPage();
		    }
		    else if(Menu.equalsIgnoreCase("Payin Scheduler")) {
		        dashboard.clickPayinSchedulerPage();
		    }
		    else if(Menu.equalsIgnoreCase("Payout Scheduler")) {
		        dashboard.clickPayoutSchedulerPage();
		    }
		    else if(Menu.equalsIgnoreCase("CB-VPA")) {
		        dashboard.clickCBVpaManagementPage();
		    }
		    else if(Menu.equalsIgnoreCase("Reports")) {
		        dashboard.clickReportsPage();
		    }
		    else if(Menu.equalsIgnoreCase("Audit Logs")) {
		        dashboard.clickAuditPagePage();
		    }
		    else {
		        Assert.fail("Invalid menu name passed from feature file: " + Menu);
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
		 else if(Menu.equalsIgnoreCase("Payin-Transactions"))
		 {
			 payin = new Pay_In_Transaction(BaseClass.driver);
			 
			 String payinheader = payin.fetchPayinHeaderText();
			 System.out.println("payin page header text is :"+payinheader);
			 Assert.assertTrue(payinheader.contains("Pay-In"));
			
		 }
		 
		 else if (Menu.equalsIgnoreCase("Payout-Transactions"))
		 {
			 payout = new Pay_Out_Transaction(BaseClass.driver);
			 String payoutheadertext = payout.fetchPayoutHeaderText();
			 System.out.println(payoutheadertext);
			 Assert.assertTrue(payoutheadertext.contains("Pay-Out"));
		 }
		 else if (Menu.equalsIgnoreCase("Developers"))
		 {
			 developers = new Developers_Page(BaseClass.driver);
			 String developersHeaderText  = developers.fetchDeveloperHeaderText();
			 System.out.println(developersHeaderText);
			 Assert.assertTrue(developersHeaderText.contains("Developers"));
			 
		 }
		 
		 
		 else if (Menu.equalsIgnoreCase("SP Pay-In"))
		 {
			 sppayin=  new Service_Provider_Pay_In(BaseClass.driver);
			 String sppayinpageHeaderText  = sppayin.fetchSpPayinPageHeaderText();
			 System.out.println(sppayinpageHeaderText);
			 Assert.assertTrue(sppayinpageHeaderText.contains("Service Provider Pay-In"));
			 
		 }
		 
		 else if (Menu.equalsIgnoreCase("SP Pay-Out"))
		 {
			 sppayout = new Service_Provider_Pay_Out(BaseClass.driver);
			 String spPayoutHeaderText = sppayout.fetchsppayoutHeaderText();
			 System.out.println(spPayoutHeaderText);
			 Assert.assertTrue(spPayoutHeaderText.contains("Service Provider Pay-Out"));
			 
		 }
		 
		 else if (Menu.equalsIgnoreCase("Payout Balance"))
		 {
			 payoutbalance= new Payout_Balance_Page(BaseClass.driver);
			 String  payoutbalanceHeaderText = payoutbalance.fetchPayoutHeaderText();
			 System.out.println(payoutbalanceHeaderText);
			 Assert.assertTrue(payoutbalanceHeaderText.contains("Payout Balance"));
			 
		 }
		 
		 else if (Menu.equalsIgnoreCase("Settlement"))
		 {
			 settlemet = new Settlement_Page(BaseClass.driver);
			 String settlementPageHeaderText  = settlemet.settlementPageHeaderText();
			 System.out.println(settlementPageHeaderText);
			 Assert.assertTrue(settlementPageHeaderText.contains("Settlement"));
			 
		 }
		 
		 else if (Menu.equalsIgnoreCase("Change Password"))
		 {
			 changepassword = new Change_Password_Page (BaseClass.driver);
			 String  changepasswordPageHeaderText = changepassword.fetchchangePasswordPageHeaderText();
			 System.out.println(changepasswordPageHeaderText);
			 Assert.assertTrue(changepasswordPageHeaderText.contains("Change Password"));
			 
		 }
		 
		 else if (Menu.equalsIgnoreCase("Reseller"))
		 {
			 reseller = new Reseller_Management (BaseClass.driver);
			 String resellerPageHeaderText  = reseller.fetchResellerManagementHeaderText();
			 System.out.println(resellerPageHeaderText);
			 Assert.assertTrue(resellerPageHeaderText.contains("Reseller"));
			 
		 }
		 
		 else if (Menu.equalsIgnoreCase("Payin Scheduler"))
		 {
			 payinscheduler = new Pay_In_Scheduler (BaseClass.driver);
			 String payinschedulerHeaderText  = payinscheduler.fetchPayinSchedulerPageHeaderText();
			 System.out.println(payinschedulerHeaderText);
			 Assert.assertTrue(payinschedulerHeaderText.contains("Pay-In Scheduler"));
			 
		 }
		 
		 else if (Menu.equalsIgnoreCase("Payout Scheduler"))
		 {
			 payoutscheduler = new Pay_Out_Scheduler(BaseClass.driver);
			 String payoutschedulerHeaderText  =payoutscheduler.fetchPayoutSchedulerPageHeaderText();
			 System.out.println(payoutschedulerHeaderText);
			 Assert.assertTrue(payoutschedulerHeaderText.contains("Pay-Out"));
			 
		 }
		 
		 else if (Menu.equalsIgnoreCase("CB-VPA"))
		 {
			 cbvpamanagement = new CB_VPA_Management_Page(BaseClass.driver);
			 String cbVpaPageHeaderText  =cbvpamanagement.fetchCbVPAPageHeaderText();
			 System.out.println(cbVpaPageHeaderText);
			 Assert.assertTrue(cbVpaPageHeaderText.contains("CB VPA Management"));
			 
		 }
		 
		 else if (Menu.equalsIgnoreCase("Reports"))
		 {
			 reports = new Reports_Page(BaseClass.driver);
			 String reportsPageHeaderText  =reports.fetchReportsPageHeaderText();
			 System.out.println(reportsPageHeaderText);
			 Assert.assertTrue(reportsPageHeaderText.contains("Reports"));
			 
		 }
		 
		 else if (Menu.equalsIgnoreCase("Audit Logs"))
		 {
			 auditpage = new Audit_Logs_Page(BaseClass.driver);
			 String auditPageHeaderText  =auditpage.fetchAuditLogsPageHeaderText();
			 System.out.println(auditPageHeaderText);
			 Assert.assertTrue(auditPageHeaderText.contains("Audit Logs"));
			 
		 }
	 }
	 
	 
	 
}
