package com.guru99demobank.listners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import com.guru99demobank.constants.DirectoryPaths;
import com.guru99demobank.utilities.FileUtilities;

public class SuiteListners implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		FileUtilities.moveAllFiles(DirectoryPaths.LOG_PATH, DirectoryPaths.LOG_MOVE);
		FileUtilities.moveAllFiles(DirectoryPaths.REPORT_PATH, DirectoryPaths.REPORT_MOVE);
		FileUtilities.zipAllExecutionArtifacts(DirectoryPaths.ARTIFACTS_FOLDER, DirectoryPaths.ZIP_ARTIFACTS);
		FileUtilities.deleteFile(DirectoryPaths.LOG_MOVE);
		FileUtilities.deleteFile(DirectoryPaths.REPORT_MOVE);
	}

	@Override
	public void onFinish(ISuite suite) {
		
		
	}

}
