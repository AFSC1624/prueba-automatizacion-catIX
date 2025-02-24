package orangeHrm.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static orangeHrm.ui.ValidacionUserUi.MensajeErrorUsuario;

public class ValidacionUsuarioVacio implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade elementUsuario= MensajeErrorUsuario.resolveFor(actor);
        String valUsuario = String.valueOf(elementUsuario.getText());
        return valUsuario.contains("Required");
    }
    public static Question<Boolean> assertion(){
        return  new ValidacionUsuarioVacio();
    }


}
