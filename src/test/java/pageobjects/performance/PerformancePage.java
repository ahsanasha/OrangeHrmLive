package pageobjects.performance;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import utilities.MouseAction;
import utilities.WaitForUtils;

public class PerformancePage extends PageObject {
    /*
     * Tf is text field
     * Btn is button
     * Lb is label
     *
     * */

    MouseAction mouseAction = new MouseAction();
    private final WaitForUtils waitForUtils = new WaitForUtils();


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")
    WebElementFacade configureTab;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")
    WebElementFacade manageReviewsTab;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")
    WebElementFacade myTrackerTab;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/a")
    WebElementFacade employeeTrackerTab;

    @FindBy(css = "ul[role='menu']")
    WebElementFacade configureList;


    public void clickOnConfigure(){
        clickOn(configureTab);
    }

    public void selectConfigList(){
        clickOn(configureTab.selectByIndex(0));
    }

    public void clickOnManageReviews(){
        clickOn(manageReviewsTab);
    }

    public void clickOnMyTrackers(){
        clickOn(myTrackerTab);
    }

    public void clickOnEmployeeTrackers(){
        clickOn(employeeTrackerTab);
    }


}
