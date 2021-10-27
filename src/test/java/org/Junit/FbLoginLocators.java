package org.Junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.LibGlobal;

public class FbLoginLocators extends LibGlobal {
	public FbLoginLocators() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(id = "email")
	private WebElement userName;
	@CacheLookup
	@FindBy(id = "pass")
	private WebElement password;
	@CacheLookup
	@FindBy(name = "login")
	private WebElement loginBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
}
