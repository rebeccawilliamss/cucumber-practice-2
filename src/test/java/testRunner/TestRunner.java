package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@windowsU",
        features = {"classpath:features"},
        glue = {"classpath:stepDefinitions"},
        plugin = {"pretty", "html:target/reports"},
        monochrome = true
)

public class TestRunner {
}

/** Ensure Maven is installed in Environment Variables to
 * run tests from cmd.
 */
