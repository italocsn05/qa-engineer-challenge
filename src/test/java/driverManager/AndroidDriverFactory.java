package driverManager;

import appiumLocalServiceManager.AppiumLocalServiceManager;
import capabilitiesManager.AndroidCapabilitiesBuilder;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public abstract class AndroidDriverFactory extends BaseConfig {

    public static void setupAndroidDriver() {
        appiumDriver = new AndroidDriver(AppiumLocalServiceManager.getAppiumServiceUrl(), AndroidCapabilitiesBuilder.getAndroidCapabilities());
        webDriverWait = new WebDriverWait(appiumDriver, Duration.ofSeconds(30));
    }

    public static void quitAndroidDriver() {
        if (appiumDriver != null) {
            appiumDriver.quit();
        }
    }

}
