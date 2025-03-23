package appActions;

import appObjects.home.HomeAppObjects;
import driverManager.AndroidDriverFactory;
import org.junit.jupiter.api.Assertions;

public class HomeActions extends AndroidDriverFactory {
    private final HomeAppObjects homeAppObjects;

    public HomeActions() {
        this.homeAppObjects = new HomeAppObjects(androidDriver);
    }

    public void menuButtonIsDisplayed() {
        Assertions.assertTrue(this.homeAppObjects.getMenuButton().isDisplayed());
    }
}
