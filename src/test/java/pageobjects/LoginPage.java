package pageobjects;

import models.SymphoniaUser;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BaseTest;
import utilities.SwitchUrl;
import utilities.WaitForUtils;

public class LoginPage extends PageObject {

    /*
    * tf is text field
    * btn is button
    *
    *
    * */

    private final WaitForUtils waitForUtils = new WaitForUtils();
    public final String LOGIN_PAGE = BaseTest.getBaseUrl() + "/web/index.php/auth/login";
    @FindBy(css = "input[name='username']")
    WebElementFacade userNameTf;
    @FindBy(css = "input[name='password']")
    WebElementFacade passTf;

    @FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElementFacade loginBtn;

    public void openOrangeHrmWeb(){

        openUrl(LOGIN_PAGE);
    }

    public void inputUserName(){
        waitFor(ExpectedConditions.urlToBe(LOGIN_PAGE));
        typeInto(userNameTf, BaseTest.getValidUser());
    }

    public void inputPass(){
        typeInto(passTf, BaseTest.getValidPassword());
    }

    public void clickOnLogin(){
        clickOn(loginBtn);
    }
}