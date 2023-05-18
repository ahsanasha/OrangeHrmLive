package utilities;

import net.serenitybdd.core.pages.PageObject;

import java.util.Set;

public class SwitchUrl extends PageObject {

    /*
    * This method is used to move to new window
    *
    */

    public void switchUrl() {
        String parent_handle = getDriver().getWindowHandle();
        Set<String> handles = getDriver().getWindowHandles();
        for (String handle1 : handles)
            if (!parent_handle.equals(handle1)) {
                getDriver().switchTo().window(handle1);

            }
    }
}
