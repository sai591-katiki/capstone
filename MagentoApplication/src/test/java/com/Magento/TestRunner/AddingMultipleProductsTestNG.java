package com.Magento.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.MagentoApllication.Feature\\AddingMultipleProducts.feature",glue= {"com.Magento.StepDefnition","com.Magento.Hooks"},
plugin = {"pretty","html:target/cucumberreport/AddingMultpleProducts.html"},monochrome = true)
public class AddingMultipleProductsTestNG extends AbstractTestNGCucumberTests{

}
