package com.guru99demobank.tests;

import java.util.Hashtable;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.guru99demobank.pageobjects.BasePage;
import com.guru99demobank.pageobjects.HomePage;
import com.guru99demobank.utilities.DataUtils;

public class HomePageTest {
	
	public HomePage homePage;
	public List<String> list;
	
	@BeforeClass
	public void setUp() {
		homePage = BaseTest.setUp(HomePageTest.class);
		list = homePage.getLinkTexts();
	}
	
	@Test(dataProviderClass = DataUtils.class, dataProvider = "dp")
	public void verifyLinks(Hashtable<String, String> table) {
		int index = (int) Float.parseFloat(table.get("index"));
		Assert.assertEquals(list.get(index), table.get("linkText"));
	}
	
	@AfterClass
	public void tearDown() {
		BasePage.tearDown();
	}

}
