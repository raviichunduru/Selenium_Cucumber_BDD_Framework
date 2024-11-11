package com.mycompany.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(tags = "",
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
