package com.Magento.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.MagentoApllication.Feature\\LoginAndProductSearch.feature",glue= {"com.Magento.StepDefnition","com.Magento.Hooks"},
plugin = {"pretty","html:target/cucumberreport/ProductSearchandAddToCart.html"},monochrome = true)
public class ProductSearchAndAddToCartTestNG extends AbstractTestNGCucumberTests {

}
