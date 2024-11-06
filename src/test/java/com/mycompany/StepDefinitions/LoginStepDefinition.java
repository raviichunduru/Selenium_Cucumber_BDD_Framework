package com.mycompany.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginStepDefinition {
  static WebDriver driver;

  @Given("User is on login page")
  public void user_is_on_login_page() {
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/v1/");
  }
  @When("User enters valid {string} and {string}")
  public void user_enters_valid_and(String userName, String password) {
    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

  }
  @And("Click on login button")
  public void click_on_login_button() {
    driver.findElement(By.xpath("//input[@id='login-button']")).click();
  }
  @Then("User is navigated to Home page")
  public void user_is_navigated_to_home_page() {
    Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed());
  }
  @And("Close the browser")
  public void close_the_browser() {
    driver.quit();
  }
}
