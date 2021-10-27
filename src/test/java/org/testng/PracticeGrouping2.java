package org.testng;

import org.testng.annotations.Test;

public class PracticeGrouping2 {

	@Test(groups = "smoke")
	private void case2() {

		System.out.println("2");
		System.out.println("threadID:" + Thread.currentThread().getId());
	}

	// @Test()
	// private void case1() {
	// System.out.println("SKIP me");
	// throw new SkipException("skipped");
	//
	// }

	@Test(threadPoolSize = 10, invocationCount = 5)

	// @Test(threadPoolSize = 3)
	private void case6() {

		System.out.println("6");
		System.out.println("threadID:" + Thread.currentThread().getId());
	}

	@Test(groups = "sanity")
	private void case5() {

		System.out.println("5");
		System.out.println("threadID:" + Thread.currentThread().getId());
	}

}
