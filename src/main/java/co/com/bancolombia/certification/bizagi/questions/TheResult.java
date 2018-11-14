package co.com.bancolombia.certification.bizagi.questions;

import co.com.bancolombia.certification.bizagi.userinterface.PageComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PageComponents.DELETE_BUTTON).viewedBy(actor).asString();
	}

	public static TheResult is() {
		
		return new TheResult();
	}

}
