package com.Magento.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locaters.SearchPageObjects;
import com.aventstack.extentreports.Status;

public class SearchPage extends Browser{
  static SearchPageObjects obj;
  // Method to enter the data in search box
  public static void enterSearch(String search) {
		logger1.log(Status.INFO, " Enter the data in Search Box info");
	  obj=PageFactory.initElements(driver, SearchPageObjects.class);
	  try {
		  wait.until(ExpectedConditions.elementToBeClickable(obj.searchBox));
		  obj.searchBox.sendKeys(search);
		  logger1.log(Status.PASS, "Data is entered in Search box");
	  }
	  catch(Exception e) {
		  System.out.println("search data is not entered");
		  logger1.log(Status.FAIL, "Data is not entered in Search box");
	  }
  }
  // Method to select the data from search list
  public static void searchList(String data) throws InterruptedException {
		logger1.log(Status.INFO, " Selecting data from Searchlist info");
	  Thread.sleep(3000);
	  try {
		  wait.until(ExpectedConditions.visibilityOfAllElements(obj.searchlist));
		  List<WebElement> list=obj.searchlist;
		  for(int i=0;i<list.size();i++) {
			  if(list.get(i).getText().contains(data)) {
				  list.get(i).click();
				  break;
			  }
		  }
		  logger1.log(Status.PASS, "Data is Selected from Searchlist");
	  }
	  catch(Exception e) {
		  System.out.println("Searched data is not Selected");
		  logger1.log(Status.FAIL, "Data is Selected from Searchlist");
	  }
  }
}
