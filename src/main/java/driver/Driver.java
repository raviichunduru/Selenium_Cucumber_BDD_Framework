package driver;

import java.util.Objects;

public class Driver {

  public static void setUp () {

    if(Objects.isNull(DriverManager.getDriver())){
      DriverManager.setDriver(DriverFactory.getDriver());
      DriverManager.getDriver().manage().window().maximize();
    }
  }

  public static void tearDown () {

    if(Objects.nonNull(DriverManager.getDriver())) {
      DriverManager.getDriver().quit();
      DriverManager.unLoad();
    }
  }
}

