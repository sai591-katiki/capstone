package com.Magento.ScreenShot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Magento.Browser.Browser;
import com.aventstack.extentreports.Status;
// Method to Capture the Screenshot
public class CaptureScreenShot extends Browser{
	public static void screenShot(String name) throws Exception { 
		logger1=extent.createTest("Taking Sreenshot");
		logger1.log(Status.INFO, " Taking Screenshot info");
	
		try {

			TakesScreenshot shot = ((TakesScreenshot) driver);

			File source = shot.getScreenshotAs(OutputType.FILE);

			String path = System.getProperty("user.dir") + "\\target\\ScreenShot\\" + name + ".png";

			File destination = new File(path);

			FileUtils.copyFile(source, destination);
			logger1.log(Status.PASS, "Screenshot is Captured");

		} catch (Exception e) {

			System.out.println("Screenshot not Caputred");
			logger1.log(Status.FAIL, "Screenshot is  not Captured");
}

}
}
