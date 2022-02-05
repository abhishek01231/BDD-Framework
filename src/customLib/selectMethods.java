package customLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import support.Log;

public class selectMethods {
	
	private static selectMethods object = null;
	
	private selectMethods() {
		
	}
	
	public static selectMethods getInstance() {
		if(object == null) {
			object = new selectMethods();
		}
		return object;
	}
	
	public void selectByVisibleText(WebElement element, String data) {
		/****************************************************************************************************
		 * /** Des: This function is used to select By Visible Text
		 * 
		 * /
		 ****************************************************************************************************/
		try {
			Log.info("*Try to select by visible text*");
			Select selectAction = new Select(element);
			selectAction.selectByVisibleText(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectByValue(WebElement element, String data) {
		/****************************************************************************************************
		 * /** Des: This function is used to select By Value
		 * 
		 * /
		 ****************************************************************************************************/
		try {
			Select selectAction = new Select(element);
			selectAction.selectByValue(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectByIndex(WebElement element, int data) {
		/****************************************************************************************************
		 * /** Des: This function is used to select By Index
		 * 
		 * /
		 ****************************************************************************************************/
		try {
			Select selectAction = new Select(element);
			selectAction.selectByIndex(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
