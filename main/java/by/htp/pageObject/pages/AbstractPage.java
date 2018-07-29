package by.htp.pageObject.pages;

import javax.naming.OperationNotSupportedException;

import org.openqa.selenium.WebDriver;

import by.htp.pageObject.driver.WebDriverWrapper;

public abstract class AbstractPage {
	
	protected WebDriverWrapper driverWrapper;

	public AbstractPage(WebDriverWrapper driverWrapper) {
		this.driverWrapper = driverWrapper;
	}
	
	public abstract void openPage() throws OperationNotSupportedException;

}
