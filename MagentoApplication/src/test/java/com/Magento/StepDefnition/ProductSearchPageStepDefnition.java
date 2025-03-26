package com.Magento.StepDefnition;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Pages.HomePage;
import com.Magento.Pages.SearchPage;
import com.Magento.Pages.SearchResultPage;
import com.Magento.Pages.SignInPage;
import com.aventstack.extentreports.Status;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSearchPageStepDefnition extends Browser{
	public static List<List<String>> credentials(String excelFilePath) throws Exception {
		List<List<String>> credentials = new ArrayList<>();
		FileInputStream file = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			List<String> rowData = new ArrayList<>();
			if(row!=null) {
				for(int j=0;j<row.getLastCellNum();j++) {
					Cell cell=row.getCell(j);
					if(cell!=null) {
						rowData.add(cell.getStringCellValue());
					}else {
						rowData.add("");
					}
				}
			}
		credentials.add(rowData);
		}
	workbook.close();
	return credentials;
	}
	@And("And navigate to the {string} webpage")
	public void and_navigate_to_the_webpage(String string) throws Exception {
	    Browser.navigateToUrl(string);
	}

	@When("user clicks on signin link")
	public void user_clicks_on_signin_link() {
	    
	    	HomePage.signInLink();
	    
	}

	@And("user enters the Login credentials")
	public void user_enters_the_login_credentials(io.cucumber.datatable.DataTable dataTable) throws Exception  {
		List<List<String>> credentials;
		
			credentials = credentials(
					"C:\\Users\\SAI  KATIKI\\eclipse-workspace\\MagentoApplication\\src\\test\\resources\\Logindata.xlsx");
		 dataTable = DataTable.create(credentials);
		System.out.println(dataTable.cell(0, 0));
		System.out.println(dataTable.cell(0, 1));
		SignInPage.emailEnter(dataTable.cell(0, 0));
		SignInPage.passwordEnter(dataTable.cell(0, 1));
		
	}

	@And("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
	
	    SignInPage.signInClick();
		
	}

	@And("user enters {string} in search box")
	public void user_enters_in_search_box(String string) {
	
	    SearchPage.enterSearch(string);
		
	}

	@And("user selects {string} option")
	public void user_selects_option(String string) throws InterruptedException {
		
		    SearchPage.searchList(string);
			
	}

	@And("user selects a product {string} from the search result page")
	public void user_selects_a_product_from_the_search_result_page(String string) {
		
		    SearchResultPage.productClick(string);
			
	}

	@And("user selects the size is {string}")
	public void user_selects_the_size_is(String string) {
		
		    SearchResultPage.sizeClick(string);
			
	}

	@And("user selects the colour is {string}")
	public void user_selects_the_colour_is(String string) {
		
		    SearchResultPage.colorClick(string);
			
	}

	@And("user enters the quantity is {string}")
	public void user_enters_the_quantity_is(String string) {
		
		    SearchResultPage.enterQuantity(string);
			
	}

	@And("user click on Add to Cart button")
	public void user_click_on_add_to_cart_button() {
		
		    SearchResultPage.addToCart();
			
	}

	@Then("user verifies the {string} message")
	public void user_verifies_the_message(String string) {
		
		    Assert.assertEquals(SearchResultPage.addedMessage(), string);
			
	}

	@And("user closes the browser")
	public void user_closes_the_browser() {
		
		    Browser.closeBrowser();
			
	}

}
