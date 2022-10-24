package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class LeftMenu extends BasePage {
  private final By titleFld = By.cssSelector("[class='sc-fzXfPb cxCNSP']");

  public LeftMenu(WebDriver driver) {
    super(driver);
  }

  public String getMenuTitle() {
    return wait.until(ExpectedConditions.presenceOfElementLocated(titleFld)).getText();
  }
}
