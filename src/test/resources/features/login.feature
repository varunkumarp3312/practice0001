# Application : PayShack
# Module      : Login
# Author      : Varun
# Description : Login validation scenarios

Feature: Login Functionality

@loginRegression
Scenario Outline: Login validation with the multiple credentials

Given user opens login page
When user enters username "<username>"
And user enters password "<password>"
And user clicks login
Then user validates login result "<expectedResult>"

Examples:
	 | username               | password      | expectedResult |
      | admin-user@indigate.in | User@12345    | valid          |
      | wrong@gmail.com        | wrongpass     | invalid        |
      |                         | User@12345    | invalid        |
      | admin-user@indigate.in |               | invalid        |
      |                         |               | invalid        |
      | admin-user@indigate.in | wrongpass     | invalid        |
      | wrong@gmail.com        | User@12345    | invalid        |
      | ADMIN-USER@INDIGATE.IN | User@12345    | invalid        |
      | admin-user@indigate.in | user@12345    | invalid        |
      | admin-user@indigate.in | USER@12345    | invalid        |
      | test@test.com          | Test@123      | invalid        |
      | @@@@                   | ####          | invalid        |
      | admin-user             | User@12345    | invalid        |
      | admin-user@indigate.in | 123456        | invalid        |