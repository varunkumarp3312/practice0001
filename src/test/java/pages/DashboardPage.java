package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;
import utils.WaitUtility;

public class DashboardPage {
	
	 WebDriver driver ; 
	CommonMethods common;
	 
	
	By dashboardText = By.xpath("//span[text()='Dashboard']");
	
	By dailyVolumeButton = By.xpath(
			"//div[text()='Today']/ancestor::div[contains(@class,'stats-card')]//button[contains(@class,'card-refresh-btn')]"
			);
	
	By dailyVolumeValue = By.xpath(
			"//div[text()='Today']/ancestor::div[contains(@class,'stats-card')]//div[contains(@class,'stats-value')]"
			);
	By WeekVolumeButton = By.xpath("//div[text()='This Week']/ancestor::div[contains(@class,'stats-card week')]//button[contains(@class,'card-refresh-btn')]");
	 
	 
	By weekMetaClientSelectionPage= By.xpath("//h2[contains(.,'Select a Client to View Weekly Data')]");
	
	By clientSelectionCancelButton = By.xpath("//h2[contains(.,'Select a Client')]/following::button[contains(.,'Cancel')][1]");
	
	By selectPerticularClient = By.xpath("//div[text()='internal test']/ancestor::div[contains(@style,'cursor: pointer')]");
	
	By ThisWeekMetaValue = By.xpath("//div[text()='This Week']/ancestor::div[contains(@class,'stats-card')]//div[contains(@class,'stats-value')]");
	
	By monthVolumeButton = By.xpath("//div[text()='This Month']/ancestor::div[contains(@class,'stats-card month')]//button[contains(@class,'card-refresh-btn')]");

	By monthMetaClientSelectionPage= By.xpath("//h2[contains(.,'Select a Client')]");

	By ThisMonthMetaValue  =By.xpath(("//div[text()='This Month']/ancestor::div[contains(@class,'stats-card')]//div[contains(@class,'stats-value')]"));
	
	By loadingBackdrop = By.xpath("//div[contains(@class,'MuiBackdrop-root')]");
	
	By deselectTheClient = By.xpath("//span[contains(text(),'internal test')]/following::*[@data-testid='CancelIcon'][1]");
	
	By customDateRangeButton = By.xpath("//button[contains(@class,'date-picker-trigger')]");
	
	
	By clientDropdown  = By.xpath("//select[option[contains(text(),'internal test')]]");
	
	By ProviderDropdown = By.xpath("//select[option[contains(text(),'PAYMATE-PAYIN')]]");
	
	By selectfromDate = By.xpath("//input[@placeholder='Select start date']");
	
	By selectToDate = By.xpath("//input[@placeholder='Select end date']");
	
	By clickApplyButton = By.xpath("//button[contains(text(),'Apply')]");
	
	By customDateMetaValue = By.xpath("//div[text()='Custom Range']/ancestor::div[contains(@class,'stats-card')]//div[contains(@class,'stats-value')]");
	
	By clientPageButton = By.xpath("//a[@href='/Client']");
	
	By payinTransactionsButton = By.xpath("//a[@href='/PayinTransaction']");
	
	By clickPayoutDropdown = By.xpath("//a[@href='/PrefundTransaction']");
	
	By clickPayoutPageButton = By.xpath("//a[@href='/PayoutTransaction']");
	
	By developerPageButton = By.xpath("//a[@href='/Developers']");
	
	By SpPayinPageButton = By.xpath("//a[@href='/Service-Provider-Payin']");
	
	By spPayoutPageButton = By.xpath("//a[@href='/Service-Provider-Payout']");
	
	By walletAndLedgerButton = By.xpath("//a[@href='/wallet']");
	
	By payoutBalanceButton = By.xpath("//a[@href='/init-credit-debit']");
	
	By settlementButton = By.xpath("//a[@href='/settlement']");
	
	By changePasswordButton = By.xpath("//a[@href='/ChangePassword']");
	
	By resellerpageButton =By.xpath("//a[@href='/reseller']");
	
	By payinSchedulerPageButton = By.xpath("//a[@href='/payinscheduler']");
	
	By payoutSchedulerPageButton = By.xpath("//a[@href='/payoutscheduler']");
	
	By chargeBackVpaPageButton = By.xpath("//a[@href='/cbvpa']");
	
	By reportsPageButton = By.xpath("//a[@href='/reports']");
	
	By auditLogPageButton = By.xpath("//span[contains(text(),'Audit Logs')]");
	
	
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
		common.click(dailyVolumeButton);
		
