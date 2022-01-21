package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "/Users/rashidulhaque/eclipse-workspace/TFT_BDDPOM_framework/src/test/java/features",
                    glue = "stepDefinations",
monochrome = true,
plugin = {"pretty", "html:target/Html report/cucumberReport.html", "json:target/Json report/jsonReport"}

)
public class Testrunner {
	
	

}
