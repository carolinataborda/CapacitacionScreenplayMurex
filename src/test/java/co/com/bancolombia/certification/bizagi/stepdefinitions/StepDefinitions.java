package co.com.bancolombia.certification.bizagi.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.bizagi.questions.TheResult;
import co.com.bancolombia.certification.bizagi.tasks.AddAddress;
import co.com.bancolombia.certification.bizagi.tasks.Login;
import co.com.bancolombia.certification.bizagi.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.bizagi.userinterface.HomePage;
import co.com.bancolombia.certification.bizagi.userinterface.PageComponents;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;

public class StepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor santiago = Actor.named("Santiago");
	private HomePage homePage;
	
	@Before
	public void setUp() throws InterruptedException {
		santiago.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().window().maximize();
		hisBrowser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Given("^that Santiago wants to add a new address$")
	public void thatSantiagoWantsToAddANewAddress() throws Exception {
		
		santiago.wasAbleTo(OpenTheBrowser.on(homePage),
				Login.into(hisBrowser));

	}

	@When("^he needs to receive the orders$")
	public void heNeedsToReceiveTheOrders() throws Exception {
		
		santiago.attemptsTo(
				AddAddress.inRequests(hisBrowser)); 
	}

	@Then("^he can delete the address$")
	public void heCanDeleteTheAddress() throws Exception {
		santiago.should(seeThat(TheResult.is(), equalTo("Delete")));
		santiago.attemptsTo(Click.on(PageComponents.DELETE_BUTTON));
	}

} 
