package com.mycompany.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
  features = "src/test/resources/features", // Path to your feature files
  glue = "com/mycompany/StepDefinitions", // Package containing step definitions
  plugin = {"pretty", "html:target/cucumber-reports.html"} // Optional: report plugins
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
  // This class serves as the Cucumber TestNG test runner
}
