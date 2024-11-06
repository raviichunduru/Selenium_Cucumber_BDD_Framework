package com.mycompany.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public final class LoginPage {

  WebDriver driver;

  static LoginPage loginPage = new LoginPage();

  private LoginPage() {
  }

  private static final By TXT_USER_NAME = By.xpath("//input[@id='user-name']");
  private static final By TXT_PASSWORD = By.xpath("//input[@id='password']");
  private static final By BTN_LOGIN = By.xpath("//input[@id='login-button']");
  private static final By TXT_PRODUCTS = By.xpath("//div[text()='Products']");

  public static LoginPage getLoginPageInstance () {
    return loginPage;
  }

  public void setUp () {
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/v1/");
  }

  public LoginPage enterUserName(String userName) {
    driver.findElement(TXT_USER_NAME).sendKeys(userName);
    return this;
  }

  public void enterPassword (String password) {
    driver.findElement(TXT_PASSWORD).sendKeys(password);
  }

  public void clickLogin () {
    driver.findElement(BTN_LOGIN).click();
  }

  public void assertThatHomePageLoaded () {
    Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed());
  }

  public void tearDown () {
    driver.quit();
  }
}
