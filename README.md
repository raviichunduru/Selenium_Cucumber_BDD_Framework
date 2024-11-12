# Selenium_Cucumber_BDD_Framework

1. maven command to run scenarios with specific tags : mvn clean test -D cucumber.filter.tags="@regression or @smoke or @e2e"
2. maven command to run scenarios of specific feature file : mvn test -D cucumber.features=src/test/resources/features/displayproducts.feature
3. maven command to run scenarios with specific tags in a specific feature file : mvn test -D cucumber.features=src/test/resources/features/displayproducts.feature -D cucumber.filter.tags="@regression"


