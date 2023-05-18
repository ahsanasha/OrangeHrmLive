package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BaseTest;
import utilities.MouseAction;
import utilities.WaitForUtils;

public class HomePage extends PageObject {
    /*
     * Tf is text field
     * Btn is button
     * Lb is label
     *
     * */

    MouseAction mouseAction = new MouseAction();
    private final WaitForUtils waitForUtils = new WaitForUtils();

    @FindBy(css = "h6[class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElementFacade dashboardLb;

    @FindBy(css = "a[href='/web/index.php/pim/viewMyDetails']")
    WebElementFacade myInfoMenu;

    @FindBy(css = "a[href='/web/index.php/performance/viewPerformanceModule']")
    WebElementFacade performanceMenu;

    @FindBy(css = "a[href='/web/index.php/directory/viewDirectory']")
    WebElementFacade directoryMenu;

    @FindBy(css = "a[href='/web/index.php/maintenance/viewMaintenanceModule']")
    WebElementFacade maintenanceMenu;

    public String getHeaderLabe() {
        return dashboardLb.getText();
    }

    public void clickMyInfo() {
        clickOn(myInfoMenu);
    }

    public void clickPerformance() {
        clickOn(performanceMenu);
    }

    public void clickDirectory() {
        clickOn(directoryMenu);
    }

    public void clickMaintenance() {
        clickOn(maintenanceMenu);
    }

}
