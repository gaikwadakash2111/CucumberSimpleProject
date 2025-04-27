@Smoke
Feature: Cart Functionality

  Scenario: User should be able to navigate to cart page
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on the cart icon
    Then User should see the cart page

  @TC005
  Scenario: User want to add multiple products
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User selects specific products
    And User clicks on cart icon
    Then User navigates to your cart page