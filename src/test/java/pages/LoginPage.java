package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class LoginPage extends BasePage {
  private final By emailFld = By.cssSelector("[type='email']");
  private final By passwordFld = By.cssSelector("[type='password']");
  private final By signInBtn = By.cssSelector("[class='sc-AykKE sc-LzMCI cafzer']");

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public LoginPage load() {
    load("/auth/sign-in");
    return this;
  }

  public LoginPage login(String email, String password) {
    wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld)).sendKeys(email);
    wait.until(ExpectedConditions.visibilityOfElementLocated(passwordFld)).sendKeys(password);
    wait.until(ExpectedConditions.elementToBeClickable(signInBtn)).click();
    return this;
  }

}
