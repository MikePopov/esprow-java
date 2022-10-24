package base;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.Augmenter;

import pages.LoginPage;
import pages.components.LeftMenu;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BaseTest {
  protected WebDriver driver;

  @BeforeClass
  public static void setupWebdriverChromeDriver() {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
  }

  @Before
  public void setup() {
    driver = new ChromeDriver();
    // WebStorage webStorage = (WebStorage) new Augmenter().augment(driver);
    // LocalStorage localStorage = webStorage.getLocalStorage();
    LoginPage loginPage = new LoginPage(driver);
    loginPage
        .load()
        .login("test.qa.3@esprow.com", "temporaryAccount");
    LeftMenu leftMenu = new LeftMenu(driver);
    assertThat(leftMenu.getMenuTitle(), containsString("ETP MARKETS"));
  }

  @After
  public void teardown() {
    if (driver != null) {
      driver.quit();
    }
  }
}
