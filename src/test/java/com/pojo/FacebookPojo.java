package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class FacebookPojo extends BaseClass {
	public FacebookPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='English (UK)']")
	private WebElement language;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement logIn;

	public WebElement getLanguage() {
		return language;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogIn() {
		return logIn;
	}

}
