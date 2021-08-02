package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class FlipkartPojo extends BaseClass  {
		public FlipkartPojo() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath=("//button[@class='_2KpZ6l _2doB4z']"))
		private WebElement close;
		
		
		@FindBy(xpath="//a[text()='Login']")
		private WebElement loginClick;
		
		@FindAll({@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']"),@FindBy(xpath="//input[@class='_2IX_2- _3umUoc VJZDxU']")})
		private WebElement user;
		
		
		@FindAll({@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']"),@FindBy(xpath="//input[@class='_2IX_2- _3umUoc _3mctLh VJZDxU']")})
		private WebElement password;
		
		@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
		private WebElement loginButton;
		
		public WebElement getClose() {
			return close;
		}


		public WebElement getLoginClick() {
			return loginClick;
		}

		public WebElement getUser() {
			return user;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

	

}








