package configuration;

import driverManager.BaseConfig;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class ScreenshotCapture extends BaseConfig {
    public static void screenShotCaptureAndAttachScenario(Scenario scenario){
        String dateTime = new SimpleDateFormat(" dd-MM-yyyy ").format(new Timestamp(System.currentTimeMillis()));
        String fileName = "TestCase - " + scenario.getName() + " - Date - " + dateTime + " - Status - " + scenario.getStatus();

        byte[] data = appiumDriver.getScreenshotAs(OutputType.BYTES);
        scenario.attach(data, "image/png", fileName + ".png");
    }
}
