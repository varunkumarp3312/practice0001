Feature: Login Functionality

  Scenario: Login with valid credentials

    Given user opens login page
    When user enters username
    And user enters password
    And user clicks login
	Then dashboard should display
	
	Scenario: Login with the invalid credentials
	Given user opens login page
	When user enters invalid username
	And user enters invalid password
	And user clicks login
	Then login error message should display