package stepdefinition;

import POM.CworkAction;
import customLib.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WorkAction implements base{
	Appointment a1=new Appointment();
	CworkAction a2=new CworkAction();
	@Given("User want to navigate to given Url")
	public void user_want_to_navigate_to_Url() {
		a1.User_wants_to_navigate_appointment_page();

	}
	@And("^login by entering (.*) and (.*)$")
	public void loginby(String username, String password) {
		a1.login(username, password);
			
	}
	@Given("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {
	   a1.user_click_on_login();
	}

	@Given("choose the team to enter")
	public void choose_the_team_to_enter() {
	    try {
			a1.choose_the_team();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	@When("User click on Work action link")
	public void user_click_on_Work_action_link() {
	   a2.Clickworkaction();
	}

	@When("^User enters the (.*) , (.*) and (.*)$")
	public void enterdata(String fname, String lname, String date) {
	  a2.enterFirstname(fname);
	  a2.enterLastname(lname);
	  a2.enterdate(date);
	}

	@When("User click on Next")
	public void user_click_on_Next() {
	 a2.clickNext();
	}

	@Then("Validate Work action")
	public void validate_Work_action() throws InterruptedException
	{
	System.out.println("Validated");
	}
	@Given("Work action page")
	public void work_action_page() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Work action oage in detail");
	}

	@When("User click on go to next")
	public void user_click_on_go_to_next() {
		  a2.clickGo();
	}

	@When("click on payment communication")
	public void click_on_payment_communication() throws InterruptedException {
	a2.clickPatientcommunication();
	}

	@When("click on Payment history")
	public void click_on_Payment_history() throws InterruptedException {
a2.Paymenthistory();
	}

	@Then("Validate Payment history")
	public void validate_Payment_history() {
		System.out.println("Validated");

	}

}
