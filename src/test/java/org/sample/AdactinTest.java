package org.sample;
import java.awt.AWTException;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdactinTest extends LibGlobal {
	@Before
	public void openBrowser() {
		chromeBrowserLaunch();
	}
	@Test
	public void booking() throws AWTException, IOException {
		loadUrl("http://adactinhotelapp.com/");
		toMaximize();
		LoginPageLocators l = new LoginPageLocators();
		toWait();
		toFill(l.getUserName(), excelRead("abc", "adactin", 0, 1));
		toFill(l.getPass(), excelRead("abc", "adactin", 1, 1));
		toClick(l.getLoginBtn());
		HomePageLocators h = new HomePageLocators();
		toSelectByVisibleText(h.getLocation(), excelRead("abc", "adactin", 2, 1));
		toSelectByValue(h.getHotels(), excelRead("abc", "adactin", 3, 1));
		toSelectByVisibleText(h.getRoomType(), excelRead("abc", "adactin", 4, 1));
		toSelectByValue(h.getRoomsCount(), excelRead("abc", "adactin", 5, 1));
		toClick(h.getCheckInDate());
		toSelectAll();
		toFill(h.getCheckInDate(), excelRead("abc", "adactin", 6, 1));
		toPressTab();
		toFill(h.getCheckOutDate(), excelRead("abc", "adactin", 7, 1));
		toSelectByVisibleText(h.getAdultPerRoom(), excelRead("abc", "adactin", 8, 1));
		toSelectByValue(h.getChildPerRoom(), excelRead("abc", "adactin", 9, 1));
		toClick(h.getSearchBtn());
		toClick(h.getRadioBtn());
		toClick(h.getCntBtn());
		toFill(h.getFirstName(), excelRead("abc", "adactin", 10, 1));
		toFill(h.getLastName(), excelRead("abc", "adactin", 11, 1));
		toFill(h.getAddress(), excelRead("abc", "adactin", 12, 1));
		toFill(h.getCcNum(), excelRead("abc", "adactin", 13, 1));
		toSelectByValue(h.getCcType(), excelRead("abc", "adactin", 14, 1));
		toSelectByVisibleText(h.getExpmonthDdn(), excelRead("abc", "adactin", 15, 1));
		toSelectByVisibleText(h.getExpyearDdn(), excelRead("abc", "adactin", 16, 1));
		toFill(h.getCvvTxtBox(), excelRead("abc", "adactin", 17, 1));
		toClick(h.getBookBtn());
		createRow("abc", 1, 19, 0, "Order No");
		createCell("abc", 1, 19, 1, toGetAttribute(h.getOrderNo()));
		System.out.println("order No- " + h.getOrderNo().getAttribute("value") + " is updated in excel sheet");
	}
	@After
	public void closeBrowser() {
		toCloseBrowser();
	}
}