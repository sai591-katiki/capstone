package com.Magento.Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locaters.SignInPageObjects;
import com.aventstack.extentreports.Status;

public class SignInPage extends Browser {
 static SignInPageObjects obj;
 // Method to enter the Email
 public static void emailEnter(String str) {
		logger1.log(Status.INFO, " Enter the Email info");
	 obj=PageFactory.initElements(driver, SignInPageObjects.class);
	 try {
		 wait.until(ExpectedConditions.elementToBeClickable(obj.email));
		 obj.email.sendKeys(str);
		 logger1.log(Status.PASS, "Email is Entered");
	 }
	 catch(Exception e){
		 System.out.println("email is not entered");
		 logger1.log(Status.FAIL, "Email is  not Entered");
	 }
 }
//Method to enter the Password
public static void passwordEnter(String str) {
	logger1.log(Status.INFO, " Enter the Password info");
	 try {
		 wait.until(ExpectedConditions.elementToBeClickable(obj.password));
		 obj.password.sendKeys(str);
		 logger1.log(Status.PASS, "Password is Entered");
	 }
	 catch(Exception e){
		 System.out.println("password is not entered");
		 logger1.log(Status.FAIL, "Password is  not Entered");
	 }
}
//Method to click on the sign in button
public static void signInClick() {
	logger1.log(Status.INFO, " Click on the Sign In Button info");
	 try {
		 wait.until(ExpectedConditions.elementToBeClickable(obj.signIn));
		 obj.signIn.click();
		 logger1.log(Status.PASS, "Sign In Button is Clicked");
	 }
	 catch(Exception e){
		 System.out.println("sign in is not clicked");
		 logger1.log(Status.FAIL, "Sign In Button is not Clicked");
	 }
}
// Method for getting Error Message after Sign In
public static String errorAfterSignIn() {
	logger1.log(Status.INFO, " Getting Error Message after Sign In info");
	String msg=null;
	try {
		msg=obj.errorMessage.getText();
		logger1.log(Status.PASS, "Error Message is Displayed After Sign In");
	}
	catch(Exception e) {
		System.out.println(e);
		logger1.log(Status.FAIL, "Error Message is  not Displayed After Sign In");
	}
	return msg;
}
}
