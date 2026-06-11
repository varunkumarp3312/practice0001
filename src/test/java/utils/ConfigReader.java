package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	static Properties prop;
	
	public static void loadProperties() {
		
		prop = new Properties();
		
		try {
			
			String configPath = System.getenv("CONFIG_FILE");

//			FileInputStream fis =
//			        new FileInputStream(configPath);//env setup in jenkins
			
			FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");//totest in local
			prop.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getProperty(String key)
	{
		return prop.getProperty(key);
	}
	

}
