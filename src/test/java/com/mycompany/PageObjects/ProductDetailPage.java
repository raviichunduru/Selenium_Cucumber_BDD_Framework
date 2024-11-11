package com.mycompany.PageObjects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProductDetailPage {

  private static final By BTN_ADD_TO_CART = By.xpath("//button[text()='ADD TO CART']");
  private static final By BTN_REMOVE = By.xpath("//button[text()='REMOVE']");

  public static void clickAddToCartButton () {
    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(BTN_ADD_TO_CART)).click();
  }

  public static void assertThatProductAddedToCart () {
    //WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
    Assert.assertTrue(DriverManager.getDriver().findElement(BTN_REMOVE).isDisplayed());
  }
}
