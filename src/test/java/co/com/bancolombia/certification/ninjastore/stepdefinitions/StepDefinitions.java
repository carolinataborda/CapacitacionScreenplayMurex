package co.com.bancolombia.certification.ninjastore.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class StepDefinitions {
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor santiago = Actor.named("Santiago");
	
	@Before
	public void setUp() throws InterruptedException {
		santiago.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().window().maximize();
		hisBrowser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	

}
