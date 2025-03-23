package stepDefinitions.home;

import appActions.HomeActions;
import appObjects.home.HomeAppObjects;
import driverManager.AndroidDriverFactory;
import io.cucumber.java.en.Then;

public class HomeStepDefinitions {
    private HomeActions homeActions;

    public HomeStepDefinitions() {
        this.homeActions = new HomeActions();
    }

    @Then("they should be logged in successfully")
    public void theyShouldBeLoggedInSuccessfully() {
        this.homeActions.menuButtonIsDisplayed();
    }
}
