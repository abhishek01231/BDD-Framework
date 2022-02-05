package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import customLib.DriverUtil;
import customLib.base;
import org.junit.Assert;

public class CPaymentsPOM implements base{
	
	private WebDriver DRIVER;
	
	public void startBrowser() {
		DriverUtil DRI = new DriverUtil();
		DRIVER= DRI.chromeSetup();
	}
	
	public void clickPayment() {
		DRIVER.findElement(By.xpath("//a[@id='aPayments']")).click();
	}
	
	public void enterFname(String fNAme) {
		DRIVER.switchTo().frame("iframePayments");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DRIVER.findElement(By.id("FirstName")).click();
		DRIVER.findElement(By.id("FirstName")).sendKeys(fNAme);
	}
	
	public void enterLname(String lNAme) {
		DRIVER.findElement(By.id("LastName")).click();
		DRIVER.findElement(By.id("LastName")).sendKeys(lNAme);
	}
	
	public void enterDOB(String DOB) {
		DRIVER.findElement(By.id("DOB")).click();
		DRIVER.findElement(By.id("DOB")).sendKeys(DOB);
	}
	
	public void clickNext() {
		DRIVER.findElement(By.xpath("//button[@id='btnNext-ls']")).click();
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickEdit() {
		DRIVER.findElement(By.xpath("//button[@id='btnEdit']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void clickConfirm() {
		DRIVER.findElement(By.xpath("//button[@id='btnConfirm']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clear() {
		DRIVER.findElement(By.xpath("//input[@id='txtPaymentAmount']")).clear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickPaymentamount() {
		DRIVER.findElement(By.xpath("//input[@id='txtPaymentAmount']")).sendKeys("1");
		try{
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_pay_card(){
		WebElement element = DRIVER.findElement(By.id("btnPayByCard"));
		JS_METHODS.scrollView(DRIVER, element);
		element.click();
	}
	
	public void payment_confirm_popup() {
		DRIVER.findElement(By.id("btnConfirmPC")).click();
	}
	
	public void click_newcard() {
		DRIVER.findElement(By.id("tabNewCard")).click();
		try{
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void enterCardnumber() {
		DRIVER.switchTo().frame("iframeHostedPayment");
		DRIVER.findElement(By.id("cardNumber")).sendKeys("4111111111111111");
	}
	
	public void sel_Value() {
		WebElement element = DRIVER.findElement(By.id("ddlExpirationMonth"));
		SEL_METHODS.selectByValue(element, "01");
	}
	
	public void sel_Value_year() {
		WebElement element = DRIVER.findElement(By.id("ddlExpirationYear"));
		SEL_METHODS.selectByValue(element, "25");
		try{
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enter_Cvv() {
		DRIVER.findElement(By.id("CVV")).sendKeys("486");
	}
	
	public void click_Make_payment() {
		WebElement element = DRIVER.findElement(By.xpath("//a[@onclick='ProcessTransaction();']"));
		JS_METHODS.scrollView(DRIVER, element);
		element.click();
		try{
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		DRIVER.switchTo().defaultContent();
		try{
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		DRIVER.switchTo().frame("iframePayments");
	}
	
	public void val_Mesage() {
		WebElement element = DRIVER.findElement(By.xpath("//div[text()='Payment receipt has been sent to registered email id anyoXXX@gru.net']"));
		Assert.assertEquals("Payment message is not showing", element.isDisplayed(),true);
	}
	
	public void val_Makeanotherpayment() {
		WebElement element = DRIVER.findElement(By.id("makeAnotherPayment"));
		Assert.assertEquals("Make another payment is displayed", element.isDisplayed(),true);
	}
	
	public void val_Printreceipt() {
		WebElement element = DRIVER.findElement(By.id("btnPrintReceipt"));
		Assert.assertEquals("Print Receipt is not displayed.", element.isDisplayed(),true);
	}
	
	public void valReviewpayment() {
		WebElement element = DRIVER.findElement(By.xpath("//li[a[text()='REVIEW AND MAKE PAYMENT']]"));
		Assert.assertEquals("Review and Make payment is visible.", element.isDisplayed(),true);
	}
}
