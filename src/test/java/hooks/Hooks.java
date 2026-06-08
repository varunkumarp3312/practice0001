package hooks;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.BaseClass;
import utils.ScreenshotUtility;


public class Hooks {
	
	@Before
	public static void setup()
	{
		BaseClass.launchBrowser();
		System.out.println("browswer opened successfully");
	}
@After
public void teardown(Scenario scenario) throws IOException {

    if (scenario.isFailed() && BaseClass.driver != null) {

        ScreenshotUtility.captureScreenshot(scenario.getName());

        System.out.println("Screenshot captured");
    }

    BaseClass.closeBrowser();

    System.out.println("browser closed");
}
}
