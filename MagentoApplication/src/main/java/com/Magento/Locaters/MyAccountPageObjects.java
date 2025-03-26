package com.Magento.Locaters;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.Magento.Browser.Browser;

public class MyAccountPageObjects extends Browser {
	@FindBy(xpath = "//span[@data-ui-id='page-title-wrapper'] ") 
	public WebElement myAccountTextElement;
	@FindBy(xpath = "//h1[@class='page-title']/span")
	public WebElement myAccount;

	@FindBy(xpath="//div[text()='Thank you for registering with Main Website Store.']") 
	public WebElement registrationText;
	@FindBy(xpath = "//button[@data-action='customer-menu-toggle']")
	public WebElement icon;
	@FindBy(xpath = "//li[@class='authorization-link']/a")
	public WebElement signOut;

}
