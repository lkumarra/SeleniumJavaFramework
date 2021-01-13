package com.guru99demobank.elementlocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePageLocators {
	
	private final String welcomeMessageXpath = "//marquee[@class = 'heading3']";
	private final String managerIdXpath = "//tr[@class = 'heading3']";
	private final String menuXpath = "//ul[@class = 'menusubnav' ]//li";
	private final String newCustomerLinkText = "New Customer";
	private final String editCustomerLinkText = "Edit Customer";
	private final String delteCustomeLinkText = "Delete Customer";
	private final String newAccountLinkText = "New Account";
	private final String editAccountLinkText = "Edit Account";
	private final String deleteAccountLinkText = "Delete Account";
	private final String depositLinkText ="Deposit";
	private final String withdrawalLinkText = "Withdrawal";
	private final String fundTransferLinkText = "Fund Transfer";
	private final String changePasswordLinkText = "Change Password";
	private final String balanceEnquiryLinkText = "Balance Enquiry";
	private final String miniStatementLinkText = "Mini Statement";
	private final String customisedStatementLinkText = "Customised Statement";
	private final String logoutLinkText = "Log out";
	
	private By welcomeMessageBy = By.xpath(welcomeMessageXpath);
	private By managerIdBy = By.xpath(managerIdXpath);
	private By menuBy = By.xpath(menuXpath);
	private By newCustomerBy = By.linkText(newCustomerLinkText);
	private By editCustomerBy = By.linkText(editCustomerLinkText);
	private By deleteCustomerBy = By.linkText(delteCustomeLinkText);
	private By newAccountBy = By.linkText(newAccountLinkText);
	private By editAccountBy = By.linkText(editAccountLinkText);
	private By deleteAccountBy = By.linkText(deleteAccountLinkText);
	private By depositBy = By.linkText(depositLinkText);
	private By withdrawalBy = By.linkText(withdrawalLinkText);
	private By fundTransferBy = By.linkText(fundTransferLinkText);
	private By changePasswordBy = By.linkText(changePasswordLinkText);
	private By balanceEnquiryBy = By.linkText(balanceEnquiryLinkText);
	private By miniStatementBy = By.linkText(miniStatementLinkText);
	private By customisedStatementBy = By.linkText(customisedStatementLinkText);
	private By logOutBy = By.linkText(logoutLinkText);

	@CacheLookup
	@FindBy(xpath = welcomeMessageXpath)
	private WebElement welcomMessageLocator;

	@CacheLookup
	@FindBy(xpath = managerIdXpath)
	private WebElement managerIdLocator;

	@CacheLookup
	@FindBys({ @FindBy(xpath = menuXpath) })
	private List<WebElement> menuElements;

	@CacheLookup
	@FindBy(linkText = newCustomerLinkText)
	private WebElement newCustomerElement;

	@CacheLookup
	@FindBy(linkText = editCustomerLinkText)
	private WebElement editCustomerElement;

	@CacheLookup
	@FindBy(linkText = delteCustomeLinkText)
	private WebElement deleteCustomerElement;

	@CacheLookup
	@FindBy(linkText = newAccountLinkText)
	private WebElement newAccountElement;

	@CacheLookup
	@FindBy(linkText = editAccountLinkText)
	private WebElement editAccountElement;

	@CacheLookup
	@FindBy(linkText = deleteAccountLinkText)
	private WebElement deleteAccountElement;

	@CacheLookup
	@FindBy(linkText = depositLinkText)
	private WebElement depositElement;

	@CacheLookup
	@FindBy(linkText = withdrawalLinkText)
	private WebElement withdrawalElement;

	@CacheLookup
	@FindBy(linkText = fundTransferLinkText)
	private WebElement fundTransferElement;

	@CacheLookup
	@FindBy(linkText = changePasswordLinkText)
	private WebElement changePasswordElement;

	@CacheLookup
	@FindBy(linkText = balanceEnquiryLinkText)
	private WebElement balanceEnquiryElement;

	@CacheLookup
	@FindBy(linkText = miniStatementLinkText)
	private WebElement miniStatementElement;

	@CacheLookup
	@FindBy(linkText = customisedStatementLinkText)
	private WebElement customisedStatementElement;

	@CacheLookup
	@FindBy(linkText = logoutLinkText)
	private WebElement logOutElement;
	
	public By getWelcomeMessageBy() {
		return welcomeMessageBy;
	}

	public By getManagerIdBy() {
		return managerIdBy;
	}

	public By getMenuBy() {
		return menuBy;
	}

	public By getNewCustomerBy() {
		return newCustomerBy;
	}

	public By getEditCustomerBy() {
		return editCustomerBy;
	}

	public By getDeleteCustomerBy() {
		return deleteCustomerBy;
	}

	public By getNewAccountBy() {
		return newAccountBy;
	}

	public By getEditAccountBy() {
		return editAccountBy;
	}

	public By getDeleteAccountBy() {
		return deleteAccountBy;
	}

	public By getDepositBy() {
		return depositBy;
	}

	public By getWithdrawalBy() {
		return withdrawalBy;
	}

	public By getFundTransferBy() {
		return fundTransferBy;
	}

	public By getChangePasswordBy() {
		return changePasswordBy;
	}

	public By getBalanceEnquiryBy() {
		return balanceEnquiryBy;
	}

	public By getMiniStatementBy() {
		return miniStatementBy;
	}

	public By getCustomisedStatementBy() {
		return customisedStatementBy;
	}

	public By getLogOutBy() {
		return logOutBy;
	}


	public WebElement getWelcomMessageLocator() {
		return welcomMessageLocator;
	}

	public WebElement getManagerIdLocator() {
		return managerIdLocator;
	}

	public List<WebElement> getMenuElements() {
		return menuElements;
	}

	public WebElement getNewCustomerElement() {
		return newCustomerElement;
	}

	public WebElement getEditCustomerElement() {
		return editCustomerElement;
	}

	public WebElement getDeleteCustomerElement() {
		return deleteCustomerElement;
	}

	public WebElement getNewAccountElement() {
		return newAccountElement;
	}

	public WebElement getEditAccountElement() {
		return editAccountElement;
	}

	public WebElement getDeleteAccountElement() {
		return deleteAccountElement;
	}

	public WebElement getDepositElement() {
		return depositElement;
	}

	public WebElement getWithdrawalElement() {
		return withdrawalElement;
	}

	public WebElement getFundTransferElement() {
		return fundTransferElement;
	}

	public WebElement getChangePasswordElement() {
		return changePasswordElement;
	}

	public WebElement getBalanceEnquiryElement() {
		return balanceEnquiryElement;
	}

	public WebElement getMiniStatementElement() {
		return miniStatementElement;
	}

	public WebElement getCustomisedStatementElement() {
		return customisedStatementElement;
	}

	public WebElement getLogOutElement() {
		return logOutElement;
	}

}
