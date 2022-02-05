package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import customLib.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Appointment implements base {
	
	@Given("User wants to navigate appointment page")
	public void User_wants_to_navigate_appointment_page() {
		DRIVER.get("https://qawebsrv02.healthasyst.com:20025/Dashboard/login.aspx");
		
		
	}
	@And("^User login by (.*) and (.*)$")
	public void login(String username, String password) {
		 DRIVER.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys(username);
			
			DRIVER.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
			
	}
	
	@When("^User click on login$")
	public void user_click_on_login() throws InterruptedException {
  
		Thread.sleep(2000);
		DRIVER.findElement(By.xpath("//a[@id='btnLogin']")).click();
		Thread.sleep(3000);
	}
	@And("choose the team")
	public void choose_the_team() throws InterruptedException {
		Thread.sleep(5000);
		DRIVER.findElement(By.xpath("//*[@id=\"btnOrgSelection\"]")).click();
		
	}
	@Then("Appointment home page open")
	public void appointment_home_page_open() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("passed");
	   
	}
	@Given("Appointment homepage")
	public void appointment_homepage() throws InterruptedException {
		System.out.println("appointment home page is opened"); 
		Thread.sleep(2000);
	}

	@When("click the transaction link")
	public void click_the_transaction_link() {
		DRIVER.findElement(By.xpath("//*[@id=\"aTransactions\"]")).click();
	}

	@Then("all transaction is available")
	public void all_transaction_is_available() throws InterruptedException {
		System.out.println("passed");
		Thread.sleep(3000);
	 
	}

	@Given("Appointment homepage1")
	public void appointment_homepage1() throws InterruptedException {
		System.out.println("passed");
		Thread.sleep(2000);
	}

	@When("click view patient message link")
	public void click_view_patient_message_link() {
		DRIVER.findElement(By.xpath("//*[@id=\"aMessages\"]")).click();
	}

	@Then("all patient message")
	public void all_patient_message() {
		System.out.println("passed");
	  
	}
	@Given("Appointment page")
	public void appointment_page() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Appointment page");
		Thread.sleep(2000);
	}

	@When("click on payment link")
	public void click_on_payment_link() throws InterruptedException {
		DRIVER.findElement(By.xpath("//*[@id=\"aPayments\"]")).click();
		Thread.sleep(5000);
	
	}
	@And("^User click  (.*) , (.*) and (.*)$")
	public void enter_fname_lname_dob(String fname, String lname, String dob) {
		 DRIVER.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(fname);
			
		 DRIVER.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(lname);
			
			DRIVER.findElement(By.xpath("//*[@id=\"DOB\"]")).sendKeys(dob);
			
			
	}


	@Then("validate payment")
	public void validate_payment() {
		System.out.println("passed");
	}

	@Given("Appointment page and menu is on topright")
	public void appointment_page1() throws InterruptedException {
		Thread.sleep(2000);
		
		JS_METHODS.scrollView(DRIVER,DRIVER.findElement(By.xpath("//*[@id=\"linkOptions\"]/img")));
		Thread.sleep(2000);
		DRIVER.findElement(By.xpath("//*[@id=\"linkOptions\"]/img")).click();
	}

	@When("click logout button")
	public void click_logout_button() {
		DRIVER.findElement(By.xpath("//*[@id=\"aLogout\"]")).click();
	}

	@Then("validate logout")
	public void validate_logout() {
		System.out.println("logout");   
	}

	@Then("Validate back button after logout")
	public void validate_back_button_after_logout() {
		System.out.println("validated");
	}


}
