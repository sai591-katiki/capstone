package com.Magento.Locaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageObjects {
@FindBy(id = "email")
public WebElement email;
@FindBy(id = "pass")
public WebElement password;
@FindBy(id = "send2")
public WebElement signIn;
@FindBy(xpath = "//div[text()='The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.']")
public WebElement errorMessage;
}
