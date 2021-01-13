package com.guru99demobank.pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.guru99demobank.elementlocators.HomePageLocators;
import com.guru99demobank.threadlocal.DriverManager;
import com.guru99demobank.utilities.Utilities;

public class HomePage {

	public HomePageLocators homePageLocators;
	Utilities utilities = new Utilities();

	public HomePage() {
		homePageLocators = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(DriverManager.getWebdriver(), 30);
		PageFactory.initElements(factory, homePageLocators);
	}

	/**
	 * Return the text of welcome message on home page.
	 * 
	 * @return Text of welcome message.
	 */
	public String getWelcomeMessage() {
		return utilities.getWebelementText(homePageLocators.getWelcomMessageLocator());
	}

	/**
	 * Return the text of managerId message.
	 * 
	 * @return ManagerId Message.
	 */
	public String getManageIdMessage() {
		return utilities.getWebelementText(homePageLocators.getManagerIdLocator());
	}

	/**
	 * Return the text of links on Home Page.
	 * 
	 * @return Text of Links.
	 */
	public List<String> getLinkTexts() {
		return utilities.getWebelementsTexts(homePageLocators.getMenuElements());
	}

	/**
	 * Click on new customer link.
	 * 
	 * @return Object of new customer page.
	 */
	public NewCustomerPage clickOnNewCustomerLink() {
		utilities.clickOnElement(homePageLocators.getNewCustomerElement());
		return new NewCustomerPage();
	}

	/**
	 * Click on Edit customer link.
	 * 
	 * @return Objcet of Edit Customer Page.
	 */
	public EditCustomerPage clickOnEditCustomerLink() {
		utilities.clickOnElement(homePageLocators.getEditCustomerElement());
		return new EditCustomerPage();
	}

	/**
	 * Click on Delete customer link.
	 * 
	 * @return Object of delete customer page.
	 */
	public DeleteCustomerPage clickOnDeleteCustomerLink() {
		utilities.clickOnElement(homePageLocators.getDeleteCustomerElement());
		return new DeleteCustomerPage();
	}

	/**
	 * Click on New Account link.
	 * 
	 * @return Object of New Account Page.
	 */
	public NewAccountPage clickOnNewAccountLink() {
		utilities.clickOnElement(homePageLocators.getNewAccountElement());
		return new NewAccountPage();
	}

	/**
	 * Click on edit account link.
	 * 
	 * @return Object of edit account page.
	 */
	public EditAccountPage clickOnEditAccountLink() {
		utilities.clickOnElement(homePageLocators.getEditAccountElement());
		return new EditAccountPage();
	}

	/**
	 * Click on delete accout link.
	 * 
	 * @return Object of delete account page.
	 */
	public DeleteAccountPage clickOnDeleteAccountLink() {
		utilities.clickOnElement(homePageLocators.getDeleteAccountElement());
		return new DeleteAccountPage();
	}

	/**
	 * Click on deposit link.
	 * 
	 * @return Object of deposit page.
	 */
	public DepositPage clickOnDepositLink() {
		utilities.clickOnElement(homePageLocators.getDepositElement());
		return new DepositPage();
	}

	/**
	 * Click on Withdrawal link.
	 * 
	 * @return Object of Withdrawal page.
	 */
	public WithdrawalPage clickOnWithdrwalLink() {
		utilities.clickOnElement(homePageLocators.getWithdrawalElement());
		return new WithdrawalPage();
	}

	/**
	 * Click on fund transfer link.
	 * 
	 * @return Object of fund transfer page.
	 */
	public FundTransferPage clickOnFundTransferLink() {
		utilities.clickOnElement(homePageLocators.getFundTransferElement());
		return new FundTransferPage();
	}

	/**
	 * Click on change password link.
	 * 
	 * @return Object of change password page.
	 */
	public ChangePasswordPage clickOnChangePasswordLink() {
		utilities.clickOnElement(homePageLocators.getChangePasswordElement());
		return new ChangePasswordPage();
	}

	/**
	 * Click on balance enquiry link.
	 * 
	 * @return Objcet of balace enquiry page.
	 */
	public BalanceEnquiryPage clickOnBalanceEnquiryLink() {
		utilities.clickOnElement(homePageLocators.getBalanceEnquiryElement());
		return new BalanceEnquiryPage();
	}

	/**
	 * Click on ministatement link.
	 * 
	 * @return Object of mini statement page.
	 */
	public MiniStatementPage clickOnMiniStatementLink() {
		utilities.clickOnElement(homePageLocators.getMiniStatementElement());
		return new MiniStatementPage();
	}

	/**
	 * Click on Customised Statement link.
	 * 
	 * @return Object of customised statement page.
	 */
	public CustomisedStatementPage clickOnCutomisedStatementLink() {
		utilities.clickOnElement(homePageLocators.getCustomisedStatementElement());
		return new CustomisedStatementPage();
	}

	/**
	 * Click on logout link.
	 * 
	 * @return object of logout page.
	 */
	public LogoutPage clickOnLogoutLink() {
		utilities.clickOnElement(homePageLocators.getLogOutElement());
		return new LogoutPage();
	}

}
