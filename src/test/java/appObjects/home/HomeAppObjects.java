package appObjects.home;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomeAppObjects {
    public HomeAppObjects(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(accessibility = "test-Menu")
    private WebElement menuButton;

    public WebElement getMenuButton() {
        return menuButton;
    }
}
