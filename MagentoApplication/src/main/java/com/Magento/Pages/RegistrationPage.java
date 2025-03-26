package com.Magento.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Magento.Browser.Browser;
import com.Magento.Locaters.HomePageObjects;
import com.Magento.Locaters.RegistrationPageObjects;
import com.aventstack.extentreports.Status;

public class RegistrationPage extends Browser{
static RegistrationPageObjects obj;
// Method to enter the First Name
public  static void enterFirstName(String firstname) {
	logger1.log(Status.INFO, " Entering the First Name info");
	obj=PageFactory.initElements(driver, RegistrationPageObjects.class);
	
	try {
	wait.until(ExpectedConditions.elementToBeClickable(obj.firstName));
	 obj.firstName.sendKeys(firstname);
	logger1.log(Status.PASS, "First Name is Entered");
	}
	catch(Exception e) {
		System.out.println("firstname is not entered");
		logger1.log(Status.FAIL, "First Name is not Entered");
	}
}
// Method to Enter the Last Name
public  static void enterLastName(String lastname) {
	logger1.log(Status.INFO, " Entering the Last Name info");
	try {
		wait.until(ExpectedConditions.elementToBeClickable(obj.lastName));
	obj.lastName.sendKeys(lastname);
	logger1.log(Status.PASS, "Last Name is Entered");
	}
	catch(Exception e) {
		System.out.println("lastname is not entered");
		logger1.log(Status.FAIL, "Last name is not Entered");
	}
}
// Method to enter Email
public static void enterEmail(String email) {
	logger1.log(Status.INFO, " Entering the Email info");
	try {
		wait.until(ExpectedConditions.elementToBeClickable(obj.email));
	obj.email.clear();
	obj.email.sendKeys(email);
	logger1.log(Status.PASS, "Email is Entered");
	}
	catch(Exception e) {
		System.out.println("email is not entered");
		logger1.log(Status.FAIL, "Email is not Entered");
	}
}
// Method to enter the Password
public static void enterPassword(String password) {
	logger1.log(Status.INFO, " Entering the Password info");
	try {
		wait.until(ExpectedConditions.elementToBeClickable(obj.password));
	obj.password.sendKeys(password);
	logger1.log(Status.PASS, "Password is Entered");
	}
	catch(Exception e) {
		System.out.println("password is not entered");
		logger1.log(Status.FAIL, "Password is not Entered");
	}
}
// Method to enter Confirm Password
public static void enterConfirmPassword(String confirmPassword) {
	logger1.log(Status.INFO, " Entering the Confirm Password info");
	try {
		wait.until(ExpectedConditions.elementToBeClickable(obj.confirmPassword));
	obj.confirmPassword.sendKeys(confirmPassword);
	logger1.log(Status.PASS, " Confirm Password is Entered");
	}
	catch(Exception e) {
		System.out.println("password is not entered");
		logger1.log(Status.FAIL, "Password is not Entered");
	}
}
// Method to Click the Create an Account button
public static void createAnAccountButton() {
	logger1.log(Status.INFO, " Click on the Create an Account Button info");
	try {
		wait.until(ExpectedConditions.elementToBeClickable(obj.createAccount));
		obj.createAccount.click();
		logger1.log(Status.PASS, "Create An Account Button is Clicked");
	}
	catch(Exception e) {
		System.out.println(e);
		logger1.log(Status.FAIL, "Create An Account Button is not Clicked");
	}
}
// Method for getting error message under email
public static String errorMessage() {
	logger1.log(Status.INFO, " Getting Error Message Under Email info");
	String msg=null;
	try {
		msg=obj.emailError.getText();
		logger1.log(Status.PASS, "Error Message is displayed");
	}
	catch(Exception e) {
		System.out.println(e);
		logger1.log(Status.FAIL, "Error Message is not displayed");
	}
	return msg;
}
}
