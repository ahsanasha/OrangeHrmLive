package utilities;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
    public void mouseHoverByElement(WebElementFacade element) {
        Actions builder = new Actions(Serenity.getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(element);
        hoverOverLocationSelector.perform();
    }

}
