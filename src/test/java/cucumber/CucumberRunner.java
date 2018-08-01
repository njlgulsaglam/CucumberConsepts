package cucumber;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/default-cucumber-reports",
				"json:target/cucumber.json"
		
		},
		features = {"/Users/nejlagulsaglam/eclipse-workspace/CucumberConsepts/src/test/resources/featuress/ContactConfirm.feature" }


)

public class CucumberRunner {

		}
			
			
