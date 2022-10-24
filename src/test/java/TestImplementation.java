import org.junit.*;
import base.BaseTest;
import pages.SubscriptionPage;
import pages.components.MainMenu;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestImplementation extends BaseTest {

  @Test
  public void login() throws Exception {
    MainMenu mainMenu = new MainMenu(driver);
    mainMenu.openSubscription();
    SubscriptionPage subscriptionPage = new SubscriptionPage(driver);
    assertThat(subscriptionPage.getAddExchangeBtn(), containsString("Add Exchange"));
  }
}