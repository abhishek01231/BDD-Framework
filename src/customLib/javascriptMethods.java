package customLib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptMethods {
	
	private static javascriptMethods object = null;
	
	private javascriptMethods() {
		
	}
	
	public static javascriptMethods getInstance() {
		if(object == null) {
			object = new javascriptMethods();
		}
		return object;
	}
	
	public void scrollView(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

}
