package com.Magento.StepDefnition;

import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Pages.MyAccountPage;
import com.Magento.Pages.SignInPage;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageStepDefnition {
	@And("user enteres {string} email")
	public void user_enteres_email(String string) {
		
	    SignInPage.emailEnter(string);
		
	}

	@And("user enteres wrong {string} password")
	public void user_enteres_wrong_password(String string) {
		
		    SignInPage.passwordEnter(string);
			
	}

	@Then("user verifies the error message {string} appears")
	public void user_verifies_the_error_message_appears(String string) {
		
		    Assert.assertEquals(SignInPage.errorAfterSignIn(), string);
			
	}

	@When("user enters correct {string} password")
	public void user_enters_correct_password(String string) {
		
		SignInPage.passwordEnter(string);
			
	}

	@And("users verifies {string} is displayed after successful sign in")
	public void users_verifies_is_displayed_after_successful_sign_in(String string) {
	
		    Assert.assertEquals(MyAccountPage.myAccountMessage(),string);
			
	}
}
