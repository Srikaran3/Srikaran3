package org.sample;

public class LoginPageTest extends LibGlobal {

	public static void main(String[] args) {
		ieBrowserLaunch();
		loadUrl("http://adactinhotelapp.com/");
		toMaximize();
		LoginPageLocators l = new LoginPageLocators();
		toFill(l.getUserName(), "Karan123");
		toFill(l.getPass(), "asdf;lkj");
		toClick(l.getLoginBtn());

	}
}
