package org.steps;

import com.pojo.FlipkartPojo;
import com.utilities.BaseClass;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class StepDefinitionFlipkart extends BaseClass {
	FlipkartPojo flippojo;
	@Given("user has to be in the login page")
	public void user_has_to_be_in_the_login_page() {
		//browserLaunch();
		loadUrl("https://www.flipkart.com/");
	}
	
	@Given("User has to close the window")
	public void user_has_to_close_the_window() {
		flippojo = new FlipkartPojo();
		btnClick(flippojo.getClose());
	}


	@When("user has to give username and password")
	public void user_has_to_give_username_and_password() throws Exception {
		
		btnClick(flippojo.getLoginClick());
		typeInput(flippojo.getUser(), readExcel(1, 0));
		typeInput(flippojo.getPassword(), readExcel(1, 1));
		String passwordValue = getsValue(flippojo.getPassword());
		Assert.assertTrue("Check Password Value",passwordValue.contains("sabaris123"));

	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
		btnClick(flippojo.getLoginButton());
	}

	@Then("user has to reenter to login page")
	public void user_has_to_reenter_to_login_page() {
		System.out.println("User returns to login page");
		//pageQuit();
	}

}
