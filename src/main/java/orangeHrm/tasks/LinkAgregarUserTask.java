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

public class LinkAgregarUserTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(new Performable[]{Click.on(LinkFallidoUi.BOTON_AGREGARUSUARIO)});
    }

    public static LinkAgregarUserTask AgregarUser()
    { return instrumented(LinkAgregarUserTask.class);}





}
