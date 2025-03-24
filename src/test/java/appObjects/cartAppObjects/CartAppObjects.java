package appObjects.cartAppObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CartAppObjects {
    public CartAppObjects(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"YOUR CART\"]")
    private WebElement yourCartTitle;

    @AndroidFindBy(accessibility = "test-CONTINUE SHOPPING")
    private WebElement buttonContinueShopping;

    @AndroidFindBy(accessibility = "test-CHECKOUT")
    private WebElement buttonCheckout;

    @AndroidFindBy(accessibility = "test-First Name")
    private WebElement textInputFirstName;

    @AndroidFindBy(accessibility = "test-Last Name")
    private WebElement textInputLastName;

    @AndroidFindBy(accessibility = "test-Zip/Postal Code")
    private WebElement textInputZipCode;

    @AndroidFindBy(accessibility = "test-CANCEL")
    private WebElement buttonCancel;

    @AndroidFindBy(accessibility = "test-CONTINUE")
    private WebElement buttonContinueOverview;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"CHECKOUT: OVERVIEW\"]")
    private WebElement checkoutOverviewTitle;

    @AndroidFindBy(accessibility = "test-CHECKOUT: OVERVIEW")
    private WebElement overViewScrollArea;

    @AndroidFindBy(accessibility = "test-CANCEL")
    private WebElement buttonCancelOverview;

    @AndroidFindBy(accessibility = "test-FINISH")
    private WebElement buttonFinish;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"CHECKOUT: COMPLETE!\"]")
    private WebElement checkoutCompleteTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"THANK YOU FOR YOU ORDER\"]")
    private WebElement thankYouMessage;

    public WebElement getYourCartTitle() {
        return yourCartTitle;
    }

    public WebElement getButtonContinueShopping() {
        return buttonContinueShopping;
    }

    public WebElement getButtonCheckout() {
        return buttonCheckout;
    }

    public WebElement getTextInputFirstName() {
        return textInputFirstName;
    }

    public WebElement getTextInputLastName() {
        return textInputLastName;
    }

    public WebElement getTextInputZipCode() {
        return textInputZipCode;
    }

    public WebElement getButtonCancel() {
        return buttonCancel;
    }

    public WebElement getButtonContinueOverview() {
        return buttonContinueOverview;
    }

    public WebElement getCheckoutOverviewTitle() {
        return checkoutOverviewTitle;
    }

    public WebElement getOverViewScrollArea() {
        return overViewScrollArea;
    }

    public WebElement getButtonCancelOverview() {
        return buttonCancelOverview;
    }

    public WebElement getButtonFinish() {
        return buttonFinish;
    }

    public WebElement getCheckoutCompleteTitle() {
        return checkoutCompleteTitle;
    }

    public WebElement getThankYouMessage() {
        return thankYouMessage;
    }
}
