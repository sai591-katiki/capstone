package com.Magento.Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locaters.HomePageObjects;
import com.aventstack.extentreports.Status;

public class HomePage extends Browser{
static HomePageObjects obj;
// Method to Click on the Create Account link
public static void createAnAccountLink() {
	logger1.log(Status.INFO, "Create An Account Link info");
	obj=PageFactory.initElements(driver, HomePageObjects.class);
	try {
		wait.until(ExpectedConditions.elementToBeClickable(obj.createAccountLink));
		obj.createAccountLink.click();
		logger1.log(Status.PASS, "Create An Account Link is Clicked");
	}
	catch(Exception e) {
		System.out.println(e);
		logger1.log(Status.FAIL, "Create An Account Link is not Clicked");
	}
}
//Method to Click on the Sign in link
public  static void signInLink() {
	logger1.log(Status.INFO, "Sign In Link info");
	obj=PageFactory.initElements(driver, HomePageObjects.class);
	try {
	wait.until(ExpectedConditions.elementToBeClickable(obj.signInLink));
	obj.signInLink.click();
	logger1.log(Status.PASS, "Sign In Link is  Clicked");
	}
	catch(Exception e) {
		System.out.println(e);
		logger1.log(Status.FAIL, "Sign In Link is not Clicked");
	}
}
}
