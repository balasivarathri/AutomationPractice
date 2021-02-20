package com.automationpractice.testcaes;

import org.testng.annotations.BeforeMethod;

import com.automationPractice.utility.TestBase;

public class CreateAccount extends TestBase {

	@BeforeMethod
	// Initialize Driver
	public void setUp(String sBrowser) {
		initializeDriver(sBrowser);
	}

}
