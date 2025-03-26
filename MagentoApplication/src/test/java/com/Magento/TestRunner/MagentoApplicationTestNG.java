package com.Magento.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.MagentoApllication.Feature",glue= {"com.Magento.StepDefnition","com.Magento.Hooks"},
plugin = {"pretty","html:target/cucumberreport/WholeReport.html"},monochrome = true)
public class MagentoApplicationTestNG extends AbstractTestNGCucumberTests {

}
