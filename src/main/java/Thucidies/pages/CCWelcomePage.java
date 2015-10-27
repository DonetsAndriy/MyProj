package Thucidies.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

/**
 * Created by Andriy_Donets on 10/4/2015.
 */
public class CCWelcomePage extends PageObject {

    @FindBy(xpath = "//a[@class=\"logout\"]")
    public WebElementFacade logOutButton;

    public void isLinkLogOutPresnt() {
        element(logOutButton).shouldBeVisible();
    }
}
