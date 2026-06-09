Feature: Login Functionality

@loginRegression
Scenario Outline: Login validation with multiple credentials

  Given user opens login page
  When user enters username from config "<usernameKey>"
  And user enters password from config "<passwordKey>"
  And user clicks login
  Then user validates login result "<expectedResult>"

Examples:
  | usernameKey     | passwordKey     | expectedResult |
  | validUsername   | validPassword   | valid          |
  | invalidUsername | invalidPassword | invalid        |
  | emptyUsername   | validPassword   | invalid        |
  | validUsername   | emptyPassword   | invalid        |
  | emptyUsername   | emptyPassword   | invalid        |
  | validUsername   | invalidPassword | invalid        |
  | invalidUsername | validPassword   | invalid        |
  | specialUsername | specialPassword | invalid        |
  | shortUsername   | validPassword   | invalid        |
  | validUsername   | shortPassword   | invalid        |
  | testUsername    | testPassword    | invalid        |