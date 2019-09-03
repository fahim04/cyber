package com.common;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void ss(WebDriver driver, String sc ) throws Throwable {
		
		TakesScreenshot sht = (TakesScreenshot)driver;
		File f = sht.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File(sc+".png"));
	
	
	
}}
