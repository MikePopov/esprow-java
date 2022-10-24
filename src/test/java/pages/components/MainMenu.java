package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class MainMenu extends BasePage {
  private final By menuBtn = By.cssSelector("[class='sc-fzXfPg cysWNI']");
  private final By subscriptionItem = By.linkText("Subscription");

  public MainMenu(WebDriver driver) {
    super(driver);
  }

  public MainMenu openSubscription() {
    Actions builder = new Actions(driver);
    WebElement element = driver.findElement(menuBtn);
    builder.moveToElement(element).build().perform();
    wait.until(ExpectedConditions.visibilityOfElementLocated(subscriptionItem)).click();
    return this;
  }
}
