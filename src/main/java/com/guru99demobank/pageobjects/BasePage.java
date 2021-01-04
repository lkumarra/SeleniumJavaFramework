package com.guru99demobank.pageobjects;

import static com.guru99demobank.threadlocal.DriverManager.getWebdriver;
import static com.guru99demobank.threadlocal.DriverManager.setWebdriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.guru99demobank.constants.DirectoryPaths;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	protected static WebDriver driver;
	private static final Logger logger = LogManager.getLogger(BasePage.class);

	/**
	 * 
	 */
	public static void printVersionofFramework() {
		try {
			File myObj = new File(DirectoryPaths.FRAMEWORK_VERSION);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
				logger.debug(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			logger.error(e);
			e.printStackTrace();
		}
	}

	/**
	 * Perform initialization by launching the browser and entering the url.
	 * 
	 * @param browser: browser name to launch
	 * @param url:     Url of the webpage
	 */
	public static void initialization(String browser, String url) {
		printVersionofFramework();
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.debug("Chrome browser is launched");
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			logger.debug("Firefox browser is launched");
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			logger.debug("Edge browser is launched");
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
		setWebdriver(driver);
		getWebdriver().get(url);
		logger.debug(url + " : is launched");
		getWebdriver().manage().deleteAllCookies();
		logger.debug("All cookies are deleted");
		getWebdriver().manage().window().maximize();
		logger.debug("Window is maximized");
		getWebdriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/**
	 * Perform the teardown operations after execution.
	 */
	public static void tearDown() {
		getWebdriver().close();
		logger.debug("Execution completed");
	}

}
