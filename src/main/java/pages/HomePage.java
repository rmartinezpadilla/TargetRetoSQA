package pages;

import org.openqa.selenium.By;

public class HomePage {
	
	private static By txtBuscador = By.xpath("//input[@id='search']");
	private static By btnBuscador = By.xpath("//div[@class=\"SearchInput-eeyb4b-0 ieICLs\"]");
	//private static By btnBuscadorOLX = By.xpath("//button[@class='SearchInputButton-sc-1opoijs-0 eOzuAz']");
	private static By lblProducto;
	private static By h1ProductoEncontrado;
	
	public static By getLblProducto() {
		return lblProducto;
	}
	
	
	public static By getH1ProductoEncontrado() {
		return h1ProductoEncontrado;
	}


	public static void setH1ProductoEncontrado(String h1ProductoEncontrado) {
		HomePage.h1ProductoEncontrado = By.xpath("//span[contains(text(), '"+h1ProductoEncontrado+"')]");
	}


	public static void setLblProducto(String producto) {
		HomePage.lblProducto = By.xpath("//a[contains(text(), '"+producto+"')]");
		//HomePage.lblProducto = By.xpath("//span[contains(text(), '"+producto+"')]");
		//a[contains(text(),'Members Only Men’s Big and Tall Heavy Twill Iconic Racer Quilted Lining Jacket')]
		//HomePage.lblProducto = By.xpath("//a[contains(text(), '"+producto+"')]//ancestor::a");
		//HomePage.lblProducto = By.xpath("//a[contains(text(),'"+producto+"') and @aria-label='"+producto+"']");				
		//HomePage.lblProducto = By.xpath("//a[contains(@class, 'Link-sc-1khjl8b-0') and contains(@aria-label, '"+producto+"')]");
		
		
	}
	
	public static By getTxtBuscadorTARGET() {
		
		return txtBuscador;
	}
	
	public static By getBtnBuscadorTARGET() {
		return btnBuscador;
	}	
	
	
	
	
}
