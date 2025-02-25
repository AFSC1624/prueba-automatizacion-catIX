package orangeHrm.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        tags = "@loginFallido",
        glue = "orangeHrm.stepsDefinitions",
        plugin = {
                "pretty",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber-html-report.html"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class RunnerLogFallido {

}
