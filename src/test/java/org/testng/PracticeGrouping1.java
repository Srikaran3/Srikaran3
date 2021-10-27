package org.testng;

import org.testng.annotations.Test;

public class PracticeGrouping1 {
	@Test
	private void case1() {

		System.out.println("1");
	}

	@Test(groups = "smoke")
	private void case4() {

		System.out.println("4");
	}

	@Test
	private void case3() {

		System.out.println("3");
	}

}
