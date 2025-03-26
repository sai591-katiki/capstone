package com.Magento.Browser;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Magento.Browser.Utility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions act;
	public static JavascriptExecutor js;
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentTest logger1;
	// Method to get the Extent Reports
	public static void init(String reportName) {
		
		reporter=new ExtentSparkReporter(System.getProperty("user.dir") + "//target//ExtentReports//" + reportName + ".html");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
	}
	/*
	 * Open the browser based on the choice
	 */
	public static void openBrowser() throws Exception {
		logger1.log(Status.INFO, "opening the browser info");
		try {
			String choice = Utility.properties("browser"); 
			if (choice.equalsIgnoreCase("Chrome"))
				driver = new ChromeDriver();
			else if (choice.equalsIgnoreCase("Edge"))
				driver = new EdgeDriver();
			logger1.log(Status.PASS, "Browser is Opened");
		} catch (Exception e) {
			logger1.log(Status.FAIL, "Browser not Opened");
			System.out.println("Browser not opened");
		}
	
	}

	/*
	 * method to navigate to the URL of the application
	 */
	public static void navigateToUrl(String url) throws Exception {
		logger1.log(Status.INFO, "Navigate to the URL  info");
		try {
			driver.get(url); 
			driver.manage().window().maximize();
			act = new Actions(driver);
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			logger1.log(Status.PASS, "Navigated to the Url Successfully");
		} catch (Exception e) {
			System.out.println("Browser - geturl"+e);
			logger1.log(Status.FAIL, "Not Navigated to the URL");
		}
	}
	
	 // Method to Closes the Browser
	 public static void closeBrowser() {
			logger1.log(Status.INFO, "Closing the Browser info");
		try {
			driver.quit();
			logger1.log(Status.PASS, "Browser is closed");
		} catch (Exception e) {
			System.out.println("Browser not closed");
			logger1.log(Status.FAIL, "Browser is not closed");
		}
	}
}
