package pages;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {

    @FindBy (xpath = "//XCUIElementTypeStaticText[@name='Alerts']")
    public static WebElement alertsButton;
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name='Attributes']")
    public static WebElement attributesButton;
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name='Scrolling']")
    public static WebElement scrollingButton;
    @FindBy (xpath = "//XCUIElementTypeButton[@name='Back']")
    public static WebElement backButton;

    public void tapBack() {
        clickByXpathWebElement(backButton);
    }

    public void tapAlert() {
        clickByXpathWebElement(alertsButton);
        tapBack();
    }
    public void tapAttributes() {
        clickByXpathWebElement(attributesButton);
        tapBack();
    }
    public  void tapScrolling() {
        clickByXpathWebElement(scrollingButton);
        tapBack();
    }
}
