package com.guru99demobank.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.guru99demobank.elementlocators.NewCustomerPageLocators;
import com.guru99demobank.threadlocal.DriverManager;
import com.guru99demobank.utilities.Utilities;

public class NewCustomerPage {

	public NewCustomerPageLocators newCLocators;
	Utilities utilities = new Utilities();

	public NewCustomerPage() {
		newCLocators = new NewCustomerPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(DriverManager.getWebdriver(), 30);
		PageFactory.initElements(factory, newCLocators);
	}

	/**
	 * Return the text of add new customer heading.
	 * 
	 * @return : Text of heading
	 */
	public String getAddNewCustomerLabelText() {
		return utilities.getWebelementText(newCLocators.getAddNewCustomerHeadingElement());
	}

	/**
	 * Return the text of customer name label.
	 * 
	 * @return : Text of customer name label.
	 */
	public String getCustomerNameLabelText() {
		return utilities.getWebelementText(newCLocators.getCustomeNameLabelElement());
	}

	/**
	 * Return the text of gender label.
	 * 
	 * @return : Text of gender lable.
	 */
	public String getGenderLabelText() {
		return utilities.getWebelementText(newCLocators.getGenderLabelElement());
	}

	/**
	 * Return the text of DOB label.
	 * 
	 * @return : DOB label text.
	 */
	public String getDobLabelText() {
		return utilities.getWebelementText(newCLocators.getDobLabelElement());
	}

	/**
	 * Return the text of Address Label.
	 * 
	 * @return : Address label text.
	 */
	public String getAddressLabelText() {
		return utilities.getWebelementText(newCLocators.getAddressLabelElement());
	}

	/**
	 * Return the text of City label.
	 * 
	 * @return : Text of city label.
	 */
	public String getCityLabelText() {
		return utilities.getWebelementText(newCLocators.getCityLabelElement());
	}

	/**
	 * Return the text of state label.
	 * 
	 * @return : Text of state label.
	 */
	public String getStateLabelText() {
		return utilities.getWebelementText(newCLocators.getStateLabelElement());
	}

	/**
	 * Return the text of pin label.
	 * 
	 * @return : Text of pin lable.
	 */
	public String getPinLabelText() {
		return utilities.getWebelementText(newCLocators.getPinLabelElement());
	}

	/**
	 * Return the text of mobile number label.
	 * 
	 * @return : Mobile number label text.
	 */
	public String getMobileNumberLabelText() {
		return utilities.getWebelementText(newCLocators.getMobileNumberLabeElement());
	}

	/**
	 * Return the text of email label.
	 * 
	 * @return : Email label text.
	 */
	public String getEmailLabelText() {
		return utilities.getWebelementText(newCLocators.getEmailLabelElement());
	}

	/**
	 * Return the text of password label.
	 * 
	 * @return : Password label text.
	 */
	public String getPasswordLabelText() {
		return utilities.getWebelementText(newCLocators.getPasswordLabelElement());
	}

	/**
	 * Perform click operation on submit button.
	 */
	public void clickOnSubmitButton() {
		utilities.clickOnElement(newCLocators.getSubmitButtonElement());
	}

	/**
	 * Perform click operation on reset button.
	 */
	public void clickOnResetButton() {
		utilities.clickOnElement(newCLocators.getResetButtonElement());
	}

	/**
	 * Enter text into Customer Name Input Box.
	 * 
	 * @param customerName : Customer name to enter.
	 */
	public void enterCustomerName(String customerName) {
		utilities.enterTextIntoTextBox(newCLocators.getCustomerNameInputElement(), customerName, true);
	}

	/**
	 * Select the gender as male.
	 */
	public void selectMaleGender() {
		utilities.clickOnElement(newCLocators.getGenderMaleElement());
	}

	/**
	 * Select the gender as female.
	 */
	public void selectFemaleGender() {
		utilities.clickOnElement(newCLocators.getGenderFemaleELElement());
	}

	/**
	 * Enter the date of birth in DOB input field.
	 * 
	 * @param dateOfBirth : Date of birth to enter.
	 */
	public void enterDateOfBirth(String dateOfBirth) {
		utilities.enterTextIntoTextBox(newCLocators.getDobInputElement(), dateOfBirth, true);
	}

	/**
	 * Enter address in Address input filed.
	 * 
	 * @param address : Address to enter.
	 */
	public void enterAddress(String address) {
		utilities.enterTextIntoTextBox(newCLocators.getAddressInputElement(), address, true);
	}

	/**
	 * Enter city in City input field.
	 * 
	 * @param city : City to enter.
	 */
	public void enterCity(String city) {
		utilities.enterTextIntoTextBox(newCLocators.getCityInputElement(), city, true);
	}

	/**
	 * Enter state in State input field.
	 * 
	 * @param state : State to enter.
	 */
	public void enterState(String state) {
		utilities.enterTextIntoTextBox(newCLocators.getStateInputElement(), state, true);
	}

	/**
	 * Enter pin in PIN input field.
	 * 
	 * @param pin : Pin to enter.
	 */
	public void enterPin(String pin) {
		utilities.enterTextIntoTextBox(newCLocators.getPinInputElement(), pin, true);
	}

	/**
	 * Enter mobile number in Mobile Number input field.
	 * 
	 * @param mobileNumber : Mobile number to enter.
	 */
	public void enterMobileNumber(String mobileNumber) {
		utilities.enterTextIntoTextBox(newCLocators.getMobileNumberInElement(), mobileNumber, true);
	}

	/**
	 * Enter email in Email input field.
	 * 
	 * @param email : Email to enter.
	 */
	public void enterEmail(String email) {
		utilities.enterTextIntoTextBox(newCLocators.getEmailInputElement(), email, true);
	}

	/**
	 * Enter password in Password input field.
	 * 
	 * @param password : Password to enter.
	 */
	public void enterPassword(String password) {
		utilities.enterTextIntoTextBox(newCLocators.getPasswordInputElement(), password, true);
	}

}
