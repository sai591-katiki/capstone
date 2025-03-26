package com.Magento.Hooks;

import com.Magento.Browser.Browser;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks extends Browser{
@BeforeAll
public static void initializeExtent(){
	Browser.init("ExtentReports");
}
@Before
public static void creatingExtentTest(Scenario scenario) {
	logger1=extent.createTest(scenario.getName());
}
@After
public static void flush() {
	extent.flush();
}
}
