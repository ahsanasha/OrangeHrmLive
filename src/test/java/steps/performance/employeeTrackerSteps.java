package steps.performance;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageobjects.HomePage;
import pageobjects.performance.PerformancePage;

public class employeeTrackerSteps {
    @Steps
    HomePage homePage;

    @Steps
    PerformancePage performancePage;


    @And("user clicks on the Performance menu")
    public void userClicksOnThePerformanceMenu() {
        homePage.clickPerformance();
    }

    @When("user clicks on the employee tracker")
    public void userClicksOnTheEmployeeTracker() {
        performancePage.clickOnConfigure();
        performancePage.selectConfigList();
    }

    @Then("user should be redirected to the employee tracker page")
    public void userShouldBeRedirectedToTheEmployeeTrackerPage() {

    }
}
