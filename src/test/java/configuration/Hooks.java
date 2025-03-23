package configuration;

import appiumLocalServiceManager.AppiumLocalServiceManager;
import driverManager.AndroidDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeTestExecution() {
        AppiumLocalServiceManager.startAppiumService();
        AndroidDriverFactory.setupAndroidDriver();
    }

    @After
    public void afterTestExecution() {
        AndroidDriverFactory.quitAndroidDriver();
        AppiumLocalServiceManager.stopAppiumService();
    }
}
