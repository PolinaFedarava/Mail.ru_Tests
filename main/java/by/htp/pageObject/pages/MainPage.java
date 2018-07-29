package by.htp.pageObject.pages;

import javax.naming.OperationNotSupportedException;

import by.htp.pageObject.driver.WebDriverWrapper;

public class MainPage extends AbstractPage {

	public MainPage(WebDriverWrapper driverWrapper) {
		super(driverWrapper);
	}

	@Override
	public void openPage() throws OperationNotSupportedException {
		throw new OperationNotSupportedException("Only for authorized users");

	}

}
