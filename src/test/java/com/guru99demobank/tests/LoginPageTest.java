package com.guru99demobank.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99demobank.constants.Configurations;
import com.guru99demobank.pageobjects.BasePage;
import com.guru99demobank.pageobjects.LoginPage;

public class LoginPageTest {
	
	public LoginPage login;
	
	@BeforeMethod
	public void setUp() {
		BasePage.initialization(Configurations.browser, Configurations.url);
		login = new LoginPage();
	}
	
	@Test
	public void verifyUserIdLabelText() {
		Assert.assertEquals(login.getUserIdLableText(), "UserID");
	}
	
	
	@AfterMethod
	public void tearDown() {
		BasePage.tearDown();
	}

}
