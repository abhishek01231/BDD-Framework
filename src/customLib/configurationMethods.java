package customLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configurationMethods {
	
	private static configurationMethods object = null;
	private Properties prop = null;
	
	private configurationMethods() {
		
	}
	
	public static configurationMethods getInstance() {
		if(object == null) {
			object = new configurationMethods();
		}
		return object;
	}
	
	public void readPropertyFile() {
		if(prop ==null) {
			prop = new Properties();
			try {
				InputStream input = configurationMethods.class.getResourceAsStream("/config/config.properties");
				prop.load(input);
				input.close();
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 
	 * @param key
	 *  String : read Key value from properties file
	 * @return
	 */
	
	public String getPropertyKey(String key) {
		readPropertyFile();
		return prop.getProperty(key);
	}

}
