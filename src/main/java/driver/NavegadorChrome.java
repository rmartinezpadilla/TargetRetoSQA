package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavegadorChrome {

	public static WebDriver driver;
	
	public static void ChromeWebDriver(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-infobars");		
		options.addArguments("--incognito");

		driver = new ChromeDriver(options);
		driver.get(url);
	}
	
}
