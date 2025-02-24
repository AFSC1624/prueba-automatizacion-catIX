package orangeHrm.stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import orangeHrm.questions.ValidacionUsuario;
import orangeHrm.questions.ValidacionUsuarioVacio;
import orangeHrm.tasks.LinkClaveFallidaTask;
import orangeHrm.tasks.LinkUserVacioTask;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefLogUserVacio {

    @Managed(driver = "chrome")

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }


    @Given("El usuario ingresa solo el {string} correcto")
    public void elUsuarioIngresaSoloElCorrecto(String string) {
        theActorInTheSpotlight().attemptsTo(
                LinkUserVacioTask.loginUsuarioClave()
        );
    }


    @When("El campo usuario esta vacio")
    public void elCampoUsuarioEstaVacio() {

    }


    @Then("Debe aparecer el mensaje {string} debajo del campo Usuario")
    public void debeAparecerElMensajeDebajoDelCampoUsuario(String string) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        theActorInTheSpotlight().should(
                seeThat(
                        "La respuesta fue: ",
                        ValidacionUsuarioVacio.assertion(),
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
