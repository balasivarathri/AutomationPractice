package com.automationPractice.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * InitializeDriver
 * @author User
 *
 */
public class TestBase implements SetUp{
	
	public WebDriver driver;
	
	public void initializeDriver(String sBrowser) {
		
		if(sBrowser.equalsIgnoreCase("firefox")) {
			System.setProperty(firefoxbrowserkey, firefoxbrowserpathvalue);
			driver = new FirefoxDriver();
		}
		else if(sBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty(chromebrowserkey,chromebrowserpathvalue);
			driver = new ChromeDriver();
		}
			
	}
	public void enterURL(String sURL) {
		driver.get(sURL);
	}

}
