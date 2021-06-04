package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/Comparar_Producto.feature",
		glue="stepdefinitions",
		snippets=SnippetType.CAMELCASE
		)
public class CompararProductoRunner {
		
}
