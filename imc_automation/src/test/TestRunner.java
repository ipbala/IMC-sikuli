import org.testng.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/features/", // Path to your feature files
    glue = "stepDefinations", // Package where your step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
}