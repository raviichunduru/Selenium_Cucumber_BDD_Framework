package com.mycompany.StepDefinitions;

import driver.Driver;
import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static PageObjects.LoginPage.getLoginPageInstance;
import static driver.Driver.setUp;
import static driver.Driver.tearDown;

public class LoginStepDefinition {

  @Before
  public void initDriver () {
    setUp();
  }

  @Given("User is on login page")
  public void user_is_on_login_page() {
    DriverManager.getDriver().get("https://www.saucedemo.com/v1/");
  }

  @When("User enters valid {string} and {string}")
  public void user_enters_valid_and(String userName, String password) {
   getLoginPageInstance()
     .enterUserName(userName)
     .enterPassword(password);
  }

  @When("User enters valid username and password")
  public void user_enters_valid_username_and_password() {
    getLoginPageInstance()
      .enterUserName("standard_user")
      .enterPassword("secret_sauce");
  }

  @And("Click on login button")
  public void click_on_login_button() {
    getLoginPageInstance().clickLogin();
  }

  @Then("User is navigated to Home page")
  public void user_is_navigated_to_home_page() {
    getLoginPageInstance().assertThatHomePageLoaded();
  }

  @After
  public void quitDriver() {
    tearDown();
  }

}
