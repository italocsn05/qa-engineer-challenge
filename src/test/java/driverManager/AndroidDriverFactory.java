package driverManager;

import appiumLocalServiceManager.AppiumLocalServiceManager;
import capabilitiesManager.AndroidCapabilitiesBuilder;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AndroidDriverFactory extends BaseConfig {
    protected static AndroidDriver androidDriver;

    public static void setupAndroidDriver() {
        androidDriver = new AndroidDriver(AppiumLocalServiceManager.getAppiumServiceUrl(), AndroidCapabilitiesBuilder.getAndroidCapabilities());
        webDriverWait = new WebDriverWait(androidDriver, Duration.ofSeconds(30));
    }

    public static void quitAndroidDriver() {
        if (androidDriver != null) {
            androidDriver.quit();
        }
    }
}
