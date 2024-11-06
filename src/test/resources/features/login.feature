Feature: Login page automation of saucedemo application
Scenario: Login is successful with valid credentials
Given User is on login page
When User enters valid username and password
And Click on login button
Then User is navigated to Home page
And Close the browser


