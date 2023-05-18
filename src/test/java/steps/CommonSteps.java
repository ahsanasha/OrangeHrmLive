package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class CommonSteps {
    @Steps
    LoginPage loginPage;
    @Steps
    HomePage homePage;

    @Given("user is already on home page")
    public void userIsAlreadyOnHomePage() {
        loginPage.openOrangeHrmWeb();
        loginPage.inputUserName();
        loginPage.inputPass();
        loginPage.clickOnLogin();
    }

}
