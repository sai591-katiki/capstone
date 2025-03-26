package com.Magento.Pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Magento.Browser.Browser;
import com.Magento.Locaters.CartObjects;
import com.aventstack.extentreports.Status;

public class CartPage extends Browser {
static CartObjects obj;
// Method to Click on the Cart Link
public static void cartClick() {
	logger1.log(Status.INFO, "Cart Page Link info");
	obj=PageFactory.initElements(driver, CartObjects.class);
	try {
	wait.until(ExpectedConditions.elementToBeClickable(obj.cartLink));
	obj.cartLink.click();
	logger1.log(Status.PASS, "Cart Page link is clicked");
	}
	catch(Exception e) {
		System.out.println("cart Link not clicked");
		logger1.log(Status.FAIL, "Cart Page link is not clicked");
	}
}
// Method for getting Bella Tank Message
public static String bellaTankMessage() {
	logger1.log(Status.INFO, "Getting Bella Tank Message info");
	String msg=null;
	try {
		js.executeScript("window.scrollBy(0,200)", "");
	//	wait.until(ExpectedConditions.elementToBeClickable(obj.bellaTank));
		msg = (String) js.executeScript("return arguments[0].textContent;", obj.bellaTank);
		logger1.log(Status.PASS, "Bella Tank Message is displayed");
	}
	catch(Exception e) {
		System.out.println("bella tank text not getting");
		logger1.log(Status.FAIL, "Bella Tank Message is not displayed");
	}
	return msg;
}
// Method for getting Radiant Tee Message
public static String radiantTeeMessage() {
	logger1.log(Status.INFO, "Getting Bella Tank Message info");
	String msg=null;
	try {
		msg = (String) js.executeScript("return arguments[0].textContent;", obj.radiantTee);
		logger1.log(Status.PASS, "Radiant Tee Message is displayed");
	}
	catch(Exception e) {
		System.out.println("Radiant Tee text not getting");
		logger1.log(Status.FAIL, "Radiant Tee Message is not displayed");
	}
	return msg;
}
//Method for getting Price
public static String priceGetting() throws InterruptedException {
	logger1.log(Status.INFO, "Getting price info");

	String msg=null;
	Thread.sleep(3000);
	try {
		
		msg = (String) js.executeScript("return arguments[0].textContent;", obj.price);
		logger1.log(Status.PASS, "Price is displayed");
	}
	catch(Exception e) {
		System.out.println("Price is not getting");
		logger1.log(Status.FAIL, "Price is not displayed");
	}
	return msg;
}
}
