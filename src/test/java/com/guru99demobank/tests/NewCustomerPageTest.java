package com.guru99demobank.tests;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.guru99demobank.pageobjects.BasePage;
import com.guru99demobank.pageobjects.NewCustomerPage;
import com.guru99demobank.utilities.DataUtils;

public class NewCustomerPageTest {

	public NewCustomerPage newCustomerPage;

	@BeforeClass
	public void setUp() {
		newCustomerPage = BaseTest.setUp(NewCustomerPageTest.class);
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "dp", priority = 0)
	public void verifyAddNewCustomerHeading(Hashtable<String, String> table) {
		Assert.assertEquals(newCustomerPage.getAddNewCustomerLabelText(), table.get("addCustomerHeading"));
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "dp", priority = 1)
	public void verifyCustomerNameLabel(Hashtable<String, String> table) {
		Assert.assertEquals(newCustomerPage.getCustomerNameLabelText(), table.get("customerNameLabel"));
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "dp", priority = 2)
	public void verifyGenderLabel(Hashtable<String, String> table) {
		Assert.assertEquals(newCustomerPage.getGenderLabelText(), table.get("genderLabel"));
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "dp", priority = 3)
	public void verifyDOBLabel(Hashtable<String, String> table) {
		Assert.assertEquals(newCustomerPage.getDobLabelText(), table.get("dobLabel"));
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "dp", priority = 4)
	public void verifyAddressLabel(Hashtable<String, String> table) {
		Assert.assertEquals(newCustomerPage.getAddressLabelText(), table.get("addressLabel"));
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "dp", priority = 5)
	public void verifyCityLabel(Hashtable<String, String> table) {
		Assert.assertEquals(newCustomerPage.getCityLabelText(), table.get("cityLabel"));
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "dp", priority = 6)
	public void verifyStateLabel(Hashtable<String, String> table) {
		Assert.assertEquals(newCustomerPage.getStateLabelText(), table.get("stateLabel"));
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "dp", priority = 7)
	public void verifyPINLabel(Hashtable<String, String> table) {
		Assert.assertEquals(newCustomerPage.getPinLabelText(), table.get("pinLabel"));
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "dp", priority = 8)
	public void verifyMobileNumberLabel(Hashtable<String, String> table) {
		Assert.assertEquals(newCustomerPage.getMobileNumberLabelText(), table.get("mobileNumberLabel"));
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "dp", priority = 9)
	public void verifyEmailLabel(Hashtable<String, String> table) {
		Assert.assertEquals(newCustomerPage.getEmailLabelText(), table.get("emailLabel"));
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "dp", priority = 10)
	public void verifyPasswordLabel(Hashtable<String, String> table) {
		Assert.assertEquals(newCustomerPage.getPasswordLabelText(), table.get("passwordLabel"));
	}

	@AfterClass
	public void tearDown() {
		BasePage.tearDown();
	}

}
