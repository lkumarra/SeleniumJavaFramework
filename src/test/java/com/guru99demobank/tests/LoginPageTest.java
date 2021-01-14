package com.guru99demobank.tests;

import java.util.Hashtable;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.guru99demobank.pageobjects.BasePage;
import com.guru99demobank.pageobjects.LoginPage;
import com.guru99demobank.utilities.DataUtils;

public class LoginPageTest {

	public LoginPage login;
	SoftAssert softAssert = new SoftAssert();

	@BeforeClass
	public void setUp() {
		login = BaseTest.setUp(LoginPageTest.class);
	}

	@Test(priority = 0, dataProviderClass = DataUtils.class, dataProvider = "dp")
	public void verifyUserIdLabelText(Hashtable<String, String> table) {
		softAssert.assertEquals(login.getUserIdLableText(), table.get("userIdLabel"));
		softAssert.assertAll();
	}

	@Test(priority = 1, dataProviderClass = DataUtils.class, dataProvider = "dp")
	public void verifyPasswordLabelText(Hashtable<String, String> table) {
		softAssert.assertEquals(login.getPasswordLabelText(), table.get("passwordLabel"));
		softAssert.assertAll();
	}

	@Test(priority = 3, dataProviderClass = DataUtils.class, dataProvider = "dp")
	public void verifyJavascriptAlertText(Hashtable<String, String> table) {
		softAssert.assertEquals(login.getAlertTextWithoutUserIdandPassword(), table.get("alertText"));
		softAssert.assertAll();
	}
	
	@AfterClass
	public void tearDown() {
		BasePage.tearDown();
	}

}
