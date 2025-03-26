package com.Magento.StepDefnition;

import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Pages.HomePage;
import com.Magento.Pages.MyAccountPage;
import com.Magento.Pages.RegistrationPage;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationPageStepDefnition {
	@Given("user opens the browser")
	public void user_opens_the_browser() throws Exception {
	    
	         Browser.openBrowser();
		
	}

	@And("navigate to the {string} webpage")
	public void navigate_to_the_webpage(String string) {
	   
	    	
			try {
				Browser.navigateToUrl(string);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@When("user clicks on the Create an Account link")
	public void user_clicks_on_the_create_an_account_link() {
		
	     HomePage.createAnAccountLink();
		
	}

	@When("user enters {string} first name")
	public void user_enters_first_name(String string) {
		
	   RegistrationPage.enterFirstName(string);
	
	}
	@And("user enteres {string} last name")
	public void user_enteres_last_name(String string) {
		
			   RegistrationPage.enterLastName(string);
			
	  }

	@And("user enteres Invalid {string} Email")
	public void user_enteres_invalid_email(String string) {
		
			   RegistrationPage.enterEmail(string);
			
	}

	@And("user enteres {string} password")
	public void user_enteres_password(String string) {
	
			   RegistrationPage.enterPassword(string);
			
	}

	@And("user enteres {string} confirm password")
	public void user_enteres_confirm_password(String string) {
		
			   RegistrationPage.enterConfirmPassword(string);
			
	}

	@And("user clicks on Create an Account button")
	public void user_clicks_on_create_an_account_button() {
		
			   RegistrationPage.createAnAccountButton();
			
	}

	@Then("user verifies the {string} message appears under the email textbox")
	public void user_verifies_the_message_appears_under_the_email_textbox(String string) {
	    
	    	Assert.assertEquals(RegistrationPage.errorMessage(), string);
	   	}

	@When("user enters valid {string} Email")
	public void user_enters_valid_email(String string) {
		
			   RegistrationPage.enterEmail(string);
			
	}

	@Then("user verifies the thank you {string} in next page")
	public void user_verifies_the_thank_you_in_next_page(String string) {
	
	    	Assert.assertEquals(MyAccountPage.registrationText(),string);
	  
	}

	@And("close the browser")
	public void close_the_browser() {
		
	   Browser.closeBrowser();
	
	}
}
