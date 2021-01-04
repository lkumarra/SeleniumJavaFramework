package com.guru99demobank.constants;

import java.util.Date;

public class DirectoryPaths {

	public static final String DATE = new Date().toString().replace(" ", "_").replace(":", "_");
	public static final String CURR_DIR = System.getProperty("user.dir");
	public static final String FRAMEWORK_VERSION = CURR_DIR + "\\src\\main\\resources\\FrameworkVersion\\Version.txt";
	public static final String LOG_PATH = CURR_DIR + "\\src\\test\\resources\\Logs\\Guru99Bank.log";
	public static final String REPORT_PATH = CURR_DIR + "\\src\\test\\resources\\Testreports\\Guru99Reports.html";
	public static final String REPORT_MOVE = CURR_DIR
			+ "\\src\\test\\resources\\ExecutionArtifacts\\Artifacts\\Guru99Reports.html";
	public static final String LOG_MOVE = CURR_DIR
			+ "\\src\\test\\resources\\ExecutionArtifacts\\Artifacts\\Guru99Bank.log";
	public static final String ZIP_ARTIFACTS = CURR_DIR + "\\src\\test\\resources\\ExecutionArtifacts\\Artifacts" + "_" + DATE
			+ ".zip";
	public static final String SCREENSHOT_FOLDER = CURR_DIR + "src\\test\\resources\\Sreenshots";
	public static final String ARTIFACTS_FOLDER = CURR_DIR + "\\src\\test\\resources\\ExecutionArtifacts\\Artifacts";

}
