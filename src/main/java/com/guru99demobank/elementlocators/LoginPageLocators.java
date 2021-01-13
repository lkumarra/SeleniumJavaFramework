package com.guru99demobank.elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

	private final String userIdXpath = "(//td[@align = 'right'])[1]";
	private final String userIdInputname = "uid";
	private final String passwordLabelXpath = "(//td[@align = 'right'])[2]";
	private final String passwordInputBoxName = "password";
	private final String loginButtonName = "btnLogin";
	private final String resetButtonName = "btnReset";

	private By userIdLabelBy = By.xpath(userIdXpath);
	private By userIdInputBoxBy = By.name(userIdInputname);
	private By passwordLabelBy = By.xpath(passwordLabelXpath);
	private By passwordInputBoxBy = By.name(passwordInputBoxName);
	private By loginButtonBy = By.name(loginButtonName);
	private By resetButtonBy = By.name(resetButtonName);

	@CacheLookup
	@FindBy(xpath = userIdXpath)
	private WebElement userIdLabelElement;

	@CacheLookup
	@FindBy(name = userIdInputname)
	private WebElement userIdInputBoxElement;

	@CacheLookup
	@FindBy(xpath = passwordLabelXpath)
	private WebElement passwordLabelElement;

	@CacheLookup
	@FindBy(name = passwordInputBoxName)
	private WebElement passwordInputBoxElement;

	@CacheLookup
	@FindBy(name = loginButtonName)
	private WebElement loginButtonElement;

	@CacheLookup
	@FindBy(name = resetButtonName)
	private WebElement resetButtonElement;

	public By getUserIdLabelBy() {
		return userIdLabelBy;
	}

	public By getUserIdInputBoxBy() {
		return userIdInputBoxBy;
	}

	public By getPasswordLabelBy() {
		return passwordLabelBy;
	}

	public By getPasswordInputBoxBy() {
		return passwordInputBoxBy;
	}

	public By getLoginButtonBy() {
		return loginButtonBy;
	}

	public By getResetButtonBy() {
		return resetButtonBy;
	}

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
