package StepDefinitions;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesWithBackground/BackgroundDemo.feature", 
glue= {"StepsForBackground"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports","json:target/cucumber.json"}
)
public class TestRunnerForBackground {

}
