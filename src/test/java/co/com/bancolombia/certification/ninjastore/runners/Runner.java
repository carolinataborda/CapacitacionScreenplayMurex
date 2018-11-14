package co.com.bancolombia.certification.ninjastore.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "co.com.bancolombia.",
		snippets = SnippetType.CAMELCASE
		
)

public class Runner {
	
	public Runner() {
		
	}

}

