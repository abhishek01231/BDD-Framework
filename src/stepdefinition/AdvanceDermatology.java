package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import customLib.base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdvanceDermatology implements base {

@Given("User is valid and has appointment link")
public void user_is_valid_and_has_appointment_link() {
 System.out.println("Valid user");   
}

@When("user enters the url")
public void user_enters_the_url() {
	DRIVER.get("https://mraemrtest.com:60055/");
	
}

@Then("Validate appointment home page appears")
public void validate_appointment_home_page_appears() {
	Assert.assertEquals("PAGE validation",DRIVER.getTitle(),"Online Appointment Booking");
}

@Given("User is at Appointment page")
public void user_is_at_Appointment_page() throws InterruptedException {
	Thread.sleep(2000);
	Assert.assertEquals("PAGE validation",DRIVER.getTitle(),"Online Appointment Booking");
}

@When("User click on appointment type")
public void user_click_on_appointment_type() throws InterruptedException {
	DRIVER.findElement(By.xpath("//*[@id=\"a1\"]/div/section/div[1]/div[2]/button/span[1]")).click();
	Thread.sleep(2000);
}

@When("Choose new or existing patient")
public void choose_new_or_existing_patient() throws InterruptedException {
	DRIVER.findElement(By.xpath("//*[@id=\"new\"]/span[1]")).click();
	Thread.sleep(2000);
  
}

@When("User has to choose insurance")
public void user_has_to_choose_insurance() throws InterruptedException {
	DRIVER.findElement(By.xpath("//*[@id=\"noInsurance\"]/span[1]")).click();
	Thread.sleep(2000);
}

@When("click on by location to book appointment")
public void click_on_by_location_to_book_appointment() throws InterruptedException {
	
	DRIVER.findElement(By.xpath("//*[@id=\"a1\"]/div/section/div[3]/div[3]/div[5]/div[1]/div[2]/button/span[1]")).click();
	Thread.sleep(2000);
}

@When("User selects loction and region from dropdown")
public void user_selects_loction_and_region_from_dropdown() throws InterruptedException {
	//Select location=new Select(DRIVER.findElement(By.id("regionlist")));
	//location.selectByVisibleText("Nassau County");
	DRIVER.findElement(By.id("regionlist")).sendKeys("Nassau County",Keys.ARROW_DOWN, Keys.ENTER);
	//((Select) DRIVER.findElement(By.id("regionlist"))).selectByValue("Nassau County");
	
	
	Thread.sleep(2000);
	//DRIVER.findElement(By.id("regionlist")).click();
	DRIVER.findElement(By.id("facilitylist")).sendKeys("Bayside",Keys.ARROW_DOWN, Keys.ENTER);
	Thread.sleep(2000);
	
	
 
}

@When("user clicks on show schedule")
public void user_clicks_on_show_schedule() throws InterruptedException {
	Thread.sleep(2000);
	//JS_METHODS.scrollView(DRIVER,DRIVER.findElement(By.xpath("//*[@id=\"linkOptions\"]/img")));
	
	DRIVER.findElement(By.xpath("//*[@id=\"showScheduleLocation\"]/span[1]")).click();
}

@Then("validate the appointment booking")
public void validate_the_appointment_booking() throws InterruptedException {
  Thread.sleep(4000);
}
}
