package pages;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Activity Indicators']")
    public static WebElement activityIndicatorsBtn;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Alert Controller']")
    public static WebElement alertControllerBtn;
    @FindBy (xpath ="//XCUIElementTypeStaticText[@name='ButtonViewController']")
    public static WebElement buttonsBtn;
    @FindBy (xpath ="//XCUIElementTypeStaticText[@name='Date Picker']")
    public static WebElement datePickerBtn;
    @FindBy (xpath ="//XCUIElementTypeStaticText[@name='Image View']")
    public static WebElement imageViewBtn;
    @FindBy (xpath ="//XCUIElementTypeStaticText[@name='Page Control']")
    public static WebElement pageControlBtn;
    @FindBy (xpath ="//XCUIElementTypeStaticText[@name='Picker View']")
    public static WebElement pickerViewBtn;
    @FindBy (xpath ="//XCUIElementTypeStaticText[@name='Progress Views']")
    public static WebElement progressViewBtn;
    @FindBy (xpath ="//XCUIElementTypeStaticText[@name='Search']")
    public static WebElement searchBtn;
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name='Segmented Controls']")
    public static WebElement segmentedControlsBtn;
    @FindBy (xpath ="//XCUIElementTypeStaticText[@name='Sliders']")
    public static WebElement slidersBtn;
    @FindBy (xpath ="//XCUIElementTypeStaticText[@name='Stack Views']")
    public static WebElement stackViewsBtn;
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name='Steppers']")
    public static WebElement steppersBtn;
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name='Switches']")
    public static WebElement switchesBtn;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='UIKitCatalog']")
    public static WebElement backBtn;

    public void tapActivityIndicatorsBtn() {
        clickByXpathWebElement(activityIndicatorsBtn);
        tapBackBtn();
    }
    public void tapAlertControllerBtn() {
       clickByXpathWebElement(alertControllerBtn);
       tapBackBtn();
    }
    public void tapButtonsBtn() {
        clickByXpathWebElement(buttonsBtn);
        tapBackBtn();
    }
    public void tapDatePickerBtn() {
        clickByXpathWebElement(datePickerBtn);
        tapBackBtn();
    }
    public void tapImageViewBtn() {
       clickByXpathWebElement(imageViewBtn);
       tapBackBtn();
    }
    public void tapPageControlBtn() {
        clickByXpathWebElement(pageControlBtn);
        tapBackBtn();
    }
    public void tapPickerViewBtn() {
        clickByXpathWebElement(pickerViewBtn);
        tapBackBtn();
    }
    public void tapProgressViewBtn() {
       clickByXpathWebElement(progressViewBtn);
       tapBackBtn();
    }
    public void tapSearchBtn() {
        clickByXpathWebElement(searchBtn);
        tapBackBtn();
    }
    public void tapSegmentedControlsBtn() {
        clickByXpathWebElement(segmentedControlsBtn);
        tapBackBtn();
    }
    public void tapSlidersBtn() {
        clickByXpathWebElement(slidersBtn);
        tapBackBtn();
    }
    public void tapStackViewsBtn() {
        clickByXpathWebElement(stackViewsBtn);
        tapBackBtn();
    }
    public void tapSteppersBtn() {
        clickByXpathWebElement(steppersBtn);
        tapBackBtn();
    }
    public void tapSwitchesBtn() {
        clickByXpathWebElement(switchesBtn);
        tapBackBtn();
    }
    public void tapBackBtn() {
        clickByXpathWebElement(backBtn);
    }

    public void allHomePageBtn() {
        tapActivityIndicatorsBtn();
        tapAlertControllerBtn();
        tapButtonsBtn();
        tapDatePickerBtn();
        tapImageViewBtn();
        tapPageControlBtn();
        tapPickerViewBtn();
        tapProgressViewBtn();
        tapSearchBtn();
        tapSegmentedControlsBtn();
        tapSlidersBtn();
        tapStackViewsBtn();
        tapSteppersBtn();
        tapSwitchesBtn();
        }
}


