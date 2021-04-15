package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features ="src/test/java/lan/com/test.feature",
        glue = "seleniumcode",
        tags ={"@test1"}

)

public class testrunner {
}

