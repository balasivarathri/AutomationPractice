package com.automationpractice.testcaes;

import org.testng.annotations.BeforeMethod;

import com.automationPractice.utility.TestBase;

public class SearchProduct extends TestBase{
	
	@BeforeMethod
	public void setUp(String sBrowser) {
		//InitializeDriver
		initializeDriver(sBrowser);
	}

}
