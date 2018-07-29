package by.htp.pageObject.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import by.htp.pageObject.driver.WebDriverWrapper;
import by.htp.pageObject.steps.CommonSteps;

public class BaseTest {
	protected WebDriverWrapper driverWrapper;
	protected CommonSteps steps;

	@BeforeSuite
	public void setUpTest() {
		driverWrapper = WebDriverWrapper.getInstance();
		steps = new CommonSteps(driverWrapper);
	}

	
	@AfterSuite
	public void CloseDriver() {
		WebDriverWrapper.stopWebDriver();
	}
}
