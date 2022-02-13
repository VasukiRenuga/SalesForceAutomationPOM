package com.training.utilities;

import java.io.File;

public class Constants {
	public static final String APPLICATION_PROPERTIES = "properties" + File.separator + "application.properties";
	public static final String USER_DIR = System.getProperty("user.dir");
	public static final String SCREENSHOT_PATH=USER_DIR+"/screenshots/";
	public static final String GENERATE_REPORT_PATH= USER_DIR+"/ExtentReports/report.html";
}
