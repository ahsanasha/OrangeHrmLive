package pageobjects.performance;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utilities.MouseAction;
import utilities.WaitForUtils;

public class EmployeeTrackerPage extends PageObject {
    /*
     * Tf is text field
     * Btn is button
     * Lb is label
     *
     * */

    MouseAction mouseAction = new MouseAction();
    private final WaitForUtils waitForUtils = new WaitForUtils();


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")
    WebElementFacade employeeTrackerLb;

    public String isOnEmployeeTracker(){
        return  employeeTrackerLb.getText();
    }
}
