package appObjects.login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginAppObjects {
    public LoginAppObjects(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(accessibility = "test-Login")
    private WebElement loginContent;

    @AndroidFindBy(accessibility = "test-Username")
    private WebElement usernameTextField;

    @AndroidFindBy(accessibility = "test-Password")
    private WebElement passwordTextField;

    @AndroidFindBy(accessibility = "test-LOGIN")
    private WebElement loginButton;

    @AndroidFindBy(accessibility = "test-Error message")
    private WebElement errorMessage;

    public WebElement getLoginContent() {
        return loginContent;
    }

    public WebElement getUsernameTextField() {
        return usernameTextField;
    }

    public WebElement getPasswordTextField() {
        return passwordTextField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }
}
