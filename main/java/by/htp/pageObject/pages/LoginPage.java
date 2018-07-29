package by.htp.pageObject.pages;

import org.openqa.selenium.WebElement;

import by.htp.pageObject.driver.WebDriverWrapper;

public class LoginPage extends AbstractPage {

	private static final String URL = "https://mail.ru/";
	private WebElement loginField;
	private WebElement containerField;
	private WebElement passwordField;
	WebElement submitField;
	WebElement buttonSend;

	public LoginPage(WebDriverWrapper driverWrapper) {
		super(driverWrapper);
	}

	@Override
	public void openPage() {
		driverWrapper.openPage(URL);

	}

	public void logIn(String login, String pass) {

		String elementId1 = "mailbox:login";

		// loginField = driverWrapper.findByName("loginForm.login");
		loginField = driverWrapper.findId(elementId1);
		loginField.sendKeys(login);

		String elementXpath1 = "//*[@id='mailbox:domain']/option[1]";
		// containerField =
		// driverWrapper.findByXpath("//*[@id='mailbox:domain']/option[1]");
		containerField = driverWrapper.findByXpath(elementXpath1);
		containerField.click();

		String elementId2 = "mailbox:password";
		// passwordField = driverWrapper.findId("mailbox:password");
		passwordField = driverWrapper.findId(elementId2);
		passwordField.click();
		passwordField.sendKeys(pass);

		String elementXpath2 = "//*[@id='mailbox:submit']/input";
		// //submitField = driverWrapper.findByXpath("//*[@id='mailbox:submit']/input");
		submitField = driverWrapper.findByXpath(elementXpath2);
		submitField.click();
	}

}
