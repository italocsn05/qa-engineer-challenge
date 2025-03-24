package appActions.cartActions;

import appActions.gestures.SwipeGesture;
import appObjects.cartAppObjects.CartAppObjects;
import driverManager.BaseConfig;
import org.junit.jupiter.api.Assertions;

public class CartActions extends BaseConfig  {
    private final CartAppObjects cartAppObjects;

    public CartActions() {
        this.cartAppObjects = new CartAppObjects(appiumDriver);
    }

    public void clickOnContinueShoppingButton() {
        this.cartAppObjects.getButtonContinueShopping().click();
    }

    public void clickOnCheckoutButton() {
        this.cartAppObjects.getButtonCheckout().click();
    }

    public void fillCheckoutInformation(String firstName, String lastName, String zipCode) {
        this.cartAppObjects.getTextInputFirstName().sendKeys(firstName);
        this.cartAppObjects.getTextInputLastName().sendKeys(lastName);
        this.cartAppObjects.getTextInputZipCode().sendKeys(zipCode);
    }

    public void clickOnCancelCheckoutButton() {
        this.cartAppObjects.getButtonCancel().click();
    }

    public void clickOnContinueOverviewButton() {
        this.cartAppObjects.getButtonContinueOverview().click();
    }

    public void swipeToFinishButton() {
        SwipeGesture.swipeGestureWhileNotVisible(this.cartAppObjects.getOverViewScrollArea(), this.cartAppObjects.getButtonFinish(), "up", 0.1);
    }

    public void clickOnCancelOverviewButton() {
        this.cartAppObjects.getButtonCancelOverview().click();
    }

    public void clickOnFinishButton() {
        this.cartAppObjects.getButtonFinish().click();
    }

    public void checkOrderCompleteMessage(String message) {
        Assertions.assertTrue(this.cartAppObjects.getThankYouMessage().isDisplayed());
    }
}
