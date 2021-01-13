package com.guru99demobank.tests;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.guru99demobank.constants.Configurations;
import com.guru99demobank.pageobjects.BasePage;
import com.guru99demobank.pageobjects.LoginPage;
import com.guru99demobank.utilities.DataUtils;

public class LoginPageTest {

	public LoginPage login;
	SoftAssert softAssert = new SoftAssert();

	@BeforeMethod
	public void setUp() {
		BasePage.initialization(Configurations.browser, Configurations.url);
		login = BaseTest.setUp(LoginPageTest.class);
	}

	@Test(priority = 0)
	public void verifyUserIdLabelText() {
		softAssert.assertEquals(login.getUserIdLableText(), "UserID");
		softAssert.assertAll();
	}

	@Test(priority = 1)
	public void verifyPasswordLabelText() {
		softAssert.assertEquals(login.getPasswordLabelText(), "Password");
		softAssert.assertAll();
	}

	@Test(priority = 3, dataProviderClass = DataUtils.class, dataProvider = "dp")
	public void verifyJavascriptAlertText(Hashtable<String, String> table) {
		softAssert.assertEquals(login.getAlertTextWithoutUserIdandPassword(), "User or Password is not valid");
		softAssert.assertAll();
	}
	
	@AfterMethod
	public void tearDown() {
		BasePage.tearDown();
	}

}
