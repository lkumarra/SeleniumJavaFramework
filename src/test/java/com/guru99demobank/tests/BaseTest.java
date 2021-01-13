package com.guru99demobank.tests;

import com.guru99demobank.constants.Configurations;
import com.guru99demobank.pageobjects.BasePage;
import com.guru99demobank.pageobjects.HomePage;
import com.guru99demobank.pageobjects.LoginPage;

public class BaseTest {
	
	@SuppressWarnings("unchecked")
	public static <T> T setUp(@SuppressWarnings("rawtypes") Class clazz) {
		BasePage.initialization(Configurations.browser, Configurations.url);
		switch (clazz.getSimpleName()) {
		case "LoginPageTest":
			return (T) new LoginPage();
		case "HomePageTest":
			LoginPage loginPage = new LoginPage();
			HomePage homePage = loginPage.login(Configurations.userId, Configurations.password);
			return (T) homePage;
		default:
			break;
		}
		return null;
	}

}
