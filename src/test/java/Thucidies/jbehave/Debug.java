package Thucidies.jbehave;
import net.thucydides.core.ThucydidesSystemProperty;

import net.thucydides.jbehave.ThucydidesJUnitStories;

public class Debug extends ThucydidesJUnitStories {

    public Debug() {

       // System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");

        runThucydides().withDriver("chrome");

        runThucydides().withProperty(ThucydidesSystemProperty.THUCYDIDES_USE_UNIQUE_BROWSER).setTo(true);

        findStoriesCalled("TestStory.story");

    }

}