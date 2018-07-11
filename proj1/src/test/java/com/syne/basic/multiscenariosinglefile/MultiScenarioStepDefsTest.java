package com.syne.basic.multiscenariosinglefile;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/syne/multiscenariosinglefile/"},
		glue = {"com/syne/basic/multiscenariosinglefile/"},
		monochrome = true,
		//dryRun = true,
		plugin = {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report"  + 1987+".json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
		}
		
		)

public class MultiScenarioStepDefsTest {

	
}