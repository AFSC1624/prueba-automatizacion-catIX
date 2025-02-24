package orangeHrm.stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import orangeHrm.questions.ValidacionPasswordVacio;
import orangeHrm.questions.ValidacionUsuarioVacio;
import orangeHrm.tasks.LinkCamposVaciosTask;
import orangeHrm.tasks.LinkUserVacioTask;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefLogCampVacios {


    @Managed(driver = "chrome")

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }

    @Given("Esta en la pagina de Login")
    public void estaEnLaPaginaDeLogin() {
    }

    @When("El usuario deja los campos {string} y {string} vacios")
    public void elUsuarioDejaLosCamposYVacios(String string, String string2) {
        theActorInTheSpotlight().attemptsTo(
                LinkCamposVaciosTask.LinkCamposVaciosTask()
        );
    }
    @Then("Debe aparecer el mensaje {string} debajo del campo Usuario  and mensaje {string} del campo Password")
    public void debeAparecerElMensajeDebajoDelCampoUsuarioAndMensajeDelCampoPassword(String string, String string2) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        theActorInTheSpotlight().should(seeThat("La respuesta fue: ",ValidacionUsuarioVacio.assertion(),Matchers.equalTo(true)));
        theActorInTheSpotlight().should(seeThat("La respuesta fue: ", ValidacionPasswordVacio.assertion(),Matchers.equalTo(true)));
        System.out.println("la prueba fue exitosa");
    }




    @After
    public void closeBrowser(){
        if(driver !=null){
            driver.quit();
        }
    }






}
