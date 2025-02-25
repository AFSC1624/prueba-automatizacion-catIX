package orangeHrm.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static orangeHrm.ui.ValidacionUserUi.MensajeErrorPassword;


public class ValidacionPasswordVacio implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade elementUsuario= MensajeErrorPassword.resolveFor(actor);
        String valPassword = String.valueOf(elementUsuario.getText());
        return valPassword.contains("Required");
    }
    public static Question<Boolean> assertion(){
        return  new ValidacionPasswordVacio();
    }
}
