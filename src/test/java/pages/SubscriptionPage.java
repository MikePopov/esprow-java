package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class SubscriptionPage extends BasePage {
  private final By addExchangeBtn = By.cssSelector("[class='sc-AykKE guaEXt subscription-add-exchange-button']");
  private final By pageName = By.cssSelector("[class=sc-LzLqI hSNJdz']");

  public SubscriptionPage(WebDriver driver) {
    super(driver);
  }

  public String getAddExchangeBtn() {
    return wait.until(ExpectedConditions.presenceOfElementLocated(addExchangeBtn)).getText();
  }
}
