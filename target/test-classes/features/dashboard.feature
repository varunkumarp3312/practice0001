# Application : PayShack
# Module      : Login
# Author      : Varun
# Description : Dashboard validation scenarios

Feature: Dashboard Functionality
@dashboard
Scenario: verify users can select the meta cards in dashboard

Given user opens login page
When user enters username "admin-user@indigate.in"
And user enters password "User@12345"
And user clicks login
Then dashboard should display
When user clicks daily volume button 
Then daily updated data should display based on meta filter