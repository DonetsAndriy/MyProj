package Thucidies.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

/**
 * Created by Andriy_Donets on 10/6/2015.
 */
public class ProductFeeds extends PageObject {
    @FindBy(xpath = "//a[@title=\"Stock & Price\"]")
    public WebElementFacade productFeedsTab;

}
