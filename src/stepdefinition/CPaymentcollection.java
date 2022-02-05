package stepdefinition;

import POM.CAcceptpaymentPOM;
import POM.CPaymentsPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CPaymentcollection {
	CPaymentsPOM action = new CPaymentsPOM();
	
@When("^User click on Payment tab$")
public void click_payment() {
	action.clickPayment();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@And("^User click on (.*) , (.*) and (.*)$")
public void enter_fname_lname_dob(String fname, String lname, String dob) {
	action.enterFname(fname);
	action.enterLname(lname);
	action.enterDOB(dob);
}

@And("User click on Next button")
public void enter_next() {
	action.clickNext();
}

@And("Validate Review Payment")
public void val_Reviewpayment() {
	action.valReviewpayment();
}

@And("User click on Edit Button")
public void click_Edit() {
	action.clickEdit();
}

@And("User click on Confirm Button")
public void click_Confirm() {
	action.clickConfirm();
}

@And("User Clear the Amount")
public void clear_Amount() {
	action.clear();
}

@And("User enter the amount")
public void enter_Amount() {
	action.clickPaymentamount();
}

@And("User click on Payment Pop up Confirmation")
public void confirm_Payment_popup() {
	action.payment_confirm_popup();
}

@And("User click on Pay by Card button")
public void btn_Pay_by_card() {
	action.click_pay_card();
}

@And("User click on New Card Tab")
public void btn_Newcard() {
	action.click_newcard();
}

@When("User enter the card number, expiration and cvv")
public void enter_Cardnumber_exp_cvv() {
	action.enterCardnumber();
	action.sel_Value();
	action.sel_Value_year();
}

@And("Click on make a payment")
public void make_payment() {
	action.click_Make_payment();
}

@Then("Validate Payment message")
public void val_message() {
	action.val_Mesage();
	action.val_Makeanotherpayment();
	action.val_Printreceipt();
}

}
