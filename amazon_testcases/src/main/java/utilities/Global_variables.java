package utilities;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Global_variables {
	public static WebDriver driver; 
	public static ExtentReports report;
	public static ExtentSparkReporter sparkreporter;
	public static String filepath;
	public static ExtentTest test;
	public static String destinationpath;
}
