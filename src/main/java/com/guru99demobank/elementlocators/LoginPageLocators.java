package com.guru99demobank.elementlocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

	@CacheLookup
	@FindBy(xpath = "(//td[@align = 'right'])[1]")
	private WebElement userIdLabelElement;

	@CacheLookup
	@FindBy(name = "uid")
	private WebElement userIdInputBoxElement;
	
	@CacheLookup
	@FindBy(xpath = "(//td[@align = 'right'])[1]")
	private WebElement passwordLabelElement;

	@CacheLookup
	@FindBy(name = "password")
	private WebElement passwordInputBoxElement;

	@CacheLookup
	@FindBy(name = "btnLogin")
	private WebElement loginButtonElement;

	@CacheLookup
	@FindBy(name = "btnReset")
	private WebElement resetButtonElement;

	public WebElement getUserIdLabelElement() {
		return userIdLabelElement;
	}

	public WebElement getUserIdInputBoxElement() {
		return userIdInputBoxElement;
	}

	public WebElement getPasswordLabelElement() {
		return passwordLabelElement;
	}

	public WebElement getPasswordInputBoxElement() {
		return passwordInputBoxElement;
	}

	public WebElement getLoginButtonElement() {
		return loginButtonElement;
	}

	public WebElement getResetButtonElement() {
		return resetButtonElement;
	}

}
