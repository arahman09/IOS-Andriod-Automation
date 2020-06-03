package testing;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LandingPage;

    public class LandingPageTest extends MobileAPI {

        @Test
        public void testAddressBox () throws InterruptedException {
            LandingPage landingPage = PageFactory.initElements(appiumDriver, LandingPage.class);
            landingPage.getLetsGoButton();
            landingPage.getAddressBox();
//        typeByXpath();
//        landingPage.getSearchBox();
//        landingPage.getCuisineButton();
        }
}
