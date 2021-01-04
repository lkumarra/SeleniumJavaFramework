package com.guru99demobank.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import com.guru99demobank.constants.DirectoryPaths;

public class ExtentManager {
	
   public static ExtentReports extent;
	
	public static ExtentReports createInstance() {
		ExtentSparkReporter spark = new ExtentSparkReporter(DirectoryPaths.REPORT_PATH);
		spark.viewConfigurer()
	    .viewOrder()
	    .as(new ViewName[] { 
		   ViewName.DASHBOARD, 
		   ViewName.TEST,  
		   ViewName.AUTHOR, 
		   ViewName.DEVICE, 
		   ViewName.EXCEPTION, 
		   ViewName.LOG 
		})
	  .apply();
		extent = new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Automation Engineer", "Lavendra Kumar Rajput");
		extent.setSystemInfo("Organization", "Open Source");
		return extent;
	}

}
