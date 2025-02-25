package orangeHrm.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import orangeHrm.ui.LinkFallidoUi;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static orangeHrm.ui.LinkFallidoUi.INPUT_CLAVE;
import static orangeHrm.ui.LinkFallidoUi.USERNAME_FIELD;

public class LinkCamposVaciosTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Enter.theValue("").into(USERNAME_FIELD));
        actor.attemptsTo( Enter.theValue("").into(INPUT_CLAVE));
        actor.attemptsTo(new Performable[]{Click.on(LinkFallidoUi.BOTON_INICIOSESION)});
    }

    public static LinkCamposVaciosTask LinkCamposVaciosTask()
    { return instrumented(LinkCamposVaciosTask.class);}
}
