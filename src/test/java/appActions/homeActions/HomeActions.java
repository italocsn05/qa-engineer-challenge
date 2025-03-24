package appActions.homeActions;

import appObjects.home.HomeAppObjects;
import driverManager.BaseConfig;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeActions extends BaseConfig {
    private final HomeAppObjects homeAppObjects;

    public HomeActions() {
        this.homeAppObjects = new HomeAppObjects(appiumDriver);
    }

    public void menuButtonIsDisplayed() {
        Assertions.assertTrue(this.homeAppObjects.getMenuButton().isDisplayed());
    }

    public void addProductToCardWithClick() {
        webDriverWait.until(ExpectedConditions.visibilityOf(this.homeAppObjects.getProductsListView()));
        WebElement product = this.homeAppObjects.getProductItems().getFirst();
        product.findElement(AppiumBy.accessibilityId("test-ADD TO CART")).click();
    }

    public void openCartPage() {
        this.homeAppObjects.getCartButton().click();
    }

}
