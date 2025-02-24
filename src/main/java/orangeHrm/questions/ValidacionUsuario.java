package orangeHrm.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static orangeHrm.ui.ValidacionUserUi.MensajeError;


public class ValidacionUsuario  implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade elementUsuario= MensajeError.resolveFor(actor);
        String valUsuario = String.valueOf(elementUsuario.getText());
        return valUsuario.contains("Invalid credentials");
    }
    public static Question<Boolean> assertion(){
        return  new ValidacionUsuario();
    }

}
