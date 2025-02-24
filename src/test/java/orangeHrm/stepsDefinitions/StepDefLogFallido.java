package orangeHrm.stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import orangeHrm.questions.ValidacionUsuario;
import orangeHrm.tasks.LinkClaveFallidaTask;
import orangeHrm.tasks.OpenUrlOhrmTask;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;




public class StepDefLogFallido {

    @Managed(driver = "chrome")

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }

    @Given("El usuario se ingresa en la página de login")
    public void elUsuarioSeIngresaEnLaPáginaDeLogin() {
        theActorCalled("user").wasAbleTo(
                OpenUrlOhrmTask.openBrowser());
    }


    @When("El usuario ingresa un {string} incorrecto y una {string} incorrecta")
    public void elUsuarioIngresaUnIncorrectoYUnaIncorrecta(String string, String string2) {
        theActorInTheSpotlight().attemptsTo(
                LinkClaveFallidaTask.loginUsuarioClave()
        );


    }


    @Then("Debe aparecer el mensaje {string}")
    public void debeAparecerElMensaje(String string) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        theActorInTheSpotlight().should(
                seeThat(
                        "La respuesta fue: ",
                        ValidacionUsuario.assertion(),
                        Matchers.equalTo(true)
                )
        );
        System.out.println("la prueba fue exitosa");

    }
    @After
    public void closeBrowser(){
        if(driver !=null){
            driver.quit();
        }
    }
}
