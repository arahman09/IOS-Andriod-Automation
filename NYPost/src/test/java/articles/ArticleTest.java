package articles;

import base.MobileAPI;
import pages.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ArticleTest extends MobileAPI {

    @Test
    public void testArticles(){
        MainPage mainPage = PageFactory.initElements(appiumDriver, MainPage.class);
        mainPage.goToArticles();
    }

}