		System.out.println("daily meta button is clicked");
		
	}
	public String fetchDailyVolume()
	{
		String value = common.getText(dailyVolumeValue);
		System.out.println("daily volume is fetched succeffully : "+dailyVolumeValue);
		return value;
	}
	
	public void clickWeekMeta()
	{
		common.click(WeekVolumeButton);
		System.out.println("week meta button has been clicked");
	}

	public String fetchWeekClientselectiontext()
	{
		String weekClientText=common.getText(weekMetaClientSelectionPage);
//		System.out.println(weekClientText);
		return weekClientText;
	}
	
	public void close_client_selection_page()
	{
		common.click(clientSelectionCancelButton);
	}
	
	public void select_perticular_client()
	{
		common.click(selectPerticularClient);
		WaitUtility.waitForElementInvisible(driver, loadingBackdrop);

	    System.out.println("Client selected and popup closed");
		

	    System.out.println("Client selected and popup closed");
	}
	
	public String thisWeekMetaFetch()
	{
		return common.getText(ThisWeekMetaValue);
	}
	
	public void clicMonthMeta()
	{
		common.click(monthVolumeButton);
	}
	
	public String fetchMonthClientselectiontext()
	{
		return common.getText(monthMetaClientSelectionPage);
	}
	public String thisMonthMetaFetch()
	{
		return common.getText(ThisMonthMetaValue);
	}
	
	public void clickdeselectTheClientButton() {
		common.click(deselectTheClient);
	}
	
	public void clickcustomDateRangeMeta()
	{
		common.click(customDateRangeButton);
	}
	
	public void clientselectDropDown()
	{
		Select clientdropdown = new Select(driver.findElement(clientDropdown));

		clientdropdown.selectByVisibleText("internal test");

	    System.out.println("Internal Test client selected successfully");
		
	}
	
	public void providersselectDropdown()
	{
		Select providersdropdown = new Select(driver.findElement(ProviderDropdown));
		providersdropdown.selectByVisibleText("PAYMATE-PAYIN");
		System.out.println("providers has been selected");
	}
	
	public void enterFromDate( )
	{
		
	    LocalDate fromdate = LocalDate.now().minusDays(5);

	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	    String fromDate = fromdate.format(formatter);

	    common.enterText(selectfromDate, fromDate);

	    System.out.println("From Date entered : " + fromDate);
	}
	
	public void enterToDate()
	{
		LocalDate todate = LocalDate.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String	toDatetext=formatter1.format(todate);
		common.enterText(selectToDate,toDatetext);
		System.out.println(toDatetext);
	}
	
	public void clickApplyButtonInCustomMeta()
	{
		common.click(clickApplyButton);
		
	}
	
	public  String fetchCustomDateMetaValue()
	{
		 String customvalue=common.getText(customDateMetaValue);
		
		 return customvalue;
	}
	
	public void clickClientPage() {
		common.click(clientPageButton);
	}
	
	public void clickPayinTransactionsPage()
	{
		common.click(payinTransactionsButton);
	}
	
	public void clickPayoutPage()
	{
		 common.click(clickPayoutDropdown);

		    try {
		        Thread.sleep(1000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }

		    common.jsClick(clickPayoutPageButton);
	}
	
	
	public void clickDeveloperPage()
	{
		common.click(developerPageButton);
	}
	public void clickServicePayinPage()
	{
		common.click(SpPayinPageButton);;
	}
	
	public void clickservicePayoutPage()
	{
		common.click(spPayoutPageButton);
	}
	public void clickWalletAndLedgertPage()
	{
		common.click(walletAndLedgerButton);
	}
	public void clickPayoutBalancePage()
	{
		common.click(payoutBalanceButton);
	}
	public void clickSettlementPage()
	{
	common.click(settlementButton);	
	}
	public void changePasswordPage()
	{
		common.jsClick(changePasswordButton);
	}
	
	public void clickResllerPage()
	{
		common.jsClick(resellerpageButton);
	}
	
	public void clickPayinSchedulerPage()
	{
		common.jsClick(payinSchedulerPageButton);
	}
	
	public void clickPayoutSchedulerPage()
	{
		common.jsClick(payoutSchedulerPageButton);
	}
	
	public void clickCBVpaManagementPage()
	{
		common.jsClick(chargeBackVpaPageButton);
	}
	
	public void clickReportsPage()
	{
		
		common.jsClick(reportsPageButton);
	}
	
	public void clickAuditPagePage()
	{
		common.jsClick(auditLogPageButton);
	}
	
	
	
	
}


