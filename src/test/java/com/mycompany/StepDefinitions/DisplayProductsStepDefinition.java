package com.mycompany.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static PageObjects.HomePage.assertThatProductDisplayed;
import static PageObjects.HomePage.clickAllItemsLink;
import static PageObjects.HomePage.clickOpenMenuHamburger;
import static PageObjects.HomePage.clickSauceLabsBackPack;
import static PageObjects.ProductDetailPage.assertThatProductAddedToCart;
import static PageObjects.ProductDetailPage.clickAddToCartButton;
import static driver.Driver.setUp;
import static driver.Driver.tearDown;

public class DisplayProductsStepDefinition {

  @Before
  public void initDriver () {
    setUp();
  }

  @When("User click on hamburger menu")
  public void user_click_on_hamburger_menu() {
    clickOpenMenuHamburger();
  }

  @And("Click on all items link")
  public void clicks_on_all_items_link() {
    clickAllItemsLink();
  }

  @Then("User is displayed products")
  public void user_is_displayed_products() {
    assertThatProductDisplayed();
  }

  @When("User navigated to products page")
  public void user_navigated_to_products_page() {
    clickSauceLabsBackPack();
  }

  @When("Click on add to cart button")
  public void click_on_add_to_cart_button() {
    clickAddToCartButton();
  }

  @Then("Product is added to cart")
  public void product_is_added_to_cart() {
    assertThatProductAddedToCart ();
  }

  @After
  public void quitDriver() {
    tearDown();
  }
}
