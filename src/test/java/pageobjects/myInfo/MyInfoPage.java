package pageobjects.myInfo;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utilities.BaseTest;
import utilities.WaitForUtils;

public class MyInfoPage extends PageObject {
    /*
     * tf is text field
     * btn is button
     *
     *
     * */

    private final WaitForUtils waitForUtils = new WaitForUtils();

    @FindBy(css = "img[src='/web/index.php/pim/viewPhoto/empNumber/7']")
    WebElementFacade personalImg;

    public boolean ImgPersonal(){
        return personalImg.isDisplayed();
    }
}
