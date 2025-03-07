package orangeHrm.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import orangeHrm.ui.LinkFallidoUi;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static orangeHrm.ui.LinkFallidoUi.*;
import static orangeHrm.ui.LinkFallidoUi.TXT_CONFIRM_PASSWORD;

public class LinkDatosUsuarioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(new Performable[]{Click.on(LinkFallidoUi.BOTON_AGREGARUSUARIO)});
        actor.attemptsTo(new Performable[]{Click.on(LinkFallidoUi.OPCION_USERROLE)});
        actor.attemptsTo(new Performable[]{Click.on(LinkFallidoUi.TXT_SEL_ADMIN)});
        actor.attemptsTo(new Performable[]{Click.on(LinkFallidoUi.OPCION_STATUS)});
        actor.attemptsTo(new Performable[]{Click.on(LinkFallidoUi.TXT_SEL_ENABLED)});
        actor.attemptsTo( Enter.theValue("83andres").into(TXT_EMPLOYEE_NAME));
        actor.attemptsTo( Enter.theValue("1andressegura123").into(TXT_USERNAME));
        actor.attemptsTo( Enter.theValue("andres123").into(TXT_PASSWORD));
        actor.attemptsTo( Enter.theValue("andres123").into(TXT_CONFIRM_PASSWORD));

    }
    public static LinkDatosUsuarioTask DatosUser()
    { return instrumented(LinkDatosUsuarioTask.class);}
}
