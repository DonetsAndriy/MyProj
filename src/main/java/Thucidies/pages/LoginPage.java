package Thucidies.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

/**
 * Created by Andriy_Donets on 10/4/2015.
 */
@DefaultUrl("https://qahint.crplatform.net/")

public class LoginPage extends PageObject {
    @FindBy(id = "username")
    public WebElementFacade filledUsername;
    @FindBy(id = "password")
    public WebElementFacade filledPassword;
    @FindBy(xpath = "//input[@type=\"submit\"]")
    public WebElementFacade pressSignInButton;


    public void fillInUsername(String UserName) {

        enter(UserName).into(filledUsername);
    }

    public void fillInPassword(String UserPass) {

        enter(UserPass).into(filledPassword);
    }

    public void pressSignInButton() {
        element(pressSignInButton).click();

    }


}
