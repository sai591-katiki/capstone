package com.Magento.StepDefnition;

import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Pages.CartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddingMultipleProductsStepDefnition {
	@And("user navigates to the url {string} webpage")
	public void user_navigates_to_the_url_webpage(String string) throws Exception {
	   
	    	Browser.navigateToUrl(string);
	    }

	@And("user clicks on the shopping cart")
	public void user_clicks_on_the_shopping_cart() {
	   
		   CartPage.cartClick();
	}

	@Then("user verifies the selected items {string}")
	public void user_verifies_the_selected_items(String string) {
	    
	    	Assert.assertEquals(CartPage.bellaTankMessage(), string);
	   
	}

	@And("user verifies {string}")
	public void user_verifies(String string) {
		
	    	Assert.assertEquals(CartPage.radiantTeeMessage(), string);
	}

	@And("user verifies the price is {string}")
	public void user_verifies_the_price_is(String string) throws InterruptedException {
	
	    	Assert.assertEquals(CartPage.priceGetting(), string);
	    
	}



}
