package org.testng;

import java.util.concurrent.TimeUnit;

import org.Junit.FbLoginLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersEx extends FbLoginLocators {

	// @Test
	// @Parameters({ "na", "pa" })
	// private void You(String n) {
	// System.out.println("Your name is : " + n);

	@Test
	@Parameters({ "na", "pa" })
	private void login(String name, String pass) {
		WebDriverManager.edgedriver().setup();
		WebDriver d = new EdgeDriver();
		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// d.findElement(By.id("email")).sendKeys(name);
		// d.findElement(By.id("pass")).sendKeys(pass);

		FbLoginLocators fb = new FbLoginLocators();
		toFill(fb.getUserName(), name);
		toFill(fb.getPassword(), pass);
	}
}
