package orangeHrm.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        tags = "@loginCamposVacios",
        glue = "orangeHrm.stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnerCamposVacios {
  }
