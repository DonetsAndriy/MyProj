package Thucidies.pages;

import net.thucydides.core.annotations.findby.FindBy;
        import net.thucydides.core.pages.PageObject;
        import net.thucydides.core.pages.WebElementFacade;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.Select;

        import java.util.List;

/**
 * Created by Andriy_Donets on 10/5/2015.
 */
public class LocationModule  extends PageObject {

    @FindBy(xpath = "//a[@class=\"btn btn-primary pull-right add-root-group\"]")
    public WebElementFacade addLocationGroup;
    @FindBy(xpath = ".//*[@id='timeZoneSelect']/a")
    public WebElementFacade openTimeZone;
    @FindBy(xpath = ".//*[@id='timeZoneSelect']/ul/li[2]/a")
    public WebElementFacade selectTimeZone;
    @FindBy(xpath = "//a[@title=\"Location\"]")
    public WebElementFacade openLocationModule;

    public void openLocationModule() {
        element(openLocationModule).click();
    }
    public void addLocationGroupButton() {
        element(addLocationGroup).click();
    }
    public void selectTimeZone() {
        element(openTimeZone).click();
        element(selectTimeZone).click();
    }
}
