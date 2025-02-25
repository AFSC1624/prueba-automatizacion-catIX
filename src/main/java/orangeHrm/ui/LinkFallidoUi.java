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

    public static Target TXT_ADMIN=Target.the("Agregar User")
            .located(By.xpath("//span[text()='Admin']"));

//*[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button




    public static Target BOTON_AGREGARUSUARIO=Target.the("BOTON AGREGAR USUARIO")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));


    public static Target OPCION_USERROLE=Target.the("Agregar User")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));


    public static Target TXT_SEL_ADMIN=Target.the("Agregar User")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]"));


    public static Target OPCION_STATUS=Target.the("Agregar User")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));

    public static Target TXT_SEL_ENABLED=Target.the("Agregar User")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]"));

    public static Target TXT_EMPLOYEE_NAME=Target.the("texto nombre empleado")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));


    public static Target TXT_USERNAME=Target.the("texto username")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));

    public static Target TXT_PASSWORD=Target.the("texto password")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));

    public static Target TXT_CONFIRM_PASSWORD=Target.the("texto password")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));


    public static Target BOTON_SAVE=Target.the("guardar")
            .located(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));



}
