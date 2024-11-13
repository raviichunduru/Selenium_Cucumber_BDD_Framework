Feature: Login page automation of saucedemo application

  @smoke
  Scenario Outline: Login is successful with valid credentials
    Given User is on login page
    When User enters valid "<username>" and "<password>"
    And Click on login button
    Then User is navigated to Home page

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |