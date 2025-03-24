package appActions.gestures;

import com.google.common.collect.ImmutableMap;
import driverManager.BaseConfig;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class SwipeGesture extends BaseConfig {
    public static void swipeGestureWhileNotVisible(WebElement scrollElement, WebElement elementToFind, String direction, Double percent) {
        int swipeCount = 0;
        int swipeLimit = 10;

        while (swipeCount < swipeLimit) {
            try {
                if (elementToFind.isDisplayed()) {
                    System.out.println("Element found");
                    break;
                }
            } catch (NoSuchElementException e) {
                System.out.println("Element not found");
            }
            appiumDriver.executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", scrollElement, "direction", direction, "percent", percent));
            swipeCount++;
        }
    }
}
