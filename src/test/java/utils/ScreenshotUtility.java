package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtility {
	
	public static void captureScreenshot( String filename) throws IOException
	{
		
		if (BaseClass.driver == null) {
	        System.out.println("Driver is null, screenshot skipped");
	        return;
	    }
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("screenshottest/" + filename + ".png");
		
		 FileUtils.copyFile(source, destination);
		
	}

}
