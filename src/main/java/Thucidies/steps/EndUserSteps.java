package Thucidies.steps;

import Thucidies.pages.CCWelcomePage;
import Thucidies.pages.DictionaryPage;
import Thucidies.pages.LocationModule;
import Thucidies.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static ch.lambdaj.Lambda.join;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import Thucidies.utils.RaedPropFile;

import java.io.IOException;

public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;
    LoginPage  loginPage;
    CCWelcomePage cCWelcomePage;
    LocationModule locationModule;


    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
    @Step
    public void openLoginpage() {
        loginPage.open();
        getDriver().navigate().refresh();

    }

    @Step
    public void fillInUsername()throws IOException {
    loginPage.fillInUsername(RaedPropFile.PropValue("userName"));
    }
    @Step
    public void fillInPassword() throws IOException {
        loginPage.fillInPassword(RaedPropFile.PropValue("passWord"));
    }
    @Step
    public void pressSignInButton() {
        loginPage.pressSignInButton();
    }
    @Step
    public void assertLoggedIn() { cCWelcomePage.isLinkLogOutPresnt();
    }
    @Step
    public void selectZone() {
        locationModule.openLocationModule();
        locationModule.addLocationGroupButton();
        locationModule.selectTimeZone();
    }
}