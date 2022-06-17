package com.automation.workaccounts.webelements;

import org.openqa.selenium.By;

public interface LoginWebElements {
	
	
	By work_emaill_address = By.xpath("//label[contains(text(),'Work email address')]/following-sibling::input");
	By continue_btn = By.xpath("//div[@aria-label='Continue']");
	By password = By.xpath("//label[contains(text(),'Password')]/following-sibling::input");
	By error_on_email_screen = By.xpath("//div[starts-with(@id,'jsc_c')]/child::span");
	
	
	//String blank_error ="";
	String invalid_email_error = "That email address doesn't look right. Try entering a valid address, e.g. 'jo@foxfabricsglobal.com'.";
	String unregistered_email_error = "It looks like there isn't an account associated with that email. You entered: test@ydd.com. Please check your details and try again.";
	String invalid_password_error= "Please re-enter your password. The password that you've entered is incorrect.";
	


}
