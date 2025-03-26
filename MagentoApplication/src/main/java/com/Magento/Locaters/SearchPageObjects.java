package com.Magento.Locaters;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SearchPageObjects {
@FindBy(id = "search")
public WebElement searchBox;
@FindAll(@FindBy(xpath = "//ul[@role='listbox']/li"))
@CacheLookup
public List<WebElement> searchlist;
}
