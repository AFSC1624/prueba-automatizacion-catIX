package orangeHrm.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidacionUserUi {

    public static Target MensajeError = Target.the("mensajeerror")
            .located(By.xpath("//p[text()='Invalid credentials']"));
    public static Target MensajeErrorUsuario = Target.the("mensajeerrorUsuario")
                    .located(By.xpath("//span[text()='Required']"));
    public static Target MensajeErrorPassword = Target.the("mensajeerrorPassword")
            .located(By.xpath("//span[text()='Required']"));

}
