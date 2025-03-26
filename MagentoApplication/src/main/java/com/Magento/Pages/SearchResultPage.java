package com.Magento.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Magento.Browser.Browser;
import com.Magento.Locaters.SearchResultPageObjects;
import com.Magento.ScreenShot.CaptureScreenShot;
import com.aventstack.extentreports.Status;

public class SearchResultPage extends Browser {
	
 static SearchResultPageObjects obj;
 // method to click on the product
 public static void productClick(String str) {
		logger1.log(Status.INFO, "Click on the Product info");
	 obj=PageFactory.initElements(driver, SearchResultPageObjects.class);
	 try {
		 js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,600)", "");
	  List<WebElement> list=obj.productList;
	  for(int i=0;i<list.size();i++) {
		  if(list.get(i).getText().contains(str)) {
			  list.get(i).click();
			  break;
		  }
	  }
	  logger1.log(Status.PASS, "Product is Clicked");
}
catch(Exception e) {
	  System.out.println("Product is not Selected");
	  logger1.log(Status.FAIL, "Product is not Clicked");
}
 }
 // method to select the size
 public static void sizeClick(String str) {
		logger1.log(Status.INFO, "Click on the Size info");
	 try {
		 js.executeScript("window.scrollBy(0,400)", "");
	  List<WebElement> list=obj.sizeList;
	  for(int i=0;i<list.size();i++) {
		  if(list.get(i).getText().equalsIgnoreCase(str)) {
			  list.get(i).click();
			  break;
		  }
	  }
	  logger1.log(Status.PASS, "Size is Clicked");
}
catch(Exception e) {
	  System.out.println("Size is not Selected");
	  logger1.log(Status.FAIL, "Size is not Clicked");
}
 }
 // Method to Select the color
 public static void colorClick(String str) {
		logger1.log(Status.INFO, "Click on the Color info");
	 try {
	  List<WebElement> list=obj.colorList;
	  for(int i=0;i<list.size();i++) {
		  System.out.println(list.get(i).getAttribute("option-label"));
		  if(list.get(i).getAttribute("option-label").equalsIgnoreCase(str)) {
			  list.get(i).click();
			  break;
		  }
	  }
	  logger1.log(Status.PASS, "Color is Clicked");
}
catch(Exception e) {
	  System.out.println("color is not Selected");
	  logger1.log(Status.FAIL, "Color is not Clicked");
}
 }
 // Method to Enter the Quantity of Product
 public static void enterQuantity(String str) {
		logger1.log(Status.INFO, "Enter the Quantity info");
	 try {
		 wait.until(ExpectedConditions.elementToBeClickable(obj.quantity));
		 obj.quantity.clear();
		 obj.quantity.sendKeys(str);
		 logger1.log(Status.PASS, "Quantity is Entered");
	 }
	 catch(Exception e) {
		 System.out.println("Quantity is not entered");
		 logger1.log(Status.FAIL, "Quantity is not Entered");
	 }
 }
 // Method to click on Add to Cart Button
 public static void addToCart() {
		logger1.log(Status.INFO, "Click on the Add to Cart Button info");
	 try {
		 wait.until(ExpectedConditions.elementToBeClickable(obj.addToCartButton));
		 obj.addToCartButton.click();
		 logger1.log(Status.PASS, "Add to Cart Button is Clicked");
	 }
	 catch(Exception e) {
		 System.out.println("Add to Cart Button is not Clicked");
		 logger1.log(Status.FAIL, "Add to Cart Button is not Clicked");
	 }
 }
 // Method for Getting Added to Cart Message
 public static String addedMessage() {
		logger1.log(Status.INFO, "Getting Add Cart Message info");
	 String msg=null;
		try {
			js.executeScript("window.scrollBy(0,-400)", "");
			wait.until(ExpectedConditions.elementToBeClickable(obj.addedMessage));
			msg=obj.addedMessage.getText();
			CaptureScreenShot.screenShot("ProductAddedMessage");
			logger1.log(Status.PASS, "Product Added Message is Displayed");
		}
		catch(Exception e) {
			System.out.println(e);
			logger1.log(Status.PASS, "Product Added Message is not Displayed");
		}
		return msg;
 }
 }
