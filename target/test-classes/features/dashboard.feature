Feature: Dashboard Functionality


  @dashboard00001
Scenario: Verify dashboard page is displayed after login

  Given user opens login page
  When user enters username "admin-user@indigate.in"
  And user enters password "User@12345"
  And user clicks login
  Then dashboard should display
  
  @dashboard00001
Scenario: Verify daily volume refresh

  Given user opens login page
  When user enters username "admin-user@indigate.in"
  And user enters password "User@12345"
  And user clicks login
  Then dashboard should display
  When user clicks daily volume button
  Then daily updated data should display
  
  @dashboard00001
Scenario: Verify week card opens client selection popup

  Given user opens login page
  When user enters username "admin-user@indigate.in"
  And user enters password "User@12345"
  And user clicks login
  Then dashboard should display
  When user clicks this week volume button
  Then client selection card should display before displaying the week data
  
  @dashboard00001
Scenario: Verify week card data after selecting client

  Given user opens login page
  When user enters username "admin-user@indigate.in"
  And user enters password "User@12345"
  And user clicks login
  Then dashboard should display
  When user clicks this week volume button
  Then client selection card should display before displaying the week data
  And user select the particular client
  Then the client Weekly data should display
  
  @dashboard00001
Scenario: Verify selected client can be deselected

  Given user opens login page
  When user enters username "admin-user@indigate.in"
  And user enters password "User@12345"
  And user clicks login
  Then dashboard should display
  When user clicks this week volume button
  And user select the particular client
  Then the client Weekly data should display
  And deselect the selected client
  
  
  @dashboard00001
Scenario: Verify month card opens client selection popup

  Given user opens login page
  When user enters username "admin-user@indigate.in"
  And user enters password "User@12345"
  And user clicks login
  Then dashboard should display
  When user clicks this month volume button
  Then client selection card should display before displaying the month data
  
  
  @dashboard00001
Scenario: Verify month card data after selecting client

  Given user opens login page
  When user enters username "admin-user@indigate.in"
  And user enters password "User@12345"
  And user clicks login
  Then dashboard should display
  When user clicks this month volume button
  Then client selection card should display before displaying the month data
  And user select the particular client
  Then the client month data should display
  
  @dashboard00001
  Scenario: verify the functionality of custom date range selection
  
  Given user opens login page
  When user enters username "admin-user@indigate.in"
  And user enters password "User@12345"
  And user clicks login
  Then dashboard should display
  When user clicks on date range selection button
  And user select the particular client in customdate range
  And user select the particular provider
  And select From date
  And select To date 
  And click on the apply button
  Then The particular clients data should be display with the selected date