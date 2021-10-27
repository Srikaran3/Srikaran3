package org.redbus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.LibGlobal;

public class RedbusLocators extends LibGlobal {

	public RedbusLocators() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "signin-block")
	private WebElement signinBtn;
	@FindBy(xpath = "//li[text()='Sign In/Sign Up']")
	private WebElement Log;

	public WebElement getSigninBtn() {
		return signinBtn;
	}

	public WebElement getLog() {
		return Log;
	}

	public WebElement getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

}
