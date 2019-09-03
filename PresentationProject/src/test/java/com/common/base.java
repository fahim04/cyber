package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;

	public WebDriver getdriver() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/ahmedchowdhury/eclipse-workspace/PracticeFrameWork/Browser/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(39, TimeUnit.SECONDS);
		return driver;
	}

}
