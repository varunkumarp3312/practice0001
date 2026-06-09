package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver ; 
	
	public static void launchBrowser(){
		ConfigReader.loadProperties();
		
		String browser = ConfigReader.getProperty("browser");
		
		if (browser == null) {
		    throw new RuntimeException("browser value is missing in config.properties");
		}
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().clearDriverCache().setup();
		    driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(ConfigReader.getProperty("url"));
			
		
	}
	
	public static void closeBrowser()
	 {
		if(driver !=null)
			
	 {
		 driver.quit();
		driver = null;
	 }
		
	}

}
