package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.pages.PageObject;
import utilities.BaseTest;

import java.io.IOException;

public class Hooks extends PageObject {
    BaseTest baseTest = new BaseTest();

    /**
     * Will be executed before each Scenario.
     */
    @Before
    public void initProperties() throws IOException {
        baseTest.initializeProperties();
    }

    /**
     * Will be executed after each Scenario.
     */
    @After
    public void closeBrowser() {
        getDriver().quit();
    }
}
