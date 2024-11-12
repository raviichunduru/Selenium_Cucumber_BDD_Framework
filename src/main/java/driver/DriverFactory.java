package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class DriverFactory {

  static WebDriver driver;

  private DriverFactory() {};

  public static WebDriver getDriver() {

    ChromeOptions options = new ChromeOptions();

    options.addArguments("--headless=new");
    options.addArguments("--disable-gpu");  // Disable GPU, might be needed in headless environments

    driver = new ChromeDriver(options);
    return driver;
  }
}
