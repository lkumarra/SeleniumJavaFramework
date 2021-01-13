package com.guru99demobank.listners;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.guru99demobank.utilities.ExtentManager;
import com.guru99demobank.utilities.Utilities;

public class Listners implements ITestListener {

	public static ExtentReports extent = ExtentManager.createInstance();
	public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();
	private static final Logger logger = LogManager.getLogger(Listners.class);

	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest test = extent
				.createTest(result.getTestClass().getName() + "     @TestCase : " + result.getMethod().getMethodName());
		testReport.set(test);
		logger.debug(result.getTestClass().getName() + "     @TestCase : " + result.getMethod().getMethodName() + " Execution started ");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		String logText = "<b>" + "TEST CASE:- " + methodName.toUpperCase() + " PASSED " + " TestName : "
				+ result.getTestName() + "</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		testReport.get().pass(m);
		logger.debug(result.getTestClass().getName() + "     @TestCase : " + result.getMethod().getMethodName() + " is Passed ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String excepionMessage = Arrays.toString(result.getThrowable().getStackTrace());
		testReport.get()
				.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
						+ "</font>" + "</b >" + "</summary>" + excepionMessage.replaceAll(",", "<br>") + "</details>"
						+ " \n");
		String failureLogg = "TEST CASE FAILED";
		Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
		testReport.get().log(Status.FAIL, m);
		testReport.get().addScreenCaptureFromPath(Utilities.captureScreenShot(result.getMethod().getMethodName()));
		logger.error(result.getTestClass().getName() + "     @TestCase : " + result.getMethod().getMethodName() + " is Failed "+"Error is "+excepionMessage);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		String logText = "<b>" + "Test Case:- " + methodName + " Skipped" + "</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		testReport.get().skip(m);
		logger.warn(result.getTestClass().getName() + "     @TestCase : " + result.getMethod().getMethodName() + " is Skipped ");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		if (extent != null) {

			extent.flush();
		}
	}

}
