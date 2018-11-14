package co.com.bancolombia.certification.bizagi.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "co.com.bancolombia.certification.bizagi.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		
)

public class NinjaStoreRunner {
	
	public NinjaStoreRunner() {
		
	}

}
