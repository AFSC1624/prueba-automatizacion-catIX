package orangeHrm.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import orangeHrm.ui.LinkFallidoUi;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class LinkAgregarUserTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(new Performable[]{Click.on(LinkFallidoUi.TXT_ADMIN)});
    }

    public static LinkAgregarUserTask AgregarUser()
    { return instrumented(LinkAgregarUserTask.class);}
}
