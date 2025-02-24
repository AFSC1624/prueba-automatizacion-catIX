package orangeHrm.ui;


import io.appium.java_client.pagefactory.bys.builder.ByChained;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LinkFallidoUi {


    public static  Target USERNAME_FIELD = Target.the("campo username")
            .located(By.name("username"));

    public static Target INPUT_CLAVE=Target.the("campo Clave")
            .located(By.name("password"));

    public static Target BOTON_INICIOSESION=Target.the("Inicio de Sesion")
            .located(By.cssSelector("button[type='submit']"));

    public static Target BOTON_AGREGARUSUARIO=Target.the("Agregar User")
            .located(By.xpath("//span[text()='Admin']"));

   // By user_role = new ByChained(By.xpath("//label[text()='User Role']"), By.xpath("//div[text()='-- Select --']"));
  //  By dropdownlist_UserRole = By.xpath("//div[text()='-- Select --']");


    public static Target CAMPO_USER_ROLE=Target.the("Agregar User")
            .located(By.xpath("//div[text()='-- Select --']"));

    public static Target TXT_ADMIN=Target.the("Agregar User")
            .located(By.xpath("//div[text()='Admin']"));



}
