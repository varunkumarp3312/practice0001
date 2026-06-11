package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	static Properties prop;
	
	public static void loadProperties() {
		
		prop = new Properties();
		
		try {
			
			String configPath = System.getenv("CONFIG_FILE");

			FileInputStream fis =
			        new FileInputStream(configPath);
			
//			FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
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
