package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BaseClass;

public class Hooks {
	
	@Before
	public static void setup()
	{
		BaseClass.launchBrowser();
		System.out.println("browswer opened successfully");
	}
@After
	public static void teardown(){
		
		BaseClass.closeBrowser();
		System.out.println("browser closed");
	}
}
