package com.Magento.StepDefnition;

import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Pages.MyAccountPage;
import com.Magento.Pages.SignInPage;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignOutPageStepDefnition  {
	@And("And navigate to the {string} homepage")
	public void and_navigate_to_the_homepage(String string) throws Exception {
	    
	    	Browser.navigateToUrl(string);
	   
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		
	    	SignInPage.signInClick();
	    
	}

	@When("user click on that menu icon")
	public void user_click_on_that_menu_icon() {
		
	    	MyAccountPage.iconClick();
	}

	@And("user clicks on the sign out option")
	public void user_clicks_on_the_sign_out_option() {
		
	    	MyAccountPage.signOutClick();
	    
	}

	@Then("user verifies that the session ends {string} and redirected to homepage")
	public void user_verifies_that_the_session_ends_and_redirected_to_homepage(String string) {
	
			Assert.assertEquals(MyAccountPage.myAccountText(), string);
	    
	}



}

