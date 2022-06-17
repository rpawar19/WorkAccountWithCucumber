package com.automation.workaccounts.featuresteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import work.automation.workaccounts.webobjects.LoginWebObjects;
import static org.junit.Assert.assertEquals;

public class LoginTestSteps {

	LoginWebObjects loginWO = new LoginWebObjects();
	
	 @Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
			// Write code here that turns the phrase above into concrete actions
	    }

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
			// Write code here that turns the phrase above into concrete actions
			loginWO.navigateToWebsite();


	    }

	    @Then("^Check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
			// Write code here that turns the phrase above into concrete actions
	    }
	    

	@Given("Navigate to login page")
	public void navigate_to_login_page() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("Enter valid email and invalid password")
	public void enter_valid_email_and_invalid_password(DataTable dt) {
		loginWO.loginWithinvalidPassword(dt);

	}

	@When("Enter invalid email and valid password")
	public void enter_invalid_email_and_valid_password(DataTable dt) {
		loginWO.loginWithinvalidEmail(dt);

	}

	@When("Enter email address for unregitered user")
	public void enter_unregistered_email(DataTable dt) {
		loginWO.loginWithUnregisteredEmail(dt);;
	}
	
	@When("Enter valid credential")
	public void enter_valid_credential(DataTable dt) {
		loginWO.loginWithValidCredential(dt);

	}

	@When("Do not enter any data")
	public void do_not_enter_any_data() {
//		loginWO.loginWithValidCredential();

	}

	@When("Click on Login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("validate user get error message when try to login with blank data")
	public void validate_error_for_blank_datat() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("validate user get error message when try to login with invalid email")
	public void validate_error_for_invalid_email() {
		loginWO.validateLoginWithinvalidEmail();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("validate user get error message when try to login with invalid password")
	public void validate_error_for_invalid_password() {
		loginWO.validateLoginWithinvalidPassword();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("validate user get error message when try to login with unregistered email")
	public void validate_error_for_unregistered_email() {
		assertEquals(loginWO.validateLoginWithUnregisteredEmail(),true);

		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("validate user able to login successfully")
	public void validate_user_able_to_login_successfully() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

}
