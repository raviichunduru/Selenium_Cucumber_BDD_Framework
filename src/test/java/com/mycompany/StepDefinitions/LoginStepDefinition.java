package com.mycompany.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.mycompany.PageObjects.LoginPage.getLoginPageInstance;

public class LoginStepDefinition {
  static WebDriver driver;

  @Given("User is on login page")
  public void user_is_on_login_page() {
    getLoginPageInstance().setUp();
  }
  @When("User enters valid {string} and {string}")
  public void user_enters_valid_and(String userName, String password) {
   getLoginPageInstance()
     .enterUserName(userName)
     .enterPassword(password);
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
    getLoginPageInstance().tearDown();
  }
}
