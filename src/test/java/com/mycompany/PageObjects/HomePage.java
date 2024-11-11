package com.mycompany.PageObjects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class HomePage {

  private static final By HAMBURGER_OPEN_MENU = By.xpath("//button[text()='Open Menu']");
  private static final By LNK_ALL_ITEMS = By.xpath("//a[text()='All Items']");
  private static final By SAUCE_LABS_BACK_PACK = By.xpath("//div[text()='Sauce Labs Backpack']");
  private static final By BTN_ADD_TO_CART = By.xpath("//button[text()='ADD TO CART']");

  public static void clickOpenMenuHamburger () {
    DriverManager.getDriver().findElement(HAMBURGER_OPEN_MENU).click();
  }

  public static void clickAllItemsLink () {
    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(LNK_ALL_ITEMS)).click();
  }

  public static void assertThatProductDisplayed () {
    Assert.assertTrue(DriverManager.getDriver().findElement(SAUCE_LABS_BACK_PACK).isDisplayed());
  }

  public static void clickSauceLabsBackPack () {
    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(SAUCE_LABS_BACK_PACK)).click();
  }
}
