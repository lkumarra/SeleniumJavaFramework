package com.guru99demobank.threadlocal;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	public static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	
	public static void setWebdriver(WebDriver driver) {
		threadLocal.set(driver);
	}
	
	public static WebDriver getWebdriver() {
		return threadLocal.get();
	}

}
