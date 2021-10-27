package org.testng;

import org.Junit.FbLoginLocators;
import org.sample.LibGlobal;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParallelExecution extends LibGlobal {

	@Test
	private void openChromeGoogle() {
		chromeBrowserLaunch();
		loadUrl("https://en-gb.facebook.com/");
		FbLoginLocators f = new FbLoginLocators();
		toFill(f.getUserName(), "wefeqfe");
		SoftAssert s = new SoftAssert();
		s.assertEquals(toGetAttribute(f.getUserName()).contentEquals("we"),
				"This is soft assert false so next line will be executed ");

		// Assert.assertTrue(toGetAttribute(f.getUserName()).equals("we"), "This is
		// false");
		// Assert.assertEquals(toGetAttribute(f.getUserName()), "wefeqfe");
		toFill(f.getPassword(), "000");
		// Assert.assertEquals(toGetAttribute(f.getPassword()), "pass");
	}
	//
	// @Test
	// private void openEdgeGoogle() {
	// edgeBrowserLaunch();
	// loadUrl("https://en-gb.facebook.com/");
	//
	// }
}