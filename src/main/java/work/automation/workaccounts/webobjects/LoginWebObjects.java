package work.automation.workaccounts.webobjects;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.automation.workaccounts.base.Apps;
import com.automation.workaccounts.webelements.LoginWebElements;

import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class LoginWebObjects extends Apps implements LoginWebElements {
	//String error = "";

	public void navigateToWebsite() {
		// initWebDriver();
		webdriver.get("https://work.facebook.com");
		webdriver.manage().window().maximize();

	}

	public void loginWithinvalidEmail(DataTable dt) {

		List<List<String>> list = dt.asLists(String.class);

		getWebElement(work_emaill_address).sendKeys(list.get(0).get(0));
		getWebElement(continue_btn).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void validateLoginWithinvalidEmail() {
		String error = getWebElement(error_on_email_screen).getText();
		assertEquals(invalid_email_error, error);
		
	}
	
	
	public void loginWithinvalidPassword(DataTable dt) {

		List<List<String>> list = dt.asLists(String.class);

		getWebElement(work_emaill_address).sendKeys(list.get(0).get(0));
		getWebElement(continue_btn).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getWebElement(password).sendKeys(list.get(0).get(1));
		getWebElement(continue_btn).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void validateLoginWithinvalidPassword() {
		String error = getWebElement(error_on_email_screen).getText();
		assertEquals(invalid_password_error, error);
		
	}
	
	public void loginWithUnregisteredEmail(DataTable dt) {

		List<List<String>> list = dt.asLists(String.class);

		getWebElement(work_emaill_address).sendKeys(list.get(0).get(0));
		getWebElement(continue_btn).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public boolean validateLoginWithUnregisteredEmail() {
		String error = getWebElement(error_on_email_screen).getText();
		
		if(error.contains("It looks like there isn't an account associated")) {
			return true;
		} else {
			return false;
		}
		
		//assertEquals(unregistered_email_error, error);
		
	}
	

	public void loginWithValidCredential(DataTable dt) {

		List<List<String>> list = dt.asLists(String.class);

		getWebElement(work_emaill_address).sendKeys(list.get(0).get(0));
		getWebElement(continue_btn).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getWebElement(password).sendKeys(list.get(0).get(1));
		getWebElement(continue_btn).click();

	}
	

}
