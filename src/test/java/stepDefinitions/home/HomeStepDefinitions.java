package stepDefinitions.home;

import appActions.cartActions.CartActions;
import appActions.homeActions.HomeActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefinitions {
    private final HomeActions homeActions;
    private final CartActions cartActions;

    public HomeStepDefinitions() {
        this.homeActions = new HomeActions();
        this.cartActions = new CartActions();
    }

    @Then("they should be logged in successfully")
    public void theyShouldBeLoggedInSuccessfully() {
        this.homeActions.menuButtonIsDisplayed();
    }

    @Given("the user added a product to the cart")
    public void theUserAddedAProductToTheCart() {
        this.homeActions.addProductToCardWithClick();
    }
    @Given("the user open the cart page")
    public void theUserOpenTheCartPage() {
        this.homeActions.openCartPage();
    }
    @Given("they click on the checkout button")
    public void theyClickOnTheCheckoutButton() {
        this.cartActions.clickOnCheckoutButton();
    }
    @Given("they fill the checkout form with {string}, {string}, {string}")
    public void theyFillTheCheckoutFormWith(String firstName, String lastName, String zipCode) {
        this.cartActions.fillCheckoutInformation(firstName, lastName, zipCode);
        this.cartActions.clickOnContinueOverviewButton();
    }
    @When("the user clicks on the continue button")
    public void theUserClicksOnTheContinueButton() {
        this.cartActions.swipeToFinishButton();
        this.cartActions.clickOnFinishButton();
    }
    @Then("they should see the order confirmation message {string}")
    public void theyShouldSeeTheOrderConfirmationMessage(String string) {
        this.cartActions.checkOrderCompleteMessage(string);
    }
}
