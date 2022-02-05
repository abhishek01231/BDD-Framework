package stepdefinition;

import org.openqa.selenium.By;

import customLib.base;
import io.cucumber.java.en.Given;

public class firsttest implements base{
	
	@Given("start browser")
	public void startbrowser() {
		DRIVER.get("http://www.google.com");
		DRIVER.findElement(By.xpath("//input[@name='q']")).sendKeys("test");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//DRIVER.findElements(By.xpath("")).size();
		String appID = DRIVER.findElement(By.xpath("//input[@name='q']")).getText();
		
		DRIVER.findElement(By.id(""));
	}
	
	
}
