package com.guru99demobank.utilities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.guru99demobank.threadlocal.DriverManager;

public class Utilities {

	protected WebDriver driver;
	private static final Logger logger = LogManager.getLogger(Utilities.class);

	public Utilities() {
		this.driver = DriverManager.getWebdriver();
	}
	/**
	 * Return the instanse of the WebdriverWait
	 * 
	 * @return
	 */
	private synchronized WebDriverWait getWebdiverWaitInstance() {
		WebDriverWait driverWait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
		return driverWait;
	}

	/**
	 * Wait for maxixmum 30 second until a webelement in clickable state.
	 * 
	 * @param element : Webelement for wait.
	 */
	public synchronized void elementToBeClickableWait(WebElement element) {
		getWebdiverWaitInstance().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * Wait for maximux 30 second for the visisblity of webelement.
	 * 
	 * @param element : Webelement for wait.
	 */
	public synchronized void elementToBeVisisbleWait(WebElement element) {
		getWebdiverWaitInstance().until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Perform click operation on webelement.
	 * 
	 * @param element: Webelement to perform operation.
	 */
	public synchronized void clickOnElement(WebElement element) {
		this.elementToBeClickableWait(element);
		element.click();
		logger.debug("Clicked on "+element.getText());
	}

	/**
	 * Perform click operation on webelement using js executor.
	 * 
	 * @param element: Webelement to perform click operation.
	 */
	public synchronized void clickUsingJs(WebElement element) {
		this.elementToBeVisisbleWait(element);
		JavascriptExecutor executor = (JavascriptExecutor) this.driver;
		executor.executeScript("arguments[0].click();", element);
		logger.debug("Clicked on "+element.getText()+" using java script executor");
	}

	/**
	 * Enter text into weblement without.
	 * 
	 * @param element      : Webelement to enter text.
	 * @param textToEnter  : Text to enter in webelement.
	 * @param isAfterClear : True if clear operation has to be performed before text
	 *                     enter else false.
	 */
	public synchronized void enterTextIntoTextBox(WebElement element, String textToEnter, boolean isAfterClear) {
		this.elementToBeVisisbleWait(element);
		if (isAfterClear) {
			element.clear();
			logger.debug("Performing clear operation on "+element.toString().split(" -> ")[1]);
			element.sendKeys(textToEnter);
			logger.debug("Sending keys "+textToEnter+" on "+element.toString().split(" -> ")[1]);
		} else {
			element.sendKeys(textToEnter);
			logger.debug("Sending keys "+textToEnter+" on "+element.toString().split(" -> ")[1]);
		}
	}

	/**
	 * Perform clear operation on the webelement
	 * 
	 * @param element : Webelement to perform clear operation
	 */
	public synchronized void clearText(WebElement element) {
		this.elementToBeVisisbleWait(element);
		element.clear();
		logger.debug("Performing clear operation on "+element.toString().split(" -> ")[1]);
	}

	/**
	 * Return the text of webelement.
	 * 
	 * @param element : Webelement to get text.
	 * @return Text of webelement.
	 */
	public synchronized String getWebelementText(WebElement element) {
		this.elementToBeVisisbleWait(element);
		logger.debug("Getting the text of "+element.toString().split(" -> ")[1]);
		logger.debug("Text of "+element.toString().split(" -> ")[1]+" is "+element.getText());
		return element.getText();
	}

	/**
	 * Return the list of text of webelements.
	 * 
	 * @param webelementList : List of webelemets.
	 * @return List of text of webelements.
	 */
	public synchronized List<String> getWebelementsTexts(List<WebElement> webelementList) {
		List<String> textList = new ArrayList<String>();
		for (int iterator = 0; iterator < webelementList.size(); iterator++) {
			this.elementToBeVisisbleWait(webelementList.get(iterator));
			textList.add(webelementList.get(iterator).getText());
		}
		return textList;
	}

	/**
	 * Return the value of attribute
	 * 
	 * @param element   : Webelement to get attribute.
	 * @param attribute : Name of the attribute.
	 * @return attribute value.
	 */
	public synchronized String getArributeValue(WebElement element, String attribute) {
		this.elementToBeVisisbleWait(element);
		logger.debug("Getting the attribute "+attribute+" of "+element.toString().split(" -> ")[1]);
		logger.debug("Attribute of "+element.toString().split(" -> ")[1]+" is "+element.getAttribute(attribute));
		return element.getAttribute(attribute);
	}

	/**
	 * Return the css property value.
	 * 
	 * @param element      : Webelement to get css property.
	 * @param cssAttribute : property of CSS attribute.
	 * @return Css Property value.
	 */
	public synchronized String getCssValue(WebElement element, String cssAttribute) {
		this.elementToBeVisisbleWait(element);
		return element.getCssValue(cssAttribute);
	}

	/**
	 * Check webelement is enable or not.
	 * 
	 * @param element Webelement to check
	 * @return True if enable false otherwise.
	 */
	public synchronized boolean isEnabled(WebElement element) {
		this.elementToBeVisisbleWait(element);
		return element.isEnabled();
	}

	/**
	 * Return the instance of select class.
	 * 
	 * @param element : Webelement to perform select operation.
	 * @return instanse of select class.
	 */
	private synchronized Select getSelectInstance(WebElement element) {
		this.elementToBeVisisbleWait(element);
		return new Select(element);
	}

	/**
	 * Select a webelement using value.
	 * 
	 * @param element : Webelement to perform select operation.
	 * @param value   : Value to select
	 */
	public synchronized void selectElementByValue(WebElement element, String value) {
		this.getSelectInstance(element).selectByValue(value);
	}

	/**
	 * Select a webelement using text.
	 * 
	 * @param element : Webelement to perform select operation.
	 * @param text    : text to select
	 */
	public synchronized void selectElementByText(WebElement element, String text) {
		this.getSelectInstance(element).selectByVisibleText(text);
	}

	/**
	 * Select a webelement using index.
	 * 
	 * @param element : Webelement to perform select operation.
	 * @param index   : index to select.
	 */
	public synchronized void selectElementByIndex(WebElement element, int index) {
		this.getSelectInstance(element).selectByIndex(index);
	}

	/**
	 * Return the instance of action class.
	 * 
	 * @return instance of action class.
	 */
	private synchronized Actions getActionInstance() {
		return new Actions(this.driver);
	}

	/**
	 * Perform right click operation on the webelement.
	 * 
	 * @param element : Webelement to perform right click operation.
	 */
	public synchronized void performRightClickOperaion(WebElement element) {
		this.getActionInstance().contextClick(element).build().perform();
	}

	/**
	 * Perform mouse move action on the webelement.
	 * 
	 * @param element : Webelemet for perform mouse move operation
	 */
	public synchronized void mouseMoveToWebelement(WebElement element) {
		this.getActionInstance().moveToElement(element).build().perform();
	}

}
