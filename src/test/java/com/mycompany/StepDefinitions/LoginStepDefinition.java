package com.mycompany.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.mycompany.PageObjects.LoginPage.getLoginPageInstance;
import static driver.Driver.setUp;
import static driver.Driver.tearDown;

public class LoginStepDefinition {

  @Given("User is on login page")
  public void user_is_on_login_page() {
    setUp();
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
  @And("Close the browser")
  public void close_the_browser() {
    tearDown();
  }
}
