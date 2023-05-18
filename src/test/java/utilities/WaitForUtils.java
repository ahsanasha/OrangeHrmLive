package utilities;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WaitForUtils extends PageObject {

    public void waitUntilPresenceAndVisibilityElementLocated(By selector) {
        waitFor(ExpectedConditions.presenceOfElementLocated(selector));
        waitFor(ExpectedConditions.visibilityOfElementLocated(selector));
    }

    public void waitUntilVisibilityAndClickableElement(WebElementFacade elementFacade) {
        waitFor(ExpectedConditions.visibilityOf(elementFacade));
        waitFor(ExpectedConditions.elementToBeClickable(elementFacade));
    }

    public void waitUntilPresenceAndVisibilityAndClickableElementLocated(By selector) {
        waitFor(ExpectedConditions.presenceOfElementLocated(selector));
        waitFor(ExpectedConditions.visibilityOfElementLocated(selector));
        waitFor(ExpectedConditions.elementToBeClickable(selector));
    }
}
