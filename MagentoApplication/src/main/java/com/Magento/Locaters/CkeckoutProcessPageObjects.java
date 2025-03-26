package com.Magento.Locaters;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class CkeckoutProcessPageObjects {
@FindBy(xpath = "//span[text()='My Cart']")
public WebElement cartIcon;
@FindBy(id = "top-cart-btn-checkout")
public WebElement processCheckout;
@FindBy(id = "X7C9MEU")
public WebElement firstName;
@FindBy(id = "H72T03R")
public WebElement lastName;
@FindBy(id = "NQNRPII")
public WebElement address;
@FindBy(id = "NIWTY08")
public WebElement city;
@FindBy(id = "FK1KTS3")
public WebElement stateDropDown;
@FindBy(id = "AB6SD2T")
public WebElement pinCode;
@FindBy(id = "HGBASY0")
public WebElement country;
@FindBy(id = "W847YOB")
public WebElement phoneNumber;
@FindAll(@FindBy(xpath = "//div[@id='FK1KTS3']/option"))
@CacheLookup
public List<WebElement> stateList;
@FindBy(xpath = "//span[text()='Next']")
public WebElement nextButton;
@FindBy(xpath = "//span[@data-bind='text: element.warn']")
public WebElement errorMessage;
@FindAll(@FindBy(xpath = "//select[@id='PJF68Y3']/option"))
@CacheLookup
public List<WebElement> countryList;
}
