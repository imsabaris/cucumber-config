package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class AmazonPojo extends BaseClass {
	public AmazonPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchButton;
	
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement product;
	
	@FindBy(xpath="//span[@id='productTitle']")
	private WebElement productName;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getProductName() {
		return productName;
	}
	
	
	

}
