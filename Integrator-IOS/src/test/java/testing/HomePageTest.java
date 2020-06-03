package testing;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends MobileAPI {
    HomePage homePage =null;

    @Test
    public void TestHomePage() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
        homePage.tapAlert();
        homePage.tapAttributes();
        homePage.tapScrolling();
    }
}
