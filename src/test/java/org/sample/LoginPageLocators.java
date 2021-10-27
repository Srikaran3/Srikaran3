package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LoginPageLocators extends LibGlobal {

	public LoginPageLocators() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(id = "username")
	private WebElement userName;

	@CacheLookup
	@FindBy(id = "password")
	private WebElement pass;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPass() {
		return pass;
	}

	@CacheLookup
	@FindBy(id = "login")
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
