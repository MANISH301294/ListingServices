package CucumberRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/java/feature",plugin ="html:target/CucumberReport/cucumber-report.html",glue = {"StepDefinition"})

public class TestRunner {


}
