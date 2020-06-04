package testing;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends MobileAPI {

    HomePage homePage = null;
    @Test
    public void testHomePage() {
        homePage= PageFactory.initElements(appiumDriver, HomePage.class);
        homePage.allHomePageBtn();
    }

}
