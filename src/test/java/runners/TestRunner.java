package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "classpath:features",
		glue = "stepdefinations",
		tags = "@landingPageTitle",
		dryRun=false,
		strict = true,
		monochrome = true,
		plugin = {"pretty",
					"html:target/html/",
					"json:target/json/file.json",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		)

public class TestRunner {

}
