package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import pageobjects.HomePage;
import pageobjects.myInfo.MyInfoPage;

public class MyInfoSteps {

    @Steps
    HomePage homePage;

    @Steps
    MyInfoPage myInfoPage;

    @When("user clicks on the My info menu")
    public void userClicksOnTheMyInfoMenu() {
            homePage.clickMyInfo();
    }

    @Then("user should be redirected to the personal detail page")
    public void userShouldBeRedirectedToThePersonalDetailPage() {
        Assert.assertTrue(myInfoPage.ImgPersonal());
    }


}
