package stepDefinitions.login;

import appActions.LoginActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    private final LoginActions loginActions;

    public LoginStepDefinitions() {
        this.loginActions = new LoginActions();
    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        this.loginActions.loginScreenIsDisplayed();
    }

    @When("they enter valid credentials {string} and {string}")
    public void theyEnterValidCredentialsAnd(String username, String password) {
        this.loginActions.fillUserName(username);
        this.loginActions.fillPassword(password);
    }

    @When("submit the form")
    public void submitTheForm() {
        this.loginActions.clickLoginButton();
    }


    @When("they submit the form without filling in credentials")
    public void theySubmitTheFormWithoutFillingInCredentials() {
        this.loginActions.clickLoginButton();
    }

    @When("they enter a username but leave the password blank")
    public void theyEnterAUsernameButLeaveThePasswordBlank() {
        System.out.println("Passou aqui amado kkk");
    }

    @When("they enter an incorrect username or password")
    public void theyEnterAnIncorrectUsernameOrPassword() {
        System.out.println("Passou aqui amado kkk");
    }

    @When("they attempt to log in with a locked-out account")
    public void theyAttemptToLogInWithALockedOutAccount() {
        System.out.println("Passou aqui amado kkk");
    }

    @Then("they should see {string}")
    public void theyShouldSee(String string) {
        this.loginActions.loginAlertMessageCheck(string);
    }
}
