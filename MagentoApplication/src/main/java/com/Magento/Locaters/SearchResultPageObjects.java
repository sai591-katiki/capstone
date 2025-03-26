package com.Magento.Locaters;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SearchResultPageObjects {

@FindAll(@FindBy(xpath = "//ol[@class='products list items product-items']/li"))
@CacheLookup
public List<WebElement> productList;
@FindAll(@FindBy(xpath = "//div[@aria-labelledby='option-label-size-143']/div"))
@CacheLookup
public List<WebElement> sizeList;
@FindAll(@FindBy(xpath = "//div[@aria-labelledby='option-label-color-93']/div"))
@CacheLookup
public List<WebElement> colorList;
@FindBy(id = "qty")
public WebElement quantity;
@FindBy(xpath = "//span[text()='Add to Cart']")
public WebElement addToCartButton;
@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
public WebElement addedMessage;
}
