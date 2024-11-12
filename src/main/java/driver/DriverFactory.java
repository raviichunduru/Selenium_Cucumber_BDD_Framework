package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class DriverFactory {

  static WebDriver driver;

  private DriverFactory() {};

  public static WebDriver getDriver() {

    /*ChromeOptions options = new ChromeOptions();

    options.addArguments("--headless");
    options.addArguments("--disable-dev-shm-usage");  // Disable shared memory usage, common fix for Docker environments
    options.addArguments("--no-sandbox");  // Disable sandboxing
    options.addArguments("--remote-debugging-port=9222");  // Enable remote debugging (fix for DevToolsActivePort)
    options.addArguments("--disable-gpu");  // Disable GPU, might be needed in headless environments*/

    driver = new ChromeDriver();
    return driver;
  }
}
