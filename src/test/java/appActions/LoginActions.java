package appActions;

import appObjects.login.LoginAppObjects;
import driverManager.AndroidDriverFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginActions extends AndroidDriverFactory {
    private final LoginAppObjects loginAppObjects;

    public LoginActions() {
        this.loginAppObjects = new LoginAppObjects(androidDriver);
    }

    public void fillUserName(String username) {
        this.loginAppObjects.getUsernameTextField().sendKeys(username);
    }

    public void fillPassword(String password) {
        this.loginAppObjects.getPasswordTextField().sendKeys(password);
    }

    public void clickLoginButton() {
        this.loginAppObjects.getLoginButton().click();
    }

    public void loginScreenIsDisplayed() {
        webDriverWait.until(ExpectedConditions.visibilityOf(this.loginAppObjects.getLoginContent()));
        Assertions.assertTrue(this.loginAppObjects.getLoginContent().isDisplayed());
    }

    public void loginAlertMessageCheck(String message){
        WebElement webElement = this.loginAppObjects.getErrorMessage().findElement(By.xpath("//android.widget.TextView"));
        String alertMessage = webElement.getText();

        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        Assertions.assertTrue(webElement.isDisplayed());
        Assertions.assertEquals(alertMessage, message);
    }

}
