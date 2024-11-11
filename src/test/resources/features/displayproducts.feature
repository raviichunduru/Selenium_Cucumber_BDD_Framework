Feature: Validate if user is displayed products to order

  Background: Login is successful with valid credentials
    Given User is on login page
    When User enters valid username and password
    And Click on login button
    Then User is navigated to Home page

  @regression
  Scenario: Check if user is displayed products after click on All Items link
    When User click on hamburger menu
    And Click on all items link
    Then User is displayed products
    And Close the browser

  @e2e
  Scenario: Check if user is able to add product to cart
    When User navigated to products page
    And Click on add to cart button
    Then Product is added to cart
    And Close the browser






