package com.mycompany.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
  /*
  don't use tags, prefer to run from maven command line
  you can override system property...use mvn clean test -D cucumber.filter.tags="@regression or @smoke or @e2e"
  FYI...surefire plugin configuration is set with system property cucumber.filter.tags
  */

  //tags = "@smoke or @regression or @e2e",
  features = "src/test/resources/features", // Path to your feature files
  glue = "com/mycompany/StepDefinitions", // Package containing step definitions
  plugin = {"pretty", "html:target/cucumber-reports.html"} // Optional: report plugins
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

  @Override
  @DataProvider(parallel = true)
  public Object[][] scenarios() {
    return super.scenarios();
  }
}
