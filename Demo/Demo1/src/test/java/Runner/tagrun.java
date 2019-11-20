package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\tags.feature",glue= {"StepDef"},plugin= {"html:target/cucumber3.html"}, tags= {"Sanitytest"})


public class tagrun {

}
