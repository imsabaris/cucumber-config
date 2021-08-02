package org.steps;

import com.pojo.FacebookPojo;
import com.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	FacebookPojo fbpojo;
	@When("user has to enter {string} and {string}")
	public void user_has_to_enter_username_and_password(String user,String pass) throws Exception {
		loadUrl("https://www.facebook.com/");
		fbpojo = new FacebookPojo();
		btnClick(fbpojo.getLanguage());
		typeInput(fbpojo.getUserName(), user);
		typeInput(fbpojo.getPassword(),pass);

	}

	@When("user has to click login button")
	public void user_has_to_click_login_button() {
		btnClick(fbpojo.getLogIn());
		//implicitWait();
		pageQuit();
	}

	@Then("user will navigate to reenter login page")
	public void user_will_navigate_to_reenter_login_page() {
		System.out.println("User will navigate to reenter login page");
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		fbpojo=new FacebookPojo();
		loadUrl("https://www.facebook.com/");
		implicitWait();
		btnClick(fbpojo.getLanguage());
		btnClick(fbpojo.getLogIn());
	}

	@Then("user will be in invalid credential page")
	public void user_will_be_in_invalid_credential_page() {
		System.out.println("User will navigate to reenter login page");	
		//implicitWait();
		pageQuit();
	}
}
