package stepdefinition;

import POM.CAcceptpaymentPOM;
import customLib.DriverUtil;
import customLib.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CAcceptpayment {
	CAcceptpaymentPOM action = new CAcceptpaymentPOM();
	

@Given("User wants to navigate url")
public void navigate() {
	try {
		action.navigateTo();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@And("^User login with (.*) and (.*)$")
public void login(String username, String password) {
	action.enterUserText(username);
	action.enterPassText(password);
	action.clickLogin();
}

@When("User click on Accept Payment")
public void click_accept_payment() {
	action.clickPayment();
}

@Then("Validate Accept Payment page")
public void val_accept_pay() {
	Assert.assertFalse(true);
}


}
