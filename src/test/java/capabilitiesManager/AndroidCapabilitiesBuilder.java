package capabilitiesManager;

import io.appium.java_client.android.options.UiAutomator2Options;

public class AndroidCapabilitiesBuilder {

    public static UiAutomator2Options getAndroidCapabilities() {
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setPlatformName("android");
        uiAutomator2Options.setAutomationName("uiautomator2");
        uiAutomator2Options.setPlatformVersion("16");
        uiAutomator2Options.setUdid("emulator-5554");
        uiAutomator2Options.fullReset();
        uiAutomator2Options.setAvd("AndroidTestDevice");
        uiAutomator2Options.autoGrantPermissions();
        uiAutomator2Options.setApp("src/test/resources/appResouces/android/swaglab.apk");
        uiAutomator2Options.setAppWaitActivity("com.swaglabsmobileapp.MainActivity");
        return uiAutomator2Options;
    }
}
