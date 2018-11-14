package co.com.bancolombia.certification.bizagi.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.bizagi.userinterface.PageComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Login implements Task{
	
	private WebDriver hisBrowser;
	
	public Login( WebDriver hisBrowser) {
	
		this.hisBrowser = hisBrowser;
		this.hisBrowser.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PageComponents.ACCOUNT_BUTTON),
				Click.on(PageComponents.SELECT_LOGIN),
				Enter.theValue("fperezupegui@gmail.com").into(PageComponents.USER),
				Enter.theValue("12345").into(PageComponents.PASSWORD),
				Click.on(PageComponents.LOGIN_BUTTON));
	}

	public static Login into(WebDriver hisBrowser) {
		return instrumented(Login.class, hisBrowser);
	}

}
