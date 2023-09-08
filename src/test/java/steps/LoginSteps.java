package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import utilities.BaseTest;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage.openOrangeHrmWeb();
    }

    @And("user inputs the user name")
    public void userInputsTheUserName() {
        loginPage.inputUserName();
    }

    @And("user inputs a password")
    public void userInputsAPassword() {
        loginPage.inputPass();
    }

    @When("user clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.clickOnLogin();
    }

    @Then("user should be redirected to the home page")
    public void userShouldBeRedirectedToTheHomePage() {
        Assert.assertEquals("Dashboard", homePage.getHeaderLabe());
    }


}
