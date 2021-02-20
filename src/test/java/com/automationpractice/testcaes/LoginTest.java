package com.automationpractice.testcaes;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automationPractice.utility.TestBase;

public class LoginTest extends TestBase{
	@Parameters ("sBrowser")
	@BeforeMethod
	
	public void setUp(String sBrowser) {
		//step1 : InitializeBrowser
		initializeDriver(sBrowser);
		
		//enter URL
		enterURL(automationURL);
	}
	
  @Test(description = "Verify Create Account Functionality")
  public void CreateAccountTest() {
	  
	  //Launch the Browser
	  //Enter URL
	  //click on Signin button
	  //click on Create Account button
	  //Enter all the fileds
	  //Verify that the account has been created
  }
}
