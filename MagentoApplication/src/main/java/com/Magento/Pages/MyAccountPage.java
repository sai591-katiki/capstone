package com.Magento.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Magento.Browser.Browser;
import com.Magento.Locaters.MyAccountPageObjects;
import com.aventstack.extentreports.Status;

public class MyAccountPage extends Browser {
static MyAccountPageObjects obj;

	//Method for getting Successful Registration Message
public static String registrationText(){
	logger1.log(Status.INFO, "Getting Successfully Registred Message info");
	obj=PageFactory.initElements(driver, MyAccountPageObjects.class);
	wait.until(ExpectedConditions.elementToBeClickable(obj.registrationText));
String text=null; 
try
{
text=obj.registrationText.getText();
logger1.log(Status.PASS, "Getting Successufully Registered Message");
}
catch(Exception e)
{
 System.out.println("Exception in MyAccountText method : "+e);
 logger1.log(Status.FAIL, " Not Getting Successufully Registered Message");
}
return text;
}
//Method for Getting Home Page text
public static String myAccountText(){
	logger1.log(Status.INFO, "getting the Home page text Message info");
	obj=PageFactory.initElements(driver, MyAccountPageObjects.class);
	wait.until(ExpectedConditions.elementToBeClickable(obj.myAccountTextElement));
String text=null; 
try
{
text=obj.myAccountTextElement.getText();
logger1.log(Status.PASS, " Successfully getting the Home page text Message");
}
catch(Exception e)
{
 System.out.println("Exception in MyAccountText method : "+e);
 logger1.log(Status.FAIL, " Not getting the Home page text Message");
}
return text;
}
// Method to Click on the Icon
public static void iconClick() {
	logger1.log(Status.INFO, "Click on the Dropdown Icon info");
	obj=PageFactory.initElements(driver, MyAccountPageObjects.class);
	try {
		wait.until(ExpectedConditions.elementToBeClickable(obj.icon));
		act=new Actions(driver);
		act.moveToElement(obj.icon).click().perform();
		logger1.log(Status.PASS, "Icon is clicked");
	}
	catch(Exception e) {
		System.out.println("icon is not clicked");
		logger1.log(Status.FAIL, "icon is not clicked");
	}
}
//Method to click on the Sign Out button
public static void signOutClick() {
	logger1.log(Status.INFO, "Click on the Sign Out info");
	obj=PageFactory.initElements(driver, MyAccountPageObjects.class);
	
	try {
		wait.until(ExpectedConditions.elementToBeClickable(obj.signOut));
		act.moveToElement(obj.signOut).click().perform();
		logger1.log(Status.PASS, "Sign Out is Clicked");
	}
	catch(Exception e) {
		System.out.println("Sign Out button is not clicked");
		logger1.log(Status.FAIL, "Sign Out is  not Clicked");
	}
}
// Method to get My Account Text and Check the Element is Displayed or not
public static String myAccountMessage(){   
	logger1.log(Status.INFO, "Checking My Account is Displayed info");
	obj=PageFactory.initElements(driver, MyAccountPageObjects.class);
	wait.until(ExpectedConditions.elementToBeClickable(obj.myAccount));
String msg=null; 
try
{
if(obj.myAccount.isDisplayed()) {
msg=obj.myAccount.getText();
System.out.println("The Element is Displayed");
}
else {
	System.out.println("Element is not Displayed");
}
logger1.log(Status.PASS, "Element is Displayed");
}
catch(Exception e)
{
System.out.println("Exception in MyAccountText method : "+e);
logger1.log(Status.FAIL, "Element is not Displayed");
}
return msg;
}
}
