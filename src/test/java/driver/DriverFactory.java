package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverFactory {

  static WebDriver driver;

  private DriverFactory() {};

  public static WebDriver getDriver() {
    driver = new ChromeDriver();
    return driver;
  }
}
