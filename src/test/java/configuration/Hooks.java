package configuration;

import appiumLocalServiceManager.AppiumLocalServiceManager;
import driverManager.AndroidDriverFactory;
import io.cucumber.java.*;

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

    @BeforeStep
    public void beforeStepExecution(Scenario scenario) {
        ScreenshotCapture.screenShotCaptureAndAttachScenario(scenario);
    }

    @AfterStep
    public void afterStepExecution(Scenario scenario) {
        ScreenshotCapture.screenShotCaptureAndAttachScenario(scenario);
    }
}
