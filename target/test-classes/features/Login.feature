@Smoke
Feature: SauceDemo Login

  @TC001
  Scenario: Successful login with valid credentials
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then User should be logged in successfully

  @TC002
  Scenario: Verify error message upon invalid Username
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "Demo"
    Then Error message should be displayed
   