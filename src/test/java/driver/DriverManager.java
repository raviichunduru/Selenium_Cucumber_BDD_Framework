package driver;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class DriverManager {

  private DriverManager () {};

  private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

  public static void setDriver (WebDriver driver) {
    if(Objects.nonNull(driver))
    threadLocal.set(driver);
  }

  public static WebDriver getDriver () {
   return threadLocal.get();
  }

  public static void unLoad () {
    threadLocal.remove();
  }
}
