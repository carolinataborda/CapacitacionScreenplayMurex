package co.com.bancolombia.certification.bizagi.tasks;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import co.com.bancolombia.certification.bizagi.userinterface.PageComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class AddAddress implements Task {
		
	private WebDriver hisBrowser;
	
	public AddAddress(WebDriver hisBrowser) {
		this.hisBrowser = hisBrowser; 
		this.hisBrowser.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(PageComponents.ADDRESS_BOOK),
				Click.on(PageComponents.NEW_ADDRESS),
				Enter.theValue("pepito").into(PageComponents.FIRSTNAME),
				Enter.theValue("perez").into(PageComponents.LASTNAME),
				Enter.theValue("calle 123").into(PageComponents.ADDRESS),
				Enter.theValue("Medellin").into(PageComponents.CITY),
				Enter.theValue("000000").into(PageComponents.POSTCODE),
				Click.on(PageComponents.COUNTRY),
				Click.on(PageComponents.SELECT_COUNTRY),
				Click.on(PageComponents.REGION),
				Click.on(PageComponents.SELECT_REGION),
				Click.on(PageComponents.YES_BUTTON),
				Click.on(PageComponents.CONTINUE_BUTTON));
		
	}
	
	public static AddAddress inRequests(WebDriver hisBrowser) {
		return instrumented(AddAddress.class, hisBrowser); 				
	}
	

}
