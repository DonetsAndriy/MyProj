package Thucidies.jbehave;

import Thucidies.utils.RaedPropFile;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import net.thucydides.junit.runners.ThucydidesRunner;
//import org.jbehave.core.annotations.Given;
//import org.jbehave.core.annotations.Then;
//import org.jbehave.core.annotations.When;

import Thucidies.steps.EndUserSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import requirements.Application;

import java.io.IOException;
@RunWith(SerenityRunner.class)
@Story(Application.CCLogin.LoginCCCheck.class)
@WithTag("feature:Login")

public class DefinitionSteps {
   @Managed(driver = "firefox")
   public WebDriver webdriver;
    @Steps
    EndUserSteps endUser;
/*   @Before
    public void myTest()  throws Exception
    {
        System.setProperty("webdriver.ie.driver","./src/test/resources/chromedriver.exe");
       // System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\EpamProj1\\IdeaProjects\\untitled\\src\\test\\resources\\chromedriver.exe");
      // System.setProperty("webdriver.ie.driver","./src/test/resources/IEDriverServer.exe");
//        webdriver.manage().window().maximize();
//          book.start_browser();
    }*/
@Test
//@WithDriver("chrome")
    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }
    @Given("application login page")
    public void openLoginpage() {endUser.openLoginpage();}
    @When("press sign in button")
    public void login()throws IOException{

    endUser.fillInUsername();
      endUser.fillInPassword();
      endUser.pressSignInButton();
    }
    @Then("verify if user get into system")
    public void assertLoggedIn()
    {
     endUser.assertLoggedIn();
        endUser.selectZone();
    }
}
