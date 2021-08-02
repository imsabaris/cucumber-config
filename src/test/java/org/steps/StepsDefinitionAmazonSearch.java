package org.steps;

import com.pojo.AmazonPojo;
import com.utilities.BaseClass;

import io.cucumber.java.en.*;

public class StepsDefinitionAmazonSearch extends BaseClass {
	AmazonPojo amazepojo;
	@Given("user has to be in search page")
	public void user_has_to_be_in_search_page() {
		//browserLaunch();
		loadUrl("https://www.amazon.com/");
	}

	@When("user has to give product name")
	public void user_has_to_give_product_name() {
	    amazepojo = new AmazonPojo();
	    typeInput(amazepojo.getSearchBox(), "Iphone se");
	}

	@When("user has to click search button")
	public void user_has_to_click_search_button() {
	    btnClick(amazepojo.getSearchButton());
	}

	@Then("user will be in the product page")
	public void user_will_be_in_the_product_page() {
	    System.out.println("User will be in the product page");
	}
	@When("user has to click the product")
	public void user_has_to_click_the_product() {
	   /* implicitWait();
	    btnClick(amazepojo.getProduct());*/
		System.out.println("skipped");
	}

	@Then("user enters the add to cart page")
	public void user_enters_the_add_to_cart_page() {
	   /* implicitWait();
	    getsText(amazepojo.getProductName());
*/	    //pageQuit();
	}


}
