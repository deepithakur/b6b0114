package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\parameterization.feature",glue= {"StepDef"},plugin= {"html:target/cucumber2.html"})

public class runnn {

}
