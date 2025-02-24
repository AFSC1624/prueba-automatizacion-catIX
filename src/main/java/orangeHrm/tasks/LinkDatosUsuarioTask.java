package orangeHrm.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import orangeHrm.ui.LinkFallidoUi;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LinkDatosUsuarioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

       actor.attemptsTo(new Performable[]{Click.on(LinkFallidoUi.CAMPO_USER_ROLE)});
        actor.attemptsTo(new Performable[]{Click.on(LinkFallidoUi.TXT_ADMIN)});

    }



    public static LinkDatosUsuarioTask DatosUser()
    { return instrumented(LinkDatosUsuarioTask.class);}





}
