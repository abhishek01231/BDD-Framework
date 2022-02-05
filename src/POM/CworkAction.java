package POM;

import org.openqa.selenium.By;

import customLib.base;

public class CworkAction implements base {
	//*[@id="aWorkAction"]
	public void Clickworkaction() {
		DRIVER.findElement(By.xpath("//*[@id=\"aWorkAction\"]")).click();
	}
	public void enterFirstname(String text) {
		DRIVER.findElement(By.xpath("//*[@id=\"AppointmentTheme_ThemeControlID_SearchPaymentPlan_FirstName\"]")).click();
		DRIVER.findElement(By.xpath("//*[@id=\"AppointmentTheme_ThemeControlID_SearchPaymentPlan_FirstName\"]")).sendKeys(text);
	}
	
	public void enterLastname(String text) {
		DRIVER.findElement(By.xpath("//*[@id=\"AppointmentTheme_ThemeControlID_SearchPaymentPlan_LastName\"]")).click();
		DRIVER.findElement(By.xpath("//*[@id=\"AppointmentTheme_ThemeControlID_SearchPaymentPlan_LastName\"]")).sendKeys(text);
	}
	
	public void enterdate(String text) {
		DRIVER.findElement(By.xpath("//*[@id=\"AppointmentTheme_ThemeControlID_SearchPaymentPlan_DOB\"]")).click();
		DRIVER.findElement(By.xpath("//*[@id=\"AppointmentTheme_ThemeControlID_SearchPaymentPlan_DOB\"]")).sendKeys(text);
	}
	public void clickNext() {
		DRIVER.findElement(By.xpath("//*[@id=\"AppointmentTheme_ThemeControlID_SearchPaymentPlan_btnUserSearch\"]/span/span")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}public void clickGo() {
	DRIVER.findElement(By.xpath("//*[@id=\"AppointmentTheme_ThemeControlID_SearchPaymentPlan_btnOK\"]/span")).click();
}
	public void clickPatientcommunication() throws InterruptedException {
		Thread.sleep(3000);
		DRIVER.findElement(By.xpath("//*[@id=\"lnkManageCommunication\"]")).click();
		
	

	}public void Paymenthistory() throws InterruptedException {
		Thread.sleep(3000);
		DRIVER.findElement(By.xpath("//*[@id=\"lnkPayHitory\"]")).click();
		
	

	}
	}
