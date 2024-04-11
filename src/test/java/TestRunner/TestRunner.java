package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\Features"},
		glue= {"StepDefinition"},
		tags="@Regression",
		dryRun=false
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
