package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
	public static void waitforelement(WebDriver driver,By locators)
	{
		WebDriverWait wait= new WebDriverWait(driver , Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locators));
	}
	
	public static void waitForElementInvisible(WebDriver driver, By locator) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	

}
