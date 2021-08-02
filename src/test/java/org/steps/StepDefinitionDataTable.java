package org.steps;

import java.util.List;
import java.util.Map;

import com.pojo.FacebookPojo;
import com.utilities.BaseClass;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;

public class StepDefinitionDataTable extends BaseClass {
	FacebookPojo fbpojo;
	@Given("user is in login page")
	public void user_is_in_login_page() {
		//browserLaunch();
		loadUrl("https://www.facebook.com/");
	}
	@Given("user change to English language")
	public void user_change_to_English_language() {
		fbpojo=new FacebookPojo();
		btnClick(fbpojo.getLanguage());
	}
	@When("user enter username and password")
	public void user_enter_username_and_password(DataTable d) {
		List<Map<String,String>> list = d.asMaps();
		Map<String, String> map = list.get(1);
		typeInput(fbpojo.getUserName(),map.get("username"));
		typeInput(fbpojo.getPassword(),map.get("password"));
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		btnClick(fbpojo.getLogIn());
	}

	@Then("user is in reenter login page")
	public void user_is_in_reenter_login_page() {
		System.out.println("User is in reenter login page");
		pageQuit();
	}
	
	@When("user clicks login without data")
	public void user_clicks_login_without_data() {
	    btnClick(fbpojo.getLogIn());
	}
	@Then("user reenter to login page")
	public void user_reenter_to_login_page() {
	    System.out.println("User WIthout Passing value success");
	    //pageQuit();
	}


}





// 1D List Datatable
//@When("user enter username and password")
//public void user_enter_username_and_password(DataTable d) {
//	List<String> list = d.asList();
//	String user = list.get(0);
//	typeInput(fbpojo.getUserName(), user);
//	typeInput(fbpojo.getPassword(), list.get(1));
//}



// 2D list
//@When("user enter username and password")
//public void user_enter_username_and_password(DataTable d) {
//	List<List<String>> list = d.asLists();
//	List<String> list2 = list.get(1);
//	typeInput(fbpojo.getUserName(), list2.get(0));
//	typeInput(fbpojo.getPassword(), list2.get(1));
//}


// 1D Map
//@When("user enter username and password")
//public void user_enter_username_and_password(DataTable d) {
//	Map<String, String> map = d.asMap(String.class, String.class);
//	typeInput(fbpojo.getUserName(),map.get("username"));
//	typeInput(fbpojo.getPassword(),map.get("password"));
//}



// 2D Map
//@When("user enter username and password")
//public void user_enter_username_and_password(DataTable d) {
//	List<Map<String,String>> list = d.asMaps();
//	Map<String, String> map = list.get(1);
//	typeInput(fbpojo.getUserName(),map.get("username"));
//	typeInput(fbpojo.getPassword(),map.get("password"));
//}
