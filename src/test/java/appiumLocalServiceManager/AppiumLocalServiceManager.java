package appiumLocalServiceManager;

import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.net.URL;

public abstract class AppiumLocalServiceManager {
    protected static AppiumDriverLocalService appiumService;

    public static void startAppiumService() {
        appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
        System.out.println("Starting Appium Local Service");
    }

    public static void stopAppiumService() {
        if (appiumService != null) {
            appiumService.stop();
            System.out.println("Stopping Appium Local Service");
        }
    }

    public static URL getAppiumServiceUrl() {
        return appiumService.getUrl();
    }
}
