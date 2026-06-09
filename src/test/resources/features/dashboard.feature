Feature: Dashboard Functionality


  @dashboardRegression1
Scenario: Verify dashboard page is displayed after login

  Given user opens login page
   When user enters username "validUsername"
  And user enters password "validPassword"
  And user clicks login
  Then dashboard should display
  
  @dashboardRegression
Scenario: Verify daily volume refresh

  Given user opens login page
  When user enters username "validUsername"
  And user enters password "validPassword"
  And user clicks login
  Then dashboard should display
  When user clicks daily volume button
  Then daily updated data should display
  
  @dashboardRegression
Scenario: Verify week card opens client selection popup

  Given user opens login page
   When user enters username "validUsername"
  And user enters password "validPassword"
  And user clicks login
  Then dashboard should display
  When user clicks this week volume button
  Then client selection card should display before displaying the week data
  
  @dashboardRegression
Scenario: Verify week card data after selecting client

  Given user opens login page
   When user enters username "validUsername"
  And user enters password "validPassword"
  And user clicks login
  Then dashboard should display
  When user clicks this week volume button
  Then client selection card should display before displaying the week data
  And user select the particular client
  Then the client Weekly data should display
  
  @dashboardRegression
Scenario: Verify selected client can be deselected

  Given user opens login page
   When user enters username "validUsername"
  And user enters password "validPassword"
  And user clicks login
  Then dashboard should display
  When user clicks this week volume button
  And user select the particular client
  Then the client Weekly data should display
  And deselect the selected client
  
  
  @dashboardRegression
Scenario: Verify month card opens client selection popup

  Given user opens login page
  When user enters username "validUsername"
  And user enters password "validPassword"
  And user clicks login
  Then dashboard should display
  When user clicks this month volume button
  Then client selection card should display before displaying the month data
  
  
  @dashboardRegression
Scenario: Verify month card data after selecting client

  Given user opens login page
  When user enters username "validUsername"
  And user enters password "validPassword"
  And user clicks login
  Then dashboard should display
  When user clicks this month volume button
  Then client selection card should display before displaying the month data
  And user select the particular client
  Then the client month data should display
  
  @dashboardRegression
  Scenario: verify the functionality of custom date range selection
  
  Given user opens login page
  When user enters username "validUsername"
  And user enters password "validPassword"
  And user clicks login
  Then dashboard should display
  When user clicks on date range selection button
  And user select the particular client in customdate range
  And user select the particular provider
  And select From date
  And select To date 
  And click on the apply button
  Then The particular clients data should be display with the selected date
  
  @navigationRegression
	Scenario Outline: Verify navigation to all modules

  Given user opens login page
  When user enters username "validUsername"
  And user enters password "validPassword"
  And user clicks login
  Then dashboard should display

  When user navigates to "<Menu>"
  Then "<Menu>" page should be displayed

Examples:
| Menu              |
| Client            |
| Transactions      |
#| Developers        |
#| SP Pay-In         |
#| SP Pay-Out        |
#| Wallet Ledger     |
#| Payout Balance    |
#| Settlement        |
#| Change Password   |
#| Reseller          |
#| Payin Scheduler   |
#| Payout Scheduler  |
#| CB-VPA            |
#| Reports           |
#| Audit Logs        |
  
  
  
  
  
  