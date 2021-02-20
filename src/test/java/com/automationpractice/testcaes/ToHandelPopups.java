package com.automationpractice.testcaes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandelPopups {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "..//AutomationPractice/BrowserLIB/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// Home Page
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		// validations
		if (title.equalsIgnoreCase(
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("Title is corret");
		}

		else {
			System.out.println("Incorrect title");
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());

		// Mouse over actions
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"))).build().perform();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("ap_email")).sendKeys("balasivarathri@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.name("password")).sendKeys("9989bala");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//driver.findElement(By.linkText("Conditions of Use")).click();

		// driver.close();

	}

}
