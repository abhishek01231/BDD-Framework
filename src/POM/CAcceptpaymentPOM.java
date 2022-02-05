package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import customLib.DriverUtil;
import customLib.base;

public class CAcceptpaymentPOM implements base{
	 
	public void navigateTo() throws InterruptedException {
		//DRIVER.get("https://checkinasystgreen712.hacheckinasyst.com/Dashboard/Login.aspx");
		DRIVER.get("https://www.google.com");
		Thread.sleep(4000);
	}
	
	public void enterUserText(String text) {
		DRIVER.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys(text);
	}
	
	public void enterPassText(String text) {
		DRIVER.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(text);
	}
	
	public void clickLogin() {
		DRIVER.findElement(By.xpath("//a[@id='btnLogin']")).click();
		try {
			Thread.sleep(21000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickPayment() {
		DRIVER.findElement(By.xpath("//a[@id='aPayments']")).click();
	}
}
