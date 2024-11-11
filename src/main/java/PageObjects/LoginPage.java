package PageObjects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.testng.Assert;

public final class LoginPage {

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

  public LoginPage enterUserName(String userName) {
    DriverManager.getDriver().findElement(TXT_USER_NAME).sendKeys(userName);
    return this;
  }

  public void enterPassword (String password) {
    DriverManager.getDriver().findElement(TXT_PASSWORD).sendKeys(password);
  }

  public void clickLogin () {
    DriverManager.getDriver().findElement(BTN_LOGIN).click();
  }

  public void assertThatHomePageLoaded () {
    Assert.assertTrue(DriverManager.getDriver().findElement(By.xpath("//div[text()='Products']")).isDisplayed());
  }
}
