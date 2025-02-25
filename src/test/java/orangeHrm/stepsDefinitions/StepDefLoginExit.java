package orangeHrm.stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import orangeHrm.tasks.*;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class StepDefLoginExit {

    @Managed(driver = "chrome")

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }
    @Given("el usuario accede a la página de login")
    public void elUsuarioAccedeALaPáginaDeLogin() {
        theActorCalled("user").wasAbleTo(
                OpenUrlOhrmTask.openBrowser());
    }

    @When("el usuario ingresa un nombre de usuario y contraseña válidos")
    public void elUsuarioIngresaUnNombreDeUsuarioYContraseñaVálidos() {
        theActorCalled("user").wasAbleTo(
                LinkExitosoTask.LinkExitoso());
    }




    @When("dar click en la parte izquierda en el campo de Admin va a añadir un nuevo usuario")
    public void darClickEnLaParteIzquierdaEnElCampoDeAdminVaAAñadirUnNuevoUsuario() {
        theActorCalled("user").wasAbleTo(
                LinkAgregarUserTask.AgregarUser());
    }




    @When("Registrar userrole {string} Status {string} Emmployee name {string} Username {string} Password {string} confirmacion Password {string}")
    public void registrarUserroleStatusEmmployeeNameUsernamePasswordConfirmacionPassword(String string, String string2, String string3, String string4, String string5, String string6) {
        theActorCalled("user").wasAbleTo(
                LinkDatosUsuarioTask.DatosUser());
    }



    @When("Dar click boton save")
    public void darClickBotonSave() {
        theActorCalled("user").wasAbleTo(
                LinkGuardarUserTask.GuardarUser());
    }


    @Then("Usuario Creado")
    public void usuarioCreado() {
    }

    @After
    public void closeBrowser(){
        if(driver !=null){
            driver.quit();
        }
    }
}
