package steps;

import static org.junit.Assert.assertEquals;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.By;
import driver.NavegadorChrome;
import pages.HomePage;
import utils.Excel;

public class HomePageSteps {

	
	
	private static ArrayList<Map<String, String>> lecturaExcel = new ArrayList<Map<String,String>>();

	public void escribirEnTexto(By elemento, String texto) {
		boolean validarElemento = false;	
			while (validarElemento == false) {			
				try {
					Thread.sleep(2000);										
					NavegadorChrome.driver.findElement(elemento).sendKeys(texto);
					validarElemento = true;
				} catch (Exception e) {
					
				}			
		}		
	}
	
	
	public void limpiartxt(By elemento) {
		boolean validarElemento = false;
		Robot robot = null;
			while (validarElemento == false) {
				try {		
					robot=new Robot();									
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);					
					NavegadorChrome.driver.findElement(elemento).click();
					validarElemento = true;
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		
	}
	

	public void clicEnElemento(By elemento) {
		boolean validarElemento = false;
			while (validarElemento == false) {
				try {
					NavegadorChrome.driver.findElement(elemento).submit();					
					validarElemento = true;
				} catch (Exception e) {
					
				}			
			}		
	}
	
	
	public String  obtenerTextoDeElemento(By elemento) {
		boolean validarElemento = false;
		String textElemento = "";
		
		while (validarElemento == false) {
			try {
				textElemento = NavegadorChrome.driver.findElement(elemento).getText();
				validarElemento = true;
			} catch (Exception e) {
				
			}			
		}
		return textElemento;
	}
	
	public void validarTexto(By elemento, String texto) {
		boolean validarTexto = false;
		
		if(obtenerTextoDeElemento(elemento).contains(texto)) {
			validarTexto = true;
			
		}
		assertEquals(true, validarTexto);	
	}
	
	
	public void clicEnProductoEncontrado(By elemento) {
		
		boolean validarElemento = false;
		while (validarElemento == false) {
			try {
				NavegadorChrome.driver.findElement(elemento).click();				
				validarElemento = true;
			} catch (Exception e) {
				
			}			
		}	
		
	}
	
	public void buscarProductoEnTARGET() {
			 
		try {
				lecturaExcel = Excel.readExcel("src\\main\\resources\\Productos.xlsx", "Productos");
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for (int i = 0; i < lecturaExcel.size(); i++) {
					
				escribirEnTexto(HomePage.getTxtBuscadorTARGET(), lecturaExcel.get(i).get("Productos"));
				clicEnElemento(HomePage.getTxtBuscadorTARGET());							
				HomePage.setLblProducto(lecturaExcel.get(i).get("Productos"));	
				System.out.println(NavegadorChrome.driver.getCurrentUrl());
				clicEnProductoEncontrado(HomePage.getLblProducto());
				HomePage.setH1ProductoEncontrado(lecturaExcel.get(i).get("Productos"));
				validarTexto(HomePage.getH1ProductoEncontrado(), lecturaExcel.get(i).get("Productos"));
				limpiartxt(HomePage.getTxtBuscadorTARGET());
				
			}
	            
	}
}
