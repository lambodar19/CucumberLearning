package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = {"C://Users//91900//IdeaProjects//CucumberLearning//Features//nop_Login.feature"},
        features = {".//Features/nop_Customers.feature"},
        glue = {"stepDefinitions"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty",
                 "html:target/cucumber-reports"}

)
public class TestRunner {
}
