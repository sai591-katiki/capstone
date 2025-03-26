package com.Magento.Locaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageObjects {
@FindBy(id = "firstname")
public WebElement firstName;
@FindBy(id = "lastname")
public WebElement lastName;
@FindBy(xpath = "//input[@type='email']")
public WebElement email;
@FindBy(xpath = "//input[@id='password']")
public WebElement password;
@FindBy(xpath = "//input[@id='password-confirmation']")
public WebElement confirmPassword;
@FindBy(xpath = "//button[@title='Create an Account']")
public WebElement createAccount;
@FindBy(xpath = "//div[@id='email_address-error']")
public WebElement emailError;
}
