package customLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import support.ExecuteTestcase;
import support.Log;

public class navigateMethods {
	
	private static navigateMethods object = null;
	
	private navigateMethods() {
		
	}
	
	public static navigateMethods getInstance() {
		if(object == null) {
			object = new navigateMethods();
		}
		return object;
	}
	
	
	public void navigateTo(WebDriver DRIVER, String data) {
		/****************************************************************************************************
		 * /** Des: This function is used to navigate to BASE_URL /
		 ****************************************************************************************************/
		try {
			DRIVER.get(data);
		} catch (Exception e) {
		}
	}
}
