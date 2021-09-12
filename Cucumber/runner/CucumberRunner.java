package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features/F02_CreateLead.feature",
				 glue="steps",
				 monochrome = true,
				 publish = true
				// tags="@functional" // to execute all the functional test cases
				// tags = "@smoke or @regression" // to execute all the smoke and regression testcases
				// tags = "@functional and @regression" // to execute all the testcases having @functional and @regression
				// tags = "@createlead"
				// tags = "not @regression" // to execute all the test cases except @regression
				 )
public class CucumberRunner extends BaseClass{
	

}
