package com.guru99demobank.elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NewCustomerPageLocators {

	private final String addNewCustomerHeadingXpath = "//p[@class = 'heading3']";
	private final String customerNameLabelXpath = "//input[@name = 'name']/parent::td/preceding-sibling::td";
	private final String genderLabelXpath = "//input[@value = 'm']/parent::td/preceding-sibling::td";
	private final String dobLabelXpath = "//input[@name = 'dob']/parent::td/preceding-sibling::td";
	private final String addressLabelXpath = "//textarea[@name = 'addr']/parent::td/preceding-sibling::td";
	private final String cityLableXpath = "//input[@name = 'city']/parent::td/preceding-sibling::td";
	private final String stateLabelXpath = "//input[@name = 'state']/parent::td/preceding-sibling::td";
	private final String pinLabelXpath = "//input[@name = 'pinno']/parent::td/preceding-sibling::td";
	private final String mobileNumberLabelXpath = "//input[@name = 'telephoneno']/parent::td/preceding-sibling::td";
	private final String emailLabelXpath = "//input[@name = 'emailid']/parent::td/preceding-sibling::td";
	private final String passwordLabelXpath = "//input[@name = 'password']/parent::td/preceding-sibling::td";
	private final String submitButtonName = "sub";
	private final String resetButtonName = "res";
	private final String customerNameInputName = "name";
	private final String genderMaleName = "m";
	private final String genderFemaleName = "f";
	private final String dobInputName = "dob";
	private final String addressInputName = "addr";
	private final String cityInputName = "city";
	private final String stateInputName = "state";
	private final String pinInputName = "pinno";
	private final String mobileNumberInputName = "telephoneno";
	private final String emailInputName = "emailid";
	private final String passwordInputName = "password";

	private By addNewCustomerHeadingBy = By.xpath(addNewCustomerHeadingXpath);
	private By customerNameLabelBy = By.xpath(customerNameLabelXpath);
	private By genderLableBy = By.xpath(genderLabelXpath);
	private By dobLabelBy = By.xpath(dobLabelXpath);
	private By addressLabelBy = By.xpath(addressLabelXpath);
	private By cityLabelBy = By.xpath(cityLableXpath);
	private By stateLabelBy = By.xpath(stateLabelXpath);
	private By pinLabelBy = By.xpath(pinLabelXpath);
	private By mobileNumberLabelBy = By.xpath(mobileNumberLabelXpath);
	private By emailLabelBy = By.xpath(emailLabelXpath);
	private By passwordLabelBy = By.xpath(passwordLabelXpath);
	private By submitButtonBy = By.name(submitButtonName);
	private By resetButtonBy = By.name(resetButtonName);
	private By customerNameInputBy = By.name(customerNameInputName);
	private By genderMaleBy = By.name(genderMaleName);
	private By genderFemaleBy = By.name(genderFemaleName);
	private By dobInputBy = By.name(dobInputName);
	private By addressInputBy = By.name(addressInputName);
	private By cityInputBy = By.name(cityInputName);
	private By stateInputBy = By.name(stateInputName);
	private By pinInputBy = By.name(pinInputName);
	private By mobileNumberInputBy = By.name(mobileNumberInputName);
	private By emailInputBy = By.name(emailInputName);
	private By passwordInputBy = By.name(passwordInputName);

	@CacheLookup
	@FindBy(xpath = addNewCustomerHeadingXpath)
	private WebElement addNewCustomerHeadingElement;

	@CacheLookup
	@FindBy(xpath = customerNameLabelXpath)
	private WebElement customeNameLabelElement;

	@CacheLookup
	@FindBy(xpath = genderLabelXpath)
	private WebElement genderLabelElement;

	@CacheLookup
	@FindBy(xpath = dobLabelXpath)
	private WebElement dobLabelElement;

	@CacheLookup
	@FindBy(xpath = addressLabelXpath)
	private WebElement addressLabelElement;

	@CacheLookup
	@FindBy(xpath = cityLableXpath)
	private WebElement cityLabelElement;

	@CacheLookup
	@FindBy(xpath = stateLabelXpath)
	private WebElement stateLabelElement;

	@CacheLookup
	@FindBy(xpath = pinLabelXpath)
	private WebElement pinLabelElement;

	@CacheLookup
	@FindBy(xpath = mobileNumberLabelXpath)
	private WebElement mobileNumberLabeElement;

	@CacheLookup
	@FindBy(xpath = emailLabelXpath)
	private WebElement emailLabelElement;

	@CacheLookup
	@FindBy(xpath = passwordLabelXpath)
	private WebElement passwordLabelElement;

	@CacheLookup
	@FindBy(name = submitButtonName)
	private WebElement submitButtonElement;

	@CacheLookup
	@FindBy(name = resetButtonName)
	private WebElement resetButtonElement;

	@CacheLookup
	@FindBy(name = customerNameInputName)
	private WebElement customerNameInputElement;

	@CacheLookup
	@FindBy(name = genderMaleName)
	private WebElement genderMaleElement;

	@CacheLookup
	@FindBy(name = genderFemaleName)
	private WebElement genderFemaleELElement;

	@CacheLookup
	@FindBy(name = dobInputName)
	private WebElement dobInputElement;

	@CacheLookup
	@FindBy(name = addressInputName)
	private WebElement addressInputElement;

	@CacheLookup
	@FindBy(name = cityInputName)
	private WebElement cityInputElement;

	@CacheLookup
	@FindBy(name = stateInputName)
	private WebElement stateInputElement;

	@CacheLookup
	@FindBy(name = pinInputName)
	private WebElement pinInputElement;

	@CacheLookup
	@FindBy(name = mobileNumberInputName)
	private WebElement mobileNumberInElement;

	@CacheLookup
	@FindBy(name = emailInputName)
	private WebElement emailInputElement;

	@CacheLookup
	@FindBy(name = passwordInputName)
	private WebElement passwordInputElement;

	public By getAddNewCustomerHeadingBy() {
		return addNewCustomerHeadingBy;
	}

	public By getCustomerNameLabelBy() {
		return customerNameLabelBy;
	}

	public By getGenderLableBy() {
		return genderLableBy;
	}

	public By getDobLabelBy() {
		return dobLabelBy;
	}

	public By getAddressLabelBy() {
		return addressLabelBy;
	}

	public By getCityLabelBy() {
		return cityLabelBy;
	}

	public By getStateLabelBy() {
		return stateLabelBy;
	}

	public By getPinLabelBy() {
		return pinLabelBy;
	}

	public By getMobileNumberLabelBy() {
		return mobileNumberLabelBy;
	}

	public By getEmailLabelBy() {
		return emailLabelBy;
	}

	public By getPasswordLabelBy() {
		return passwordLabelBy;
	}

	public By getSubmitButtonBy() {
		return submitButtonBy;
	}

	public By getResetButtonBy() {
		return resetButtonBy;
	}

	public By getCustomerNameInputBy() {
		return customerNameInputBy;
	}

	public By getGenderMaleBy() {
		return genderMaleBy;
	}

	public By getGenderFemaleBy() {
		return genderFemaleBy;
	}

	public By getDobInputBy() {
		return dobInputBy;
	}

	public By getAddressInputBy() {
		return addressInputBy;
	}

	public By getCityInputBy() {
		return cityInputBy;
	}

	public By getStateInputBy() {
		return stateInputBy;
	}

	public By getPinInputBy() {
		return pinInputBy;
	}

	public By getMobileNumberInputBy() {
		return mobileNumberInputBy;
	}

	public By getEmailInputBy() {
		return emailInputBy;
	}

	public By getPasswordInputBy() {
		return passwordInputBy;
	}

	public WebElement getAddNewCustomerHeadingElement() {
		return addNewCustomerHeadingElement;
	}

	public WebElement getCustomeNameLabelElement() {
		return customeNameLabelElement;
	}

	public WebElement getGenderLabelElement() {
		return genderLabelElement;
	}

	public WebElement getDobLabelElement() {
		return dobLabelElement;
	}

	public WebElement getAddressLabelElement() {
		return addressLabelElement;
	}

	public WebElement getCityLabelElement() {
		return cityLabelElement;
	}

	public WebElement getStateLabelElement() {
		return stateLabelElement;
	}

	public WebElement getPinLabelElement() {
		return pinLabelElement;
	}

	public WebElement getMobileNumberLabeElement() {
		return mobileNumberLabeElement;
	}

	public WebElement getEmailLabelElement() {
		return emailLabelElement;
	}

	public WebElement getPasswordLabelElement() {
		return passwordLabelElement;
	}

	public WebElement getSubmitButtonElement() {
		return submitButtonElement;
	}

	public WebElement getResetButtonElement() {
		return resetButtonElement;
	}

	public WebElement getCustomerNameInputElement() {
		return customerNameInputElement;
	}

	public WebElement getGenderMaleElement() {
		return genderMaleElement;
	}

	public WebElement getGenderFemaleELElement() {
		return genderFemaleELElement;
	}

	public WebElement getDobInputElement() {
		return dobInputElement;
	}

	public WebElement getAddressInputElement() {
		return addressInputElement;
	}

	public WebElement getCityInputElement() {
		return cityInputElement;
	}

	public WebElement getStateInputElement() {
		return stateInputElement;
	}

	public WebElement getPinInputElement() {
		return pinInputElement;
	}

	public WebElement getMobileNumberInElement() {
		return mobileNumberInElement;
	}

	public WebElement getEmailInputElement() {
		return emailInputElement;
	}

	public WebElement getPasswordInputElement() {
		return passwordInputElement;
	}
}
