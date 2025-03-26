package com.Magento.Locaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartObjects {
@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']/a")
public WebElement cartLink;
@FindBy(xpath = "//strong[@class='product-item-name']/a[text()='Bella Tank']")
public WebElement bellaTank;
@FindBy(xpath = "//strong[@class='product-item-name']/a[text()='Radiant Tee']")
public WebElement radiantTee;
@FindBy(xpath = "//span[text()='$61.00']")
public WebElement price;

}
