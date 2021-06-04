package stepdefinitions;

import org.junit.After;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import driver.NavegadorChrome;
import net.thucydides.core.annotations.Steps;
import steps.HomePageSteps;


public class CompararProductoStepDefinitions {

	@Steps
	HomePageSteps HomePageSteps = new HomePageSteps();
	
	@After
	public void After() {
		
	}
	
	@Before
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");				
		
							
	}
	@Given("^que Ruben quiere buscar un producto$")
	public void que_Ruben_quiere_buscar_un_producto() {
		NavegadorChrome.ChromeWebDriver("https://www.target.com/");	
	   
	}

	@When("^busque el producto$")
	public void busque_el_producto() {
		HomePageSteps.buscarProductoEnTARGET();
		
				
	}

	@Then("^se valida que el producto exista$")
	public void se_valida_que_el_producto_exista() {
		NavegadorChrome.driver.quit();
	}

	
	
}
